package com.sneha.pear.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.sneha.pear.Models.CouponRequest;
import com.sneha.pear.Models.Coupons;
import com.sneha.pear.Models.Restaurants;
import com.sneha.pear.Repository.HomeRepository;

import java.util.List;

public class HomeViewModel extends AndroidViewModel {

    private HomeRepository homeRepository;
    private MutableLiveData<List<Coupons>> mutableCouponLiveData;
    private MutableLiveData<Restaurants> mutableRestaurantsLiveData;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        homeRepository =  HomeRepository.getInstance(application);
    }

    public LiveData<List<Coupons>> getCoupons(CouponRequest couponRequest) {
        if(mutableCouponLiveData==null){
            mutableCouponLiveData = homeRepository.requestCoupons(couponRequest);
        }
        return mutableCouponLiveData;
    }


    public LiveData<Restaurants> getRestaurants() {
        if(mutableRestaurantsLiveData==null){
            mutableRestaurantsLiveData = homeRepository.requestRestaurants();
        }
        return mutableRestaurantsLiveData;
    }
}
