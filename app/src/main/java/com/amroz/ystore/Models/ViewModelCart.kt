package com.amroz.ystore.Models

import com.amroz.ystore.GsonData.CartFetcher
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class ViewModelCart: ViewModel() {

    val cartLiveData= MutableLiveData<Int>()
     var fetchCart: LiveData<List<Category>> = CartFetcher().fetchCart()

}