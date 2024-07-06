package com.alamin.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

private const val TAG = "MainViewModel"

class MainViewModel(private val repository:MainRepository):ViewModel() {

    fun requestNetwork(){
        viewModelScope.launch {
            //repository.doNetworkCall()
            Log.d(TAG, "requestNetwork: ")
        }
    }
}