package com.example.nutrimate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.w3c.dom.Text;
import java.util.ArrayList;

public class AdapterRecFood extends RecyclerView.Adapter<AdapterRecFood.ViewHolder> {
    ArrayList<FoodModel> dataMakanan;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaMakanan;
        ImageView fotoMakanan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaMakanan = itemView.findViewById(R.id.foodname);
            fotoMakanan = itemView.findViewById(R.id.foodimage);
        }
    }

    AdapterRecFood(ArrayList<FoodModel> data) {this.dataMakanan = data;}

    @NonNull
    @Override
    public AdapterRecFood.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_food_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecFood.ViewHolder holder, int position){
        TextView foodname = holder.namaMakanan;
        ImageView foodimage = holder.fotoMakanan;

        foodname.setText(dataMakanan.get(position).getName());
        foodimage.setImageResource(dataMakanan.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataMakanan.size();
    }
}
