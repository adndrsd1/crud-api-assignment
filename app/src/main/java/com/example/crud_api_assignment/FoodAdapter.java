package com.example.crud_api_assignment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jspecify.annotations.NonNull;

import java.util.List;

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
    public ViewHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item_food, parent, false));
    }

    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull ViewHolder holder, int
            position) {
        holder.bind(result.get(position));
    }

    @Override
    public int getItemCount() {
        return result != null ? result.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_asal, tv_bahan, tv_cara_buat, tv_rasa;
        ImageView img_gambar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nama = itemView.findViewById(R.id.tv_item_name);
            tv_asal = itemView.findViewById(R.id.tv_item_asal);
            tv_bahan = itemView.findViewById(R.id.tv_item_bahan);
            tv_cara_buat = itemView.findViewById(R.id.tv_item_cara_buat);
            tv_rasa = itemView.findViewById(R.id.tv_item_rasa);
            img_gambar = itemView.findViewById(R.id.img_item_gambar);
        }

        public void bind(FoodItem foodItem) {
            tv_nama.setText(foodItem.getNama());
            tv_asal.setText("Asal Daerah: " + foodItem.getAsal_daerah());
            tv_bahan.setText("Bahan Utama: " + foodItem.getBahan_utama());
            tv_cara_buat.setText("Cara Membuat: " + foodItem.getCara_membuat());
            tv_rasa.setText("Cita Rasa: " + foodItem.getCita_rasa());

            String fullImageUrl =
                    "https://raw.githubusercontent.com/adndrsd1/crud-api-assignment/main" +
                            foodItem.getGambar();

            Glide.with(activity)
                    .load(fullImageUrl)
                    .into(img_gambar);
        }
    }
}
