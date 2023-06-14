package com.example.demo.basicInfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R
import com.example.demo.cellar.BatchesAdapter
import com.example.demo.cellar.BatchesFragment
import com.example.demo.vineyard.VineyardAdapter
import com.example.demo.databinding.FragmentBasicInfoBinding


class BasicInfoFragment : Fragment() {

    private val viewModel: BasicInfoVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBasicInfoBinding.inflate(layoutInflater)
        binding.viewModel=viewModel

        viewModel.navigateToCellar.observe(viewLifecycleOwner, Observer {
            if (it) {
                findNavController().navigate(BasicInfoFragmentDirections.actionBasicInfoFragmentToBatchesFragment())
                viewModel.navigtionFinished()

            }
        })
        viewModel.navigateToVineyard.observe(viewLifecycleOwner, Observer {
            if (it) {
                findNavController().navigate(BasicInfoFragmentDirections.actionBasicInfoFragmentToVineyardFragment())
                viewModel.navigtionFinished()
            }
        })
        return binding.root
    }

}