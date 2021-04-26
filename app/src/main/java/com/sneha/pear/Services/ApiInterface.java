package com.sneha.pear.Services;


import com.sneha.pear.Models.CouponRequest;
import com.sneha.pear.Models.Coupons;
import com.sneha.pear.Models.Restaurants;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    @GET("/restaurant/3026")
    Call<Restaurants> getRestaurants();


    @POST("/user/offers/couponlist")
    Call<List<Coupons>> getCoupons(
            @Body CouponRequest body
    );


}
