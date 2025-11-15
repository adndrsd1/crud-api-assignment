package com.example.crud_api_assignment;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodApi {
    @GET("foods.json")
    Call<FoodResponse<FoodItem>> getFood();
}
