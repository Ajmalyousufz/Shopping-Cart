package com.ajmalyousufza.shoppingcart.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ajmalyousufza.shoppingcart.R;
import com.ajmalyousufza.shoppingcart.adapters.CartAdapterClass;
import com.ajmalyousufza.shoppingcart.modelclasses.RecommModelClass;

import java.util.ArrayList;


public class CartFragment extends Fragment {

    RecyclerView recyclerView;
    CartAdapterClass adapterClass;
    RecommModelClass recommModelClass;
    TextView totalPrize,nextTv;
    ImageView nextIm;

    ArrayList<RecommModelClass> recommModelClassArrayList;

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    String totalPrice;

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cart, container, false);
        Context context = getContext();
        totalPrize = view.findViewById(R.id.totalPrice);
        nextTv = view.findViewById(R.id.next_tv);
        nextIm = view.findViewById(R.id.next_im);

        if(getActivity().getIntent().getStringExtra("where")!=null){

            String prodName = getActivity().getIntent().getStringExtra("itemName");

        }

        recommModelClassArrayList = new ArrayList<>();
        recyclerView = view.findViewById(R.id.prod_recyclerview);
        adapterClass = new CartAdapterClass(recommModelClassArrayList,context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapterClass);

        loadData();

        nextIm.setOnClickListener(view1 -> {
            gotoNext();
        });
        nextTv.setOnClickListener(view1 -> {
            gotoNext();
        });

        return view;
    }

    private void gotoNext() {

        Toast.makeText(getContext(), "Pay Money", Toast.LENGTH_SHORT).show();

    }

    private void loadData() {

        float total=0;

         String[] itemIds            = {"1","2","3","4","5","6"};
         String[] itemNames          = {"Lemon Tea","Black Tea","Green Tea","Lemon Tea2","Bubble Tea","Purple Tea"};
            int[] itemImages         = {R.drawable.lemon_tea_png,R.drawable.black_tea_png,R.drawable.black_tea_png,R.drawable.lemon_tea_png,R.drawable.bubble_tea,R.drawable.purple_tea};
        int[] itemLargeImages            = {R.drawable.lemon_tea_large_png,R.drawable.black_tea_png,R.drawable.black_tea_png,R.drawable.lemon_tea_png,R.drawable.bubble_tea,R.drawable.purple_tea};
        String[] itemParticularDesc = {getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription)};
         String[] itemPrice          = {"12.99","15.50","20.00","12.99","56.99","25.99"};
            int[] itemCount          = {1,1,1,1,1,1};
         String[] itemServiceDesc    = {getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription),getString(R.string.particular_decription)};
         String[] itemQuantity       = {"500ml","500ml","500ml","500ml","500ml","500ml"};
         String[] itemIce            = {"less Ice","No Ice","No Ice","less Ice","No Ice","No Ice"};
         String[] itemSugar          = {"Sugar","Sugar","Sugar","Sugar","Sugar","Sugar"};
         String[] itemRating         = {"5","5","5","5","5","5"};
         String[] itemDesc           = {"Good day time","Good day time","Good day time","Good day time","Good day time","Happy Hours"};
         boolean[] itemCarted        = {true,false,false,false,true,true};

        for (int i=0;i<itemNames.length;i++){

            recommModelClass = new RecommModelClass(itemIds[i], String.valueOf(itemImages[i]), String.valueOf(itemLargeImages[i]),itemNames[i],itemDesc[i],itemParticularDesc[i]
                    ,itemServiceDesc[i],itemPrice[i],itemQuantity[i],itemIce[i],itemSugar[i],itemRating[i] ,itemCarted[i]);

            if(itemCarted[i]){
                total=total+ Float.parseFloat(itemPrice[i])*itemCount[i] ;
                recommModelClassArrayList.add(recommModelClass);
            }
        }

        setTotalPrice(String.valueOf(total));
        totalPrize.setText(getTotalPrice());

    }
}