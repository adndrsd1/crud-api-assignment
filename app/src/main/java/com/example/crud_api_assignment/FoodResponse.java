package com.example.crud_api_assignment;

import java.util.List;

public class FoodResponse<T> {
    List<T> result;
    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
