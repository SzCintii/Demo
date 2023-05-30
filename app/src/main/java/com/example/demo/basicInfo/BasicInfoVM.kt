package com.example.demo.basicInfo

import WinegrowerPofileDAO
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BasicInfoVM : ViewModel() {
    private var _navigateToCellar= MutableLiveData<Boolean>()
    val navigateToCellar : LiveData<Boolean>
        get() {
            return _navigateToCellar
        }
    private var _navigateToVineyard= MutableLiveData<Boolean>()
    val navigateToVineyard : LiveData<Boolean>
        get() {
            return _navigateToVineyard
        }

    init {
        _navigateToCellar.value = false
        _navigateToVineyard.value = false
    }

    fun buttonNavigateToCellarClicked(){
        _navigateToCellar.value = true
    }

    fun buttonNavigateToVineyardClicked(){
        _navigateToVineyard.value = true
    }
}