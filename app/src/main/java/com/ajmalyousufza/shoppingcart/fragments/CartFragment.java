package com.ajmalyousufza.shoppingcart.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ajmalyousufza.shoppingcart.R;


public class CartFragment extends Fragment {



    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cart, container, false);
        Context context = getContext();

        if(getActivity().getIntent().getStringExtra("where")!=null){

            String prodName = getActivity().getIntent().getStringExtra("itemName");
            Toast.makeText(context, prodName, Toast.LENGTH_SHORT).show();
        }

        return view;
    }
}