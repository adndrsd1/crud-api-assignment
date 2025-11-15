package com.example.crud_api_assignment;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    MyFood myFood;
    FoodAdapter foodAdapter;
    RecyclerView rv_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_food = findViewById(R.id.rv_food);

        myFood = new MyFood(this);

        rv_food.setHasFixedSize(true);
        rv_food.setLayoutManager(new LinearLayoutManager(this));
        foodAdapter = new FoodAdapter(myFood);
        rv_food.setAdapter(foodAdapter);

        getDataFood();
    }

    public void getDataFood() {
        myFood.getInstance().getFood().enqueue(new Callback<FoodResponse<FoodItem>>() {
            @Override
            public void onResponse(Call<FoodResponse<FoodItem>> call, Response<FoodResponse<FoodItem>> response) {
                FoodResponse<FoodItem> resp = response.body();

                if (resp.getResult() != null && resp.getResult().size() > 0) {
                    foodAdapter = new FoodAdapter(resp.getResult(), MainActivity.this);
                    rv_food.setAdapter(foodAdapter);
                }
            }

            @Override
            public void onFailure(Call<FoodResponse<FoodItem>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}