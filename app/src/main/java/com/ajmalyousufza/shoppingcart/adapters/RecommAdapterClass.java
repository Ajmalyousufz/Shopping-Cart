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

public class RecommAdapterClass extends RecyclerView.Adapter<RecommAdapterClass.ViewHolder> {

    ArrayList<RecommModelClass> recommModelClassArrayList;
    Context context;

    public RecommAdapterClass(ArrayList<RecommModelClass> recommModelClassArrayList, Context context) {
        this.recommModelClassArrayList = recommModelClassArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecommAdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recommitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecommAdapterClass.ViewHolder holder, int position) {

        if(recommModelClassArrayList.get(position).getRecommName().equals("Lemon Tea")){
            holder.recommTag.setVisibility(View.VISIBLE);
        }
        holder.recommName.setText(recommModelClassArrayList.get(position).getRecommName());
        holder.recommImage.setImageResource(Integer.parseInt(recommModelClassArrayList.get(position).getRecommImage()));


    }

    @Override
    public int getItemCount() {
        return recommModelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView recommImage;
        TextView recommName;
        ImageView recommTag;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            recommName = itemView.findViewById(R.id.recomm_name);
            recommImage = itemView.findViewById(R.id.recomm_image);
            recommTag = itemView.findViewById(R.id.recomm_tag);

        }
    }
}
