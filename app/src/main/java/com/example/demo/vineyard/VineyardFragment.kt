package com.example.demo.vineyard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R
import com.example.demo.basicInfo.BasicInfoFragmentDirections
import com.example.demo.databinding.FragmentVineyardBinding

class VineyardFragment : Fragment() {

    private val viewModel: VineyardVM by viewModels()
    //private lateinit var adapter: VineyardAdapter
    lateinit var binding: FragmentVineyardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_vineyard, container, false)

        binding.viewModel = viewModel

        viewModel.navigateToYard.observe(viewLifecycleOwner, Observer {
            if (it) {
                findNavController().navigate(VineyardFragmentDirections.actionVineyardFragmentToYardFragment())
                viewModel.navigtionFinished()

            }
        })

        //binding.vineyardRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        //binding.vineyardRecyclerView.adapter = adapter
        return binding.root
    }

    fun setAdapter(adapter: VineyardAdapter) {
        //this.adapter = adapter
    }
}
