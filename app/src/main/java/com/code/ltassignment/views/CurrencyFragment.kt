package com.code.ltassignment.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.code.ltassignment.R
import com.code.ltassignment.adapter.CurrencyAdapter
import com.code.ltassignment.base.BaseFragment
import com.code.ltassignment.models.CurrencyModel
import com.code.ltassignment.viewmodel.CurrencyViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_currency.*

@AndroidEntryPoint
class CurrencyFragment : BaseFragment() {
    private val viewModel: CurrencyViewModel by viewModels()
    private var currencyAdapter: CurrencyAdapter? = null
    companion object {
        fun newInstance() = CurrencyFragment()
    }

    override fun setUpToolbar() {
        updateToolbar(getString(R.string.currency_screen_title))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_currency, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpToolbar()
        getCurrencyData()
        //initialization()
    }

    private fun getCurrencyData() {
        viewModel.getCurrencyApi()
    }

    private fun initialization() {
        currencyAdapter = CurrencyAdapter(ArrayList<CurrencyModel>(), requireContext())
        currencyRecycler.adapter = currencyAdapter
    }
}