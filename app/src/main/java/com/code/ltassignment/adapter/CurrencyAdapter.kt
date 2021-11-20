package com.code.ltassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.code.ltassignment.R
import com.code.ltassignment.models.CurrencyModel

class CurrencyAdapter() : RecyclerView.Adapter<CurrencyAdapter.ContactHolder>() {
    // List to store all the contact details
    private var currencyModelList: ArrayList<CurrencyModel>? = null
    private var mContext: Context? = null

    // Counstructor for the Class
    constructor(currencyModelList: ArrayList<CurrencyModel>?, context: Context?) : this() {
        this.currencyModelList = currencyModelList
        mContext = context
    }

    // This method creates views for the RecyclerView by inflating the layout
    // Into the viewHolders which helps to display the items in the RecyclerView
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): ContactHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        // Inflate the layout view you have created for the list rows here
        val view: View = layoutInflater.inflate(R.layout.item_currency, parent, false)
        return ContactHolder(view)
    }

    override fun getItemCount(): Int {
        return currencyModelList?.size ?: 0
    }

    // This method is called when binding the data to the views being created in RecyclerView
    override fun onBindViewHolder(@NonNull holder: ContactHolder, position: Int) {
        currencyModelList?.let {
            val currencyModel: CurrencyModel = it[position]

            // Set the data to the views here
            holder.setCountryName(currencyModel.countryName)
            holder.setCurrencyValue(currencyModel.currencyValue)

            // You can set click listners to indvidual items in the viewholder here
            // make sure you pass down the listner or make the Data members of the viewHolder public
        }

    }

    // This is your ViewHolder class that helps to populate data to the view
    inner class ContactHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvCountryName: TextView
        private val tvCurrency: TextView
        fun setCountryName(name: String?) {
            tvCountryName.text = name
        }

        fun setCurrencyValue(number: String?) {
            tvCurrency.text = number
        }
        init {
            tvCountryName = itemView.findViewById(R.id.tvCountry)
            tvCurrency = itemView.findViewById(R.id.tvCurrency)
        }
    }
}