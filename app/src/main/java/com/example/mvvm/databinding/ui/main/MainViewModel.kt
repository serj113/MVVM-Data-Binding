package com.example.mvvm.databinding.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.databinding.model.Counter

class MainViewModel : ViewModel() {

    private val counter = Counter()

    private val counterWoman = MutableLiveData<Int>().apply {
        value = 0
    }
    private val counterMan = MutableLiveData<Int>().apply {
        value = 0
    }

    private val counterKid = MutableLiveData<Int>().apply {
        value = 0
    }

    fun addCounterMan() {
        counter.addMan()
        counterMan.value = counter.man
    }

    fun reduceCounterMan() {
        counter.reduceMan()
        counterMan.value = counter.man
    }

    fun getCounterMan(): LiveData<Int> {
        return counterMan
    }

    fun addCounterWoman() {
        counter.addWoman()
        counterWoman.value = counter.woman
    }

    fun reduceCounterWoman() {
        counter.reduceWoman()
        counterWoman.value = counter.woman
    }

    fun getCounterWoman(): LiveData<Int> {
        return counterWoman
    }

    fun addCounterKid() {
        counter.addKid()
        counterKid.value = counter.kid
    }

    fun reduceCounterKid() {
        counter.reduceKid()
        counterKid.value = counter.kid
    }

    fun getCounterKid(): LiveData<Int> {
        return counterKid
    }
}
