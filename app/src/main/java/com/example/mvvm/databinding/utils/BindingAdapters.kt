package com.example.mvvm.databinding.utils

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer


@BindingAdapter("app:textFromInt")
fun setImmutableText(view: TextView, int: Int) {
    view.text = int.toString()
}