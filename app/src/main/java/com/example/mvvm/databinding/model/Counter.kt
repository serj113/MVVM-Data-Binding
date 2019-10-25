package com.example.mvvm.databinding.model

class Counter {
    var man = 0
    var woman = 0
    var kid = 0

    fun addMan() {
        man += 1
    }

    fun reduceMan() {
        if (man > 0) {
            man -= 1
        }
    }

    fun addWoman() {
        woman += 1
    }

    fun reduceWoman() {
        if (woman > 0) {
            woman -= 1
        }
    }

    fun addKid() {
        kid += 1
    }

    fun reduceKid() {
        if (kid > 0) {
            kid -= 1
        }
    }
}
