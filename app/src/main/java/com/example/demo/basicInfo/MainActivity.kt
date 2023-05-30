package com.example.demo.basicInfo

import WinegrowerPofileDAO
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
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

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    }
// Add any other functions and logic specific to the MainActivity here

    /*fun navigateToVineyardFragment() {
        val vineyardFragment = VineyardFragment()
        vineyardFragment.setAdapter(vineyardAdapter)
        supportFragmentManager.beginTransaction()
            .replace
    }*/






