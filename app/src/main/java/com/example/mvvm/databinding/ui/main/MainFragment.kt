package com.example.mvvm.databinding.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.mvvm.databinding.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.getCounterMan().observe(this, Observer {
            tv_counter_man.text = "$it"
        })
        btn_add_man.setOnClickListener {
            viewModel.addCounterMan()
        }
        btn_minus_man.setOnClickListener {
            viewModel.reduceCounterMan()
        }
        viewModel.getCounterWoman().observe(this, Observer {
            tv_counter_woman.text = "$it"
        })
        btn_add_woman.setOnClickListener {
            viewModel.addCounterWoman()
        }
        btn_minus_woman.setOnClickListener {
            viewModel.reduceCounterWoman()
        }
        viewModel.getCounterKid().observe(this, Observer {
            tv_counter_kids.text = "$it"
        })
        btn_add_kids.setOnClickListener {
            viewModel.addCounterKid()
        }
        btn_minus_kids.setOnClickListener {
            viewModel.reduceCounterKid()
        }
    }
}
