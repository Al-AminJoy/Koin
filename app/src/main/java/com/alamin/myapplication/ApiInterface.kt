package com.alamin.myapplication

import retrofit2.http.GET

interface ApiInterface {
    @GET("my/endpoint")
    fun callApi()
}