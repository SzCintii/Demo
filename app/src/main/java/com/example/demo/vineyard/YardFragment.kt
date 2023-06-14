package com.example.demo.vineyard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.demo.R
import com.example.demo.databinding.FragmentVineyardBinding
import com.example.demo.databinding.FragmentYardBinding


class YardFragment : Fragment() {

    private val viewModel: VineyardVM by viewModels()
    lateinit var binding: FragmentYardBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_yard, container, false)

        //binding.viewModel = viewModel


        return binding.root
    }



}