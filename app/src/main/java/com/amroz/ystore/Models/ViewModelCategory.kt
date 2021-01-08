package com.amroz.ystore.Models

import com.amroz.ystore.GsonData.CategoryFetcher
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class ViewModelCategory: ViewModel() {

    val categoryLiveData = MutableLiveData<Int>()
     var fetchCategory: LiveData<List<Category>> = CategoryFetcher().fetchCategory()

    fun ViewModelCategory(id: Int) {
        categoryLiveData.value=id
    }

}