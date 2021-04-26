package com.sneha.pear.Repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.sneha.pear.Models.CouponRequest;
import com.sneha.pear.Models.Coupons;
import com.sneha.pear.Models.Restaurants;
import com.sneha.pear.MyApplication;
import com.sneha.pear.Services.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeRepository {

    private final String TAG = getClass().getSimpleName();
    private static HomeRepository instance;
    private ApiInterface apiService;
    private static Context context;

    public static HomeRepository getInstance(Context context) {
        if (instance == null) {
            instance = new HomeRepository(context);
        }
        return instance;
    }

    private HomeRepository(Context context) {
        this.context=context;
         apiService = MyApplication.getRetrofitClient().create(ApiInterface.class);
    }

    public MutableLiveData<List<Coupons>> requestCoupons(CouponRequest couponRequest) {
        final MutableLiveData<List<Coupons>> mutableLiveData = new MutableLiveData<>();

        apiService.getCoupons(couponRequest).enqueue(new Callback<List<Coupons>>() {
            @Override
            public void onResponse(Call<List<Coupons>> call, Response<List<Coupons>> response) {


                if (response.isSuccessful() && response.body()!=null ) {
                    mutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Coupons>> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }


    public MutableLiveData<Restaurants> requestRestaurants() {
        final MutableLiveData<Restaurants> mutableLiveData = new MutableLiveData<>();

        apiService.getRestaurants().enqueue(new Callback<Restaurants>() {
            @Override
            public void onResponse(Call<Restaurants> call, Response<Restaurants> response) {


                if (response.isSuccessful() && response.body()!=null ) {
                    mutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Restaurants> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}
