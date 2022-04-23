package com.ajmalyousufza.shoppingcart.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ajmalyousufza.shoppingcart.R;
import com.ajmalyousufza.shoppingcart.fragments.CartFragment;
import com.ajmalyousufza.shoppingcart.fragments.HomeFragment;
import com.ajmalyousufza.shoppingcart.fragments.StoreFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    CircleImageView profimg;
    TextView category;

//   private ChipNavigationBar chipNavigationBar;
//
//   private Fragment fragment = null;
//   private Toolbar toolbar;

   ActionBarDrawerToggle actionBarDrawerToggle;
   MaterialToolbar toolbar ;
   DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.topAppBar);
        drawerLayout = findViewById(R.id.mainDrawer);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        View header = navigationView.getHeaderView(0);
        profimg =  header.findViewById(R.id.prof_image);
        category = header.findViewById(R.id.prof_categories);

        category.setOnClickListener(view -> {
            Toast.makeText(this, "Category", Toast.LENGTH_SHORT).show();
        });

        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.app_name,R.string.app_name);
        actionBarDrawerToggle.syncState();

//        chipNavigationBar = findViewById(R.id.chip_navigation_bar);
//        toolbar = findViewById(R.id.toolbar);
//
//        chipNavigationBar.setItemSelected(R.id.page_2,true);
//        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("ajmal");
//
//        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(int i) {
//                switch (i){
//                    case R.id.page_1:
//                        fragment = new StoreFragment();
//                        break;
//                    case R.id.page_2:
//                        fragment = new HomeFragment();
//                        break;
//                    case R.id.page_3:
//                        fragment = new CartFragment();
//                        break;
//                }
//
//                if(fragment!=null){
//                    getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
//                }
//            }
//        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;

        }
        if(item.getItemId()==findViewById(R.id.prof_categories).getId()){
            Toast.makeText(this, "Categories", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}