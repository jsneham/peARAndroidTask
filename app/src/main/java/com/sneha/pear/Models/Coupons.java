package com.sneha.pear.Models;

public class Coupons {
    private String _id ;
    private String coupon_code ;
    private String coupon_type ;
    private String description ;
    private String sub_description ;
    private String priority ;
    private String creation_time ;
    private String creation_timestamp ;
    private String quantity ;
    private String expiresIn ;

    public Coupons(String _id, String coupon_code, String coupon_type, String description, String sub_description, String priority, String creation_time, String creation_timestamp, String quantity, String expiresIn) {
        this._id = _id;
        this.coupon_code = coupon_code;
        this.coupon_type = coupon_type;
        this.description = description;
        this.sub_description = sub_description;
        this.priority = priority;
        this.creation_time = creation_time;
        this.creation_timestamp = creation_timestamp;
        this.quantity = quantity;
        this.expiresIn = expiresIn;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

    public String getCoupon_type() {
        return coupon_type;
    }

    public void setCoupon_type(String coupon_type) {
        this.coupon_type = coupon_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSub_description() {
        return sub_description;
    }

    public void setSub_description(String sub_description) {
        this.sub_description = sub_description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(String creation_time) {
        this.creation_time = creation_time;
    }

    public String getCreation_timestamp() {
        return creation_timestamp;
    }

    public void setCreation_timestamp(String creation_timestamp) {
        this.creation_timestamp = creation_timestamp;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }


}
