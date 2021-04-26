package com.sneha.pear.Models;

public class CouponRequest {
    private String restaurant_category ;
    private String user_id ;

    public CouponRequest(String restaurant_category, String user_id) {
        this.restaurant_category = restaurant_category;
        this.user_id = user_id;
    }

    public String getRestaurant_category() {
        return restaurant_category;
    }

    public void setRestaurant_category(String restaurant_category) {
        this.restaurant_category = restaurant_category;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
