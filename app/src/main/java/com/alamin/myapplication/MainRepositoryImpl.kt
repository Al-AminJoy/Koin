package com.alamin.myapplication

class MainRepositoryImpl(private val api:ApiInterface): MainRepository {
    override suspend fun doNetworkCall() {
        api.callApi()
    }
}