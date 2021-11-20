package com.code.ltassignment.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.code.ltassignment.R

/**
 * This method will add fragment into stack
 * */
fun AppCompatActivity.addFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction().apply {
        add(R.id.fragmentContainer, fragment, fragment.javaClass.canonicalName)
        addToBackStack(fragment.javaClass.canonicalName)
            .commit()
    }
}