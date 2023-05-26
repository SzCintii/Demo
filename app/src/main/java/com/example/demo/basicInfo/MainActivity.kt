package com.example.demo.basicInfo

import WinegrowerPofileDAO
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R
import com.example.demo.cellar.BatchesAdapter
import com.example.demo.cellar.BatchesFragment
import com.example.demo.vineyard.VineyardAdapter
import com.example.demo.vineyard.VineyardFragment
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase
import com.example.demo.databinding.ActivityMainBinding




import kotlinx.coroutines.*

//import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var batchesAdapter: BatchesAdapter
    private lateinit var vineyardAdapter: VineyardAdapter
    //private lateinit var mainAct: MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this  // Add this line to observe data binding updates

        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        batchesAdapter = BatchesAdapter(getBatchData())
        vineyardAdapter = VineyardAdapter(getVineyardData())

        recyclerView.adapter = batchesAdapter
    }


    private fun getBatchData(): List<String> {
        return listOf("Batch 1", "Batch 2", "Batch 3")
    }

    private fun getVineyardData(): List<String> {
        return listOf("Vinegrower 1", "Vinegrower 2", "Vinegrower 3")
    }

    fun navigateToBatchesFragment() {
        val batchesFragment = BatchesFragment()
        batchesFragment.setAdapter(batchesAdapter)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, batchesFragment)
            .commit()
    }

    /*fun navigateToVineyardFragment() {
        val vineyardFragment = VineyardFragment()
        vineyardFragment.setAdapter(vineyardAdapter)
        supportFragmentManager.beginTransaction()
            .replace
    }*/

}




