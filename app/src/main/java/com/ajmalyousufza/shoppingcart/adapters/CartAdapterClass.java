package com.ajmalyousufza.shoppingcart.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajmalyousufza.shoppingcart.R;
import com.ajmalyousufza.shoppingcart.modelclasses.RecommModelClass;

import java.util.ArrayList;

public class CartAdapterClass  extends RecyclerView.Adapter<CartAdapterClass.ViewHolder> {

    ArrayList<RecommModelClass> recommModelClassArrayList;
    Context context;

    public CartAdapterClass(ArrayList<RecommModelClass> recommModelClassArrayList, Context context) {
        this.recommModelClassArrayList = recommModelClassArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CartAdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapterClass.ViewHolder holder, int position) {

        holder.itemPrice.setText(recommModelClassArrayList.get(position).getRecommPrice());
        holder.itemName.setText(recommModelClassArrayList.get(position).getRecommName());
        holder.itemImage.setImageResource(Integer.parseInt(recommModelClassArrayList.get(position).getRecommImage()));
       // holder.itemImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

    }

    @Override
    public int getItemCount() {
        return recommModelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemName,itemPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.willbuy_image);
            itemName = itemView.findViewById(R.id.willbuy_name);
            itemPrice = itemView.findViewById(R.id.willbuy_prices);
        }
    }
}
