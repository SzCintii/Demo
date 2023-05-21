package com.example.demo

import WinegrowerPofileDAO
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BasicInfoVM : ViewModel() {
    init {
        viewModelScope. launch {
            var newWinegrowerProfileDAO = WinegrowerPofileDAO().getWinegrowerProfile("ZMOK6WP9W3DoLCpDuvcm")
            Log.d("test", newWinegrowerProfileDAO.name)
        }
    }
}