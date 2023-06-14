package com.example.demo.vineyard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VineyardVM:ViewModel() {

    private var _navigateToYard=MutableLiveData<Boolean>()
    val navigateToYard : LiveData<Boolean>
        get() {
            return _navigateToYard
        }

    init {
        _navigateToYard.value = false
    }

    fun buttonNavigateToYardClicked(){
        _navigateToYard.value = true
    }
    fun navigtionFinished() {
        _navigateToYard.value = false
    }
}