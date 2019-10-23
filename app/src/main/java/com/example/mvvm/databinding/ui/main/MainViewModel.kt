package com.example.mvvm.databinding.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val counterWoman = MutableLiveData<Int>().apply {
        value = 0
    }
    private val counterMan = MutableLiveData<Int>().apply {
        value = 0
    }

    private val counterKid = MutableLiveData<Int>().apply {
        value = 0
    }

    fun addCounterWoman() {
        counterWoman.value = (counterWoman.value ?: 0) + 1
    }

    fun reduceCounterWoman() {
        if (counterWoman.value ?: 0 > 0) {
            counterWoman.value = (counterWoman.value ?: 0) - 1
        }
    }

    fun getCounterWoman(): LiveData<Int> {
        return counterWoman
    }

    fun addCounterMan() {
        counterMan.value = (counterMan.value ?: 0) + 1
    }

    fun reduceCounterMan() {
        if (counterMan.value ?: 0 > 0) {
            counterMan.value = (counterMan.value ?: 0) - 1
        }
    }

    fun getCounterMan(): LiveData<Int> {
        return counterMan
    }

    fun addCounterKid() {
        counterKid.value = (counterKid.value ?: 0) + 1
    }

    fun reduceCounterKid() {
        if (counterKid.value ?: 0 > 0) {
            counterKid.value = (counterKid.value ?: 0) - 1
        }
    }

    fun getCounterKid(): LiveData<Int> {
        return counterKid
    }
}
