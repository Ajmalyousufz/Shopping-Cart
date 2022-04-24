package com.ajmalyousufza.shoppingcart.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ajmalyousufza.shoppingcart.R;
import com.ajmalyousufza.shoppingcart.adapters.RecommAdapterClass;
import com.ajmalyousufza.shoppingcart.adapters.WillBuyAdapterClass;
import com.ajmalyousufza.shoppingcart.modelclasses.RecommModelClass;
import com.ajmalyousufza.shoppingcart.modelclasses.WillBuyModelClass;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    ArrayList<WillBuyModelClass> willBuyModelClassArrayList;
    Context context;
    RecyclerView recyclerView;
    WillBuyAdapterClass adapterClass;

    ArrayList<RecommModelClass> recommModelClassArrayList;
    RecyclerView recyclerView2;
    RecommAdapterClass recommAdapterClass;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        willBuyModelClassArrayList = new ArrayList<>();
        context = getContext();
        recyclerView = view.findViewById(R.id.recyclerview);
        adapterClass = new WillBuyAdapterClass(willBuyModelClassArrayList,context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapterClass);

        recommModelClassArrayList = new ArrayList<>();
        recyclerView2 = view.findViewById(R.id.prod_recyclerview);
        recommAdapterClass = new RecommAdapterClass(recommModelClassArrayList,context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(recommAdapterClass);

        loadData();
        loadRecommData();

        return view;
    }

    private void loadRecommData() {


        String[] itemNames = {"Lemon Tea","Black Tea","Green Tea","Lemon Tea2","Black Tea2","Green Tea2"};
        int[] itemImages = {R.drawable.lemon_tea_png,R.drawable.black_tea_png,R.drawable.black_tea_png,R.drawable.lemon_tea_png,R.drawable.black_tea_png,R.drawable.black_tea_png};

        for (int i=0;i<itemNames.length;i++){

            RecommModelClass recommModelClass = new RecommModelClass("",String.valueOf(itemImages[i]),itemNames[i] );

            recommModelClassArrayList.add(i,recommModelClass);
        }


    }

    private void loadData() {

        String[] itemPrices = {"56.99","25.99"};
        String[] itemNames = {"Bubble Tea","Purple Tea"};
        String[] itemDescs = {"Good day time","Happy hours"};
        int[] itemImages = {R.drawable.bubble_tea,R.drawable.purple_tea};

        for (int i=0;i<itemNames.length;i++){

            WillBuyModelClass willBuyModelClass = new WillBuyModelClass("",itemNames[i],String.valueOf(itemImages[i]),itemPrices[i],itemDescs[i] );

            willBuyModelClassArrayList.add(i,willBuyModelClass);
        }


    }
}