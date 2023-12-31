package com.aliozdemir.easyfood.retrofit

import com.aliozdemir.easyfood.pojo.CategoryList
import com.aliozdemir.easyfood.pojo.MealsByCategoryList
import com.aliozdemir.easyfood.pojo.MealList
import com.aliozdemir.easyfood.pojo.MealsByCategory
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {

    @GET("random.php")
    fun getRandomMeal() : Call<MealList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i") id: String) : Call<MealList>

    @GET("filter.php?")
    fun getPopularItems(@Query("c") categoryName: String) : Call<MealsByCategoryList>

    @GET("categories.php")
    fun getCategories() : Call<CategoryList>

    @GET("filter.php")
    fun getMealsByCategory(@Query("c") categoryName: String) : Call<MealsByCategoryList>
}