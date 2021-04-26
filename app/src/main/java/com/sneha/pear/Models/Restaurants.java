package com.sneha.pear.Models;

import java.util.List;

public class Restaurants {


        public OrderProgressTime order_progress_time;
        public Object acquiring_time;
        public ActivationTime activation_time;

        public List<Object> Images;
        public String _id;

        public int ID;

        public List<Category> Categories;

        public String Cuisines;

        public boolean Live;

        public String Location;

        public String Name;
        public int __v;
        public String acquirer;
        public String activator;
        public boolean cardCommission;
        public boolean comingSoon;
        public int commissionPercentage;
        public boolean gst;
        public boolean hasDiscount;
        public boolean hasOrdering;
        public double latitude;
        public double longitude;
        public int mdv;
        public int mov;
        public boolean order_kot;
        public boolean order_progress;
        public boolean order_ring;
        public String password;
        public int peARDiscount;
        public String razorpay_account_id;
        public int restaurantDiscount;
        public String restaurant_address;
        public String restaurant_email;
        public String restaurant_image;
        public String restaurant_number;
        public String restaurant_type;
        public int serviceCharge;
        public int tables_count;
        public int discountPercentage;
        public String discount_type;
        public String restaurant_fcm_id;
        public String restaurant_category;

        public boolean AR;
        public int costForTwo;

        public Restaurants(OrderProgressTime order_progress_time, Object acquiring_time, ActivationTime activation_time, List<Object> images, String _id, int ID, List<Category> categories, String cuisines, boolean live, String location, String name, int __v, String acquirer, String activator, boolean cardCommission, boolean comingSoon, int commissionPercentage, boolean gst, boolean hasDiscount, boolean hasOrdering, double latitude, double longitude, int mdv, int mov, boolean order_kot, boolean order_progress, boolean order_ring, String password, int peARDiscount, String razorpay_account_id, int restaurantDiscount, String restaurant_address, String restaurant_email, String restaurant_image, String restaurant_number, String restaurant_type, int serviceCharge, int tables_count, int discountPercentage, String discount_type, String restaurant_fcm_id, String restaurant_category, boolean AR, int costForTwo) {
                this.order_progress_time = order_progress_time;
                this.acquiring_time = acquiring_time;
                this.activation_time = activation_time;
                Images = images;
                this._id = _id;
                this.ID = ID;
                Categories = categories;
                Cuisines = cuisines;
                Live = live;
                Location = location;
                Name = name;
                this.__v = __v;
                this.acquirer = acquirer;
                this.activator = activator;
                this.cardCommission = cardCommission;
                this.comingSoon = comingSoon;
                this.commissionPercentage = commissionPercentage;
                this.gst = gst;
                this.hasDiscount = hasDiscount;
                this.hasOrdering = hasOrdering;
                this.latitude = latitude;
                this.longitude = longitude;
                this.mdv = mdv;
                this.mov = mov;
                this.order_kot = order_kot;
                this.order_progress = order_progress;
                this.order_ring = order_ring;
                this.password = password;
                this.peARDiscount = peARDiscount;
                this.razorpay_account_id = razorpay_account_id;
                this.restaurantDiscount = restaurantDiscount;
                this.restaurant_address = restaurant_address;
                this.restaurant_email = restaurant_email;
                this.restaurant_image = restaurant_image;
                this.restaurant_number = restaurant_number;
                this.restaurant_type = restaurant_type;
                this.serviceCharge = serviceCharge;
                this.tables_count = tables_count;
                this.discountPercentage = discountPercentage;
                this.discount_type = discount_type;
                this.restaurant_fcm_id = restaurant_fcm_id;
                this.restaurant_category = restaurant_category;
                this.AR = AR;
                this.costForTwo = costForTwo;
        }


        public OrderProgressTime getOrder_progress_time() {
                return order_progress_time;
        }

        public void setOrder_progress_time(OrderProgressTime order_progress_time) {
                this.order_progress_time = order_progress_time;
        }

        public Object getAcquiring_time() {
                return acquiring_time;
        }

        public void setAcquiring_time(Object acquiring_time) {
                this.acquiring_time = acquiring_time;
        }

        public ActivationTime getActivation_time() {
                return activation_time;
        }

        public void setActivation_time(ActivationTime activation_time) {
                this.activation_time = activation_time;
        }

        public List<Object> getImages() {
                return Images;
        }

        public void setImages(List<Object> images) {
                Images = images;
        }

        public String get_id() {
                return _id;
        }

        public void set_id(String _id) {
                this._id = _id;
        }

        public int getID() {
                return ID;
        }

        public void setID(int ID) {
                this.ID = ID;
        }

        public List<Category> getCategories() {
                return Categories;
        }

        public void setCategories(List<Category> categories) {
                Categories = categories;
        }

        public String getCuisines() {
                return Cuisines;
        }

        public void setCuisines(String cuisines) {
                Cuisines = cuisines;
        }

        public boolean isLive() {
                return Live;
        }

        public void setLive(boolean live) {
                Live = live;
        }

        public String getLocation() {
                return Location;
        }

