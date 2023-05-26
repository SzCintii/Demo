package com.example.demo.cellar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R

class BatchesFragment : Fragment() {

    private lateinit var batchesAdapter: BatchesAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_batches, container, false)

        recyclerView = view.findViewById(R.id.batchesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = batchesAdapter
        return view
        //val batchItems = listOf("Batch 1", "Batch 2", "Batch 3")
        //batchesAdapter = BatchesAdapter(batchItems)
        //recyclerView.adapter = batchesAdapter
    }
    fun setAdapter(adapter: BatchesAdapter){
        this.batchesAdapter = adapter
    }
}