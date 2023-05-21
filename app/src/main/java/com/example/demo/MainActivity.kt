package com.example.demo

import HarvestyearDatabase
import WinegrowerPofileDAO
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.tasks.await
import android.widget.Button
import android.widget.EditText
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.*
import org.w3c.dom.Text
//import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val logIn = LogIn(application)
        logIn.login("asd@gmail.com", "asdasd")
        val scope = CoroutineScope(newSingleThreadContext("name"))

            scope.launch {  test() }

        }

         */
        findViewById<Button>(R.id.btnTest).setOnClickListener {
           runBlocking {
               withContext(Dispatchers.IO) {
                var winegrowerProfile = WinegrowerPofileDAO().getWinegrowerProfile("z4e9EBfSp1JhYD4bVmcJ")
                  Log.d("test", winegrowerProfile.name)


           }

           }
        }

    }


    }