        public void setLocation(String location) {
                Location = location;
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public int get__v() {
                return __v;
        }

        public void set__v(int __v) {
                this.__v = __v;
        }

        public String getAcquirer() {
                return acquirer;
        }

        public void setAcquirer(String acquirer) {
                this.acquirer = acquirer;
        }

        public String getActivator() {
                return activator;
        }

        public void setActivator(String activator) {
                this.activator = activator;
        }

        public boolean isCardCommission() {
                return cardCommission;
        }

        public void setCardCommission(boolean cardCommission) {
                this.cardCommission = cardCommission;
        }

        public boolean isComingSoon() {
                return comingSoon;
        }

        public void setComingSoon(boolean comingSoon) {
                this.comingSoon = comingSoon;
        }

        public int getCommissionPercentage() {
                return commissionPercentage;
        }

        public void setCommissionPercentage(int commissionPercentage) {
                this.commissionPercentage = commissionPercentage;
        }

        public boolean isGst() {
                return gst;
        }

        public void setGst(boolean gst) {
                this.gst = gst;
        }

        public boolean isHasDiscount() {
                return hasDiscount;
        }

        public void setHasDiscount(boolean hasDiscount) {
                this.hasDiscount = hasDiscount;
        }

        public boolean isHasOrdering() {
                return hasOrdering;
        }

        public void setHasOrdering(boolean hasOrdering) {
                this.hasOrdering = hasOrdering;
        }

        public double getLatitude() {
                return latitude;
        }

        public void setLatitude(double latitude) {
                this.latitude = latitude;
        }

        public double getLongitude() {
                return longitude;
        }

        public void setLongitude(double longitude) {
                this.longitude = longitude;
        }

        public int getMdv() {
                return mdv;
        }

        public void setMdv(int mdv) {
                this.mdv = mdv;
        }

        public int getMov() {
                return mov;
        }

        public void setMov(int mov) {
                this.mov = mov;
        }

        public boolean isOrder_kot() {
                return order_kot;
        }

        public void setOrder_kot(boolean order_kot) {
                this.order_kot = order_kot;
        }

        public boolean isOrder_progress() {
                return order_progress;
        }

        public void setOrder_progress(boolean order_progress) {
                this.order_progress = order_progress;
        }

        public boolean isOrder_ring() {
                return order_ring;
        }

        public void setOrder_ring(boolean order_ring) {
                this.order_ring = order_ring;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public int getPeARDiscount() {
                return peARDiscount;
        }

        public void setPeARDiscount(int peARDiscount) {
                this.peARDiscount = peARDiscount;
        }

        public String getRazorpay_account_id() {
                return razorpay_account_id;
        }

        public void setRazorpay_account_id(String razorpay_account_id) {
                this.razorpay_account_id = razorpay_account_id;
        }

        public int getRestaurantDiscount() {
                return restaurantDiscount;
        }

        public void setRestaurantDiscount(int restaurantDiscount) {
                this.restaurantDiscount = restaurantDiscount;
        }

        public String getRestaurant_address() {
                return restaurant_address;
        }

        public void setRestaurant_address(String restaurant_address) {
                this.restaurant_address = restaurant_address;
        }

        public String getRestaurant_email() {
                return restaurant_email;
        }

        public void setRestaurant_email(String restaurant_email) {
                this.restaurant_email = restaurant_email;
        }

        public String getRestaurant_image() {
                return restaurant_image;
        }

        public void setRestaurant_image(String restaurant_image) {
                this.restaurant_image = restaurant_image;
        }

        public String getRestaurant_number() {
                return restaurant_number;
        }

        public void setRestaurant_number(String restaurant_number) {
                this.restaurant_number = restaurant_number;
        }

        public String getRestaurant_type() {
                return restaurant_type;
        }

        public void setRestaurant_type(String restaurant_type) {
                this.restaurant_type = restaurant_type;
        }

        public int getServiceCharge() {
                return serviceCharge;
        }

        public void setServiceCharge(int serviceCharge) {
                this.serviceCharge = serviceCharge;
        }

        public int getTables_count() {
                return tables_count;
        }

        public void setTables_count(int tables_count) {
                this.tables_count = tables_count;
        }

        public int getDiscountPercentage() {
                return discountPercentage;
        }

        public void setDiscountPercentage(int discountPercentage) {
                this.discountPercentage = discountPercentage;
        }

        public String getDiscount_type() {
                return discount_type;
        }

        public void setDiscount_type(String discount_type) {
                this.discount_type = discount_type;
        }

        public String getRestaurant_fcm_id() {
                return restaurant_fcm_id;
        }

        public void setRestaurant_fcm_id(String restaurant_fcm_id) {
                this.restaurant_fcm_id = restaurant_fcm_id;
        }

        public String getRestaurant_category() {
                return restaurant_category;
        }

        public void setRestaurant_category(String restaurant_category) {
                this.restaurant_category = restaurant_category;
        }

        public boolean isAR() {
                return AR;
        }

        public void setAR(boolean AR) {
                this.AR = AR;
        }

        public int getCostForTwo() {
                return costForTwo;
        }

        public void setCostForTwo(int costForTwo) {
                this.costForTwo = costForTwo;
        }
}


