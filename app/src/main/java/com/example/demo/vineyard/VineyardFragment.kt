package com.example.demo.vineyard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R

class VineyardFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: VineyardAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_vineyard, container, false)
        recyclerView = view.findViewById(R.id.vineyardRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        return view
    }

    fun setAdapter(adapter: VineyardAdapter) {
        this.adapter = adapter
    }
}
