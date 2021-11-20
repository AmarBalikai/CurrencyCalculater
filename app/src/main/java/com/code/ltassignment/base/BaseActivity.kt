package com.code.ltassignment.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.code.ltassignment.R

abstract class BaseActivity:AppCompatActivity() {
    private lateinit var toolbar: Toolbar

    fun setToolbar()
    {
        toolbar=findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
}