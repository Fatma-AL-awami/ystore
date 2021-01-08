package com.amroz.ystore.GsonData

import Api.StoreApi
import Models.Users
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserFetcher {

    private val storeApi: StoreApi = TODO()

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        storeApi = retrofit.create(StoreApi::class.java)
    }

    fun fetchUsers(): LiveData<List<Users>> {
        val responseLiveData: MutableLiveData<List<Users>> = MutableLiveData()
        val userRequest: Call<UserResponse> = storeApi.fetchUsers()

        userRequest.enqueue(object : Callback<UserResponse> {

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("fetch", "Failed to fetch ",t)
            }

            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                TODO("Not yet implemented")
            }
        })

        return responseLiveData
    }


    fun fetchProfileUser(id:Int): LiveData<Users> {
        val responseLiveData: MutableLiveData<Users> = MutableLiveData()
        val UserRequest: Call<UserResponse> = storeApi.fetchProfileUser(id)

        UserRequest.enqueue(object : Callback<UserResponse> {

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("fetchDetails", "Failed to fetch Details",t)
            }

            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                TODO("Not yet implemented")
            }
        })

        return responseLiveData
    }
}


