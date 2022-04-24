package com.ajmalyousufza.shoppingcart.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajmalyousufza.shoppingcart.R;
import com.ajmalyousufza.shoppingcart.modelclasses.WillBuyModelClass;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class WillBuyAdapterClass extends RecyclerView.Adapter<WillBuyAdapterClass.ViewHolder> {

    ArrayList<WillBuyModelClass> willBuyModelClassArrayList;
    Context context;

    public WillBuyAdapterClass(ArrayList<WillBuyModelClass> willBuyModelClassArrayList, Context context) {
        this.willBuyModelClassArrayList = willBuyModelClassArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public WillBuyAdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.willbuyitem_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull WillBuyAdapterClass.ViewHolder holder, int position) {

        holder.willbuyName.setText(willBuyModelClassArrayList.get(position).getItem_name());
        holder.willbuyDesc.setText(willBuyModelClassArrayList.get(position).getItem_desc());
        holder.willbuyPrice.setText(willBuyModelClassArrayList.get(position).getItem_price());
        holder.willbuyImage.setImageResource(Integer.parseInt(willBuyModelClassArrayList.get(position).getItem_image()));

        //Picasso.get().load(willBuyModelClassArrayList.get(position).getItem_image()).into(holder.willbuyImage);

    }

    @Override
    public int getItemCount() {
        return willBuyModelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView willbuyImage;
        TextView willbuyName,willbuyDesc,willbuyPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            willbuyImage = itemView.findViewById(R.id.willbuy_image);
            willbuyName = itemView.findViewById(R.id.willbuy_name);
            willbuyDesc = itemView.findViewById(R.id.willbuy_desc);
            willbuyPrice = itemView.findViewById(R.id.willbuy_price);
        }
    }
}
