package com.amroz.ystore.Models

import com.amroz.ystore.GsonData.ProductFetcher
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class ViewModelProduct: ViewModel() {
     val productLiveData = MutableLiveData<Int>()
     lateinit var fetchProd: LiveData<Products>

     init {
         fetchProd = ProductFetcher().fetchProduct()


         var fetchProdDetails: LiveData<Products>? =
             Transformations.switchMap(productLiveData) { id ->
                 ProductFetcher().fetchDetailsProduct(id)
             }


         var fetchProductid: LiveData<Products>? =
             Transformations.switchMap(productLiveData) { id ->
                 ProductFetcher().fetchProductid(id)
             }

         fun productLiveData(id: Int) {
             productLiveData.value = id
         }
     }
 }