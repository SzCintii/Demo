package com.example.demo.cellar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.demo.R
import com.example.demo.databinding.FragmentBatchesBinding
import com.example.demo.databinding.FragmentCellarBinding

class CellarFragment : Fragment() {

    private val viewModel: CellarVM by viewModels()
    lateinit var binding: FragmentCellarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_cellar, container, false)

        binding.viewModel = viewModel



        return binding.root
    }


}