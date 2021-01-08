package com.amroz.ystore.GsonData

import Api.StoreApi
import Models.Category
import Models.Users
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback

class CartFetcher {

    private val storeApi: StoreApi = TODO()

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        storeApi = retrofit.create(StoreApi::class.java)
    }

    fun fetchCart(): LiveData<List<Category>> {
        val responseLiveData: MutableLiveData<List<Category>> = MutableLiveData()
        val catRequest: Call<CategoryResponse> = storeApi.fetchCategory()

        catRequest.enqueue(object : Callback<CategoryResponse> {

            override fun onFailure(call: Call<CategoryResponse>, t: Throwable) {
                Log.e("fetchcart", "Failed to fetch ",t)
            }

            override fun onResponse(call: Call<CategoryResponse>,

                response: Response<CategoryResponse>
            ) {
                TODO("Not yet implemented")
            }
        })

       return responseLiveData
    }
}


