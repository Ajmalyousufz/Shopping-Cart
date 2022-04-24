package com.ajmalyousufza.shoppingcart.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ajmalyousufza.shoppingcart.R;

public class ItemDetailedActivity extends AppCompatActivity {


    String itemId;
    String itemName ;
    String itemDesc ;
    String itemParticularDesc;
    String itemServiceDesc;
    String itemPrice ;
    String itemQuantity;
    String itemIce ;
    String itemSugar;
    String itemRating;
    String itemImage;
    String itemLargeImage;

    TextView teaName,teaDisc,teaParticularDesc,teaServiceDesc,teaPrice,teaQuantity,teaIce,teaSugar;
    RatingBar teaRating;
    ImageView teaImage;
    Button purchaseButton;
    ImageView backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detailed);

         itemId             = getIntent().getStringExtra("itemId");
         itemName           = getIntent().getStringExtra("itemName");
         itemDesc           = getIntent().getStringExtra("itemDesc");
         itemParticularDesc = getIntent().getStringExtra("itemParticularDesc");
         itemServiceDesc    = getIntent().getStringExtra("itemServiceDesc");
         itemPrice          = getIntent().getStringExtra("itemPrice");
         itemQuantity       = getIntent().getStringExtra("itemQuantity");
         itemIce            = getIntent().getStringExtra("itemIce");
         itemSugar          = getIntent().getStringExtra("itemSugar");
         itemRating         = getIntent().getStringExtra("itemRating");
         itemImage          = getIntent().getStringExtra("itemImage");
         itemLargeImage          = getIntent().getStringExtra("itemLargeImage");

         teaName = findViewById(R.id.teaName);
         teaDisc = findViewById(R.id.teaDesc);
         teaParticularDesc = findViewById(R.id.teaParticularDesc);
         teaServiceDesc = findViewById(R.id.teaServiceDesc);
         teaPrice = findViewById(R.id.teaPrice);
         teaQuantity = findViewById(R.id.teaQuantity);
         teaIce = findViewById(R.id.teaIce);
         teaSugar = findViewById(R.id.teaSugar);
         teaRating = findViewById(R.id.teaRating);
         teaImage = findViewById(R.id.teaImage);

         purchaseButton = findViewById(R.id.purchase_button);
         backBtn = findViewById(R.id.back_btn);

         teaName.setText(itemName);
         teaDisc.setText(itemDesc);
         teaParticularDesc.setText(itemParticularDesc);
         teaServiceDesc.setText(itemServiceDesc);
         teaPrice.setText(itemPrice);
         teaQuantity.setText(itemQuantity);
         teaIce.setText(itemIce);
         teaSugar.setText(itemSugar);
         teaRating.setRating(Float.parseFloat(itemRating));
         teaImage.setImageResource(Integer.parseInt(itemLargeImage));

         backBtn.setOnClickListener(view -> {
             finish();
         });

         purchaseButton.setOnClickListener(view -> {
             Intent intent = new Intent(getApplicationContext(), MainActivity.class);
             intent.putExtra("where","detailedActivity");
             intent.putExtra("itemId",itemId);
             intent.putExtra("itemName",itemName);
             intent.putExtra("itemImage",itemImage);
             intent.putExtra("itemDesc",itemDesc);
             intent.putExtra("itemParticularDesc",itemParticularDesc);
             intent.putExtra("itemServiceDesc",itemServiceDesc);
             intent.putExtra("itemPrice",itemPrice);
             intent.putExtra("itemIce",itemIce);
             intent.putExtra("itemSugar",itemSugar);
             intent.putExtra("itemRating",itemRating);
             intent.putExtra("itemQuantity",itemQuantity);
             startActivity(intent);
         });

    }
}