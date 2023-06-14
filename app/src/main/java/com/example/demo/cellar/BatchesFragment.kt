package com.example.demo.cellar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R
import com.example.demo.basicInfo.BasicInfoFragmentDirections
import com.example.demo.databinding.FragmentBatchesBinding
import com.example.demo.databinding.FragmentVineyardBinding
import com.example.demo.vineyard.VineyardAdapter
import com.example.demo.vineyard.VineyardVM

class BatchesFragment : Fragment() {

    private val viewModel: BatchesVM by viewModels()
    //private lateinit var adapter: VineyardAdapter
    lateinit var binding: FragmentBatchesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_batches, container, false)

        binding.viewModel = viewModel

        viewModel.navigateToCellar.observe(viewLifecycleOwner, Observer {
            if (it) {
                findNavController().navigate(BatchesFragmentDirections.actionBatchesFragmentToCellarFragment())
                viewModel.navigtionFinished()

            }
        })


        //binding.batchesRecyclerView.adapter = adapter
        return binding.root
    }

    fun setAdapter(adapter: VineyardAdapter) {
        //this.adapter = adapter
    }
}