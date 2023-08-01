package com.aliozdemir.easyfood.retrofit

import com.aliozdemir.easyfood.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {

    @GET("random.php")
    fun getRandomMeal() : Call<MealList>
}