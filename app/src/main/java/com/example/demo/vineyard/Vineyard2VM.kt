package com.example.demo.vineyard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Vineyard2VM:ViewModel() {

    private var _navigateToYard= MutableLiveData<Boolean>()
    val navigateToParcel : LiveData<Boolean>
        get() {
            return _navigateToYard
        }

    init {
        _navigateToYard.value = false
    }

    fun buttonNavigateToParcelClicked(){
        _navigateToYard.value = true
    }

}