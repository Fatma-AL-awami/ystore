package com.amroz.ystore.GsonData


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.amroz.ystore.Api.StoreApi
import com.amroz.ystore.Models.Category
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback

class CategoryFetcher {

    private val storeApi: StoreApi = TODO()

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        storeApi = retrofit.create(StoreApi::class.java)
    }

    fun fetchCategory(): LiveData<List<Category>> {
        val responseLiveData: MutableLiveData<List<Category>> = MutableLiveData()
        val catRequest: Call<CategoryResponse> = storeApi.fetchCategory()

        catRequest.enqueue(object : Callback<CategoryResponse> {

            override fun onFailure(call: Call<CategoryResponse>, t: Throwable) {
                Log.e("fetchcat", "Failed to fetch ",t)
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


