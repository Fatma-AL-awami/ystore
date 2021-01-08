package com.amroz.ystore.Api

import com.amroz.ystore.GsonData.CategoryResponse
import com.amroz.ystore.GsonData.ProductResponse
import com.amroz.ystore.GsonData.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface StoreApi {

    @GET("")
    fun fetchUsers(): Call<UserResponse>

    @GET("")
    fun fetchProduct(): Call<ProductResponse>
    @GET("")
    fun fetchCategory(): Call<CategoryResponse>

    @GET("")
    fun fetchCart(): Call<CategoryResponse>

    @GET("")
    fun fetchProfileUser(@Query("id") id: Int): Call<UserResponse>

    @GET("")
    fun fetchDetailsProduct(@Query("id") id: Int): Call<ProductResponse>
    @GET("")
    fun fetchElectronic(@Query("id") id: Int): Call<ProductResponse>
    @GET("")
    fun fetchCloths(@Query("id") id: Int): Call<ProductResponse>
    @GET("")
    fun fetchJewllery(@Query("id") id: Int): Call<ProductResponse>


}
