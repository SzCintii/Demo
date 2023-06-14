package com.example.demo.cellar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BatchesVM: ViewModel() {

    private var _navigateToCellar= MutableLiveData<Boolean>()
    val navigateToCellar : LiveData<Boolean>
        get() {
            return _navigateToCellar
        }

    init {
        _navigateToCellar.value = false
    }

    fun buttonNavigateToCellarClicked(){
        _navigateToCellar.value = true
    }

    fun navigtionFinished() {
        _navigateToCellar.value = false
    }
}