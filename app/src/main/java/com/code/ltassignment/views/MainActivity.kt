package com.code.ltassignment.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.code.ltassignment.adapter.CurrencyAdapter
import com.code.ltassignment.base.BaseActivity
import com.code.ltassignment.databinding.ActivityMainBinding
import com.code.ltassignment.extensions.addFragment
import com.code.ltassignment.models.CurrencyModel
import com.code.ltassignment.viewmodel.CurrencyViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addDefaultFragment()
    }

    private fun addDefaultFragment() {
        addFragment(CurrencyFragment.newInstance())
    }


}