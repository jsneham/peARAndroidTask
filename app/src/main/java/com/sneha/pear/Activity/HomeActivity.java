package com.sneha.pear.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.sneha.pear.Adapter.CouponsAdapter;
import com.sneha.pear.Adapter.RestaurantsAdapter;
import com.sneha.pear.Models.Category;
import com.sneha.pear.Models.CouponRequest;
import com.sneha.pear.Models.Coupons;
import com.sneha.pear.Models.Restaurants;
import com.sneha.pear.MyApplication;
import com.sneha.pear.R;
import com.sneha.pear.Services.Constants;
import com.sneha.pear.ViewModel.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private HomeViewModel mViewModel;
    private Context context=this;
    private CouponsAdapter mCadapter;
    private RestaurantsAdapter mRadapter;
    private  ArrayList<Category> listDataHeader=new ArrayList<>();
    private Toolbar toolbar;

    //View
    private RecyclerView rvCouponsList,rvRestaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        setToolbar();
        initView();
        getCouponData();
        getRestaurantData();


    }



    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initView() {
        rvCouponsList= findViewById(R.id.rvCouponsList);
        rvCouponsList.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        mCadapter = new CouponsAdapter(context);
        rvCouponsList.setAdapter(mCadapter);

        rvRestaurantList= findViewById(R.id.rvRestaurantList);
        rvRestaurantList.setLayoutManager(new LinearLayoutManager(context));
        rvRestaurantList.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

    }


    private void getCouponData() {
        if(MyApplication.getInstance().isNetworkAvailable()) {


            mViewModel.getCoupons(new CouponRequest(Constants.RESTAURANT_CATEGORY, Constants.USER_ID)).observe(this, new Observer<List<Coupons>>() {
                @Override
                public void onChanged(List<Coupons> currenctPojos) {
                    if (currenctPojos != null ) {
                        mCadapter.addList(currenctPojos);
                        mCadapter.notifyDataSetChanged();
                    }
                    else {

                    }
                }
            });

        }else{
            Toast.makeText(context, "No Network Available", Toast.LENGTH_LONG).show();
        }
    }

    private void getRestaurantData() {
        if(MyApplication.getInstance().isNetworkAvailable()) {
            mViewModel.getRestaurants().observe(this, new Observer<Restaurants>() {
                @Override
                public void onChanged(Restaurants currenctPojos) {
                    if (currenctPojos != null ) {
                        toolbar.setTitle(currenctPojos.getName());
                        listDataHeader.addAll(currenctPojos.getCategories());
                        mRadapter = new RestaurantsAdapter(listDataHeader, context);
                        rvRestaurantList.setAdapter(mRadapter);
                    }
                    else {

                    }
                }
            });

        }else{
            Toast.makeText(context, "No Network Available", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.hom_menu, menu);
        return true;
    }
}