package com.example.crud_api_assignment;

import android.content.Context;

public class MyFood {
    FoodApi foodApi;

    public MyFood(Context context) {
        foodApi = RetrofitBuilder
                .builder(context)
                .create(FoodApi.class);
    }

    public FoodApi getInstance() {
        return foodApi;
    }
}
