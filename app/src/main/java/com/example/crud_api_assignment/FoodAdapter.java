package com.example.crud_api_assignment;

import androidx.recyclerview.widget.RecyclerView;

import org.jspecify.annotations.NonNull;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    List<FoodItem> result;
    Activity activity;

    public FoodAdapter(List<FoodItem> result, Activity activity) {
        this.result = result;
        this.activity = activity;
    }

    public FoodAdapter(MyFood myFood) {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder
}
