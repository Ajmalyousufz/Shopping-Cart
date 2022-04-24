package com.ajmalyousufza.shoppingcart.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajmalyousufza.shoppingcart.R;
import com.ajmalyousufza.shoppingcart.activities.ItemDetailedActivity;
import com.ajmalyousufza.shoppingcart.modelclasses.RecommModelClass;

import java.util.ArrayList;

public class RecommAdapterClass extends RecyclerView.Adapter<RecommAdapterClass.ViewHolder>{

    RecyclerViewClickListenerr recyclerViewClickListenerr;
    ArrayList<RecommModelClass> recommModelClassArrayList;
    Context context;

    public RecommAdapterClass(ArrayList<RecommModelClass> recommModelClassArrayList, Context context,RecyclerViewClickListenerr recyclerViewClickListenerr) {
        this.recommModelClassArrayList = recommModelClassArrayList;
        this.context = context;
        this.recyclerViewClickListenerr = recyclerViewClickListenerr;
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

    public interface RecyclerViewClickListenerr{
        void onClick(View view,int position);
    }


    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {

        ImageView recommImage;
        TextView recommName;
        ImageView recommTag;
        public LinearLayout rcommLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            recommName = itemView.findViewById(R.id.recomm_name);
            recommImage = itemView.findViewById(R.id.recomm_image);
            recommTag = itemView.findViewById(R.id.recomm_tag);
            rcommLayout = itemView.findViewById(R.id.recomm_Layout);
            rcommLayout.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if(view == view.findViewById(R.id.recomm_Layout)){
                recyclerViewClickListenerr = new RecyclerViewClickListenerr() {
                    @Override
                    public void onClick(View view, int position) {
                        if (view == view.findViewById(R.id.recomm_Layout)) {
                            Intent intent = new Intent(context, ItemDetailedActivity.class);
                            intent.putExtra("itemId",recommModelClassArrayList.get(position).getRecommId());
                            intent.putExtra("itemName",recommModelClassArrayList.get(position).getRecommName());
                            intent.putExtra("itemImage",recommModelClassArrayList.get(position).getRecommImage());
                            intent.putExtra("itemDesc",recommModelClassArrayList.get(position).getRecommDesc());
                            intent.putExtra("itemParticularDesc",recommModelClassArrayList.get(position).getRecommParticularDesc());
                            intent.putExtra("itemServiceDesc",recommModelClassArrayList.get(position).getRecommServiceDesc());
                            intent.putExtra("itemPrice",recommModelClassArrayList.get(position).getRecommPrice());
                            intent.putExtra("itemIce",recommModelClassArrayList.get(position).getRecommIce());
                            intent.putExtra("itemSugar",recommModelClassArrayList.get(position).getRecommSugar());
                            intent.putExtra("itemRating",recommModelClassArrayList.get(position).getRecommRating());
                            intent.putExtra("itemQuantity",recommModelClassArrayList.get(position).getRecommQuantity());
                            context.startActivity(intent);
                        }
                    }
                };
                    recyclerViewClickListenerr.onClick(rcommLayout,getAdapterPosition());


            }
        }
    }
}
