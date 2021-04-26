package com.sneha.pear.Models;

import java.util.List;

public class Item {

    public String[] Customisation;
    public String _id;

    public String Name;

    public int Price;

    public int AcPrice;

    public boolean Jain;

    public String Description;
    public String item_image;

    public boolean AR;

    public boolean Live;
    public String item_type;
    public int serving_time;
    public String model_android;
    public String model_ios;

    public boolean Vegan;

    public boolean Gluten_free;

    public boolean Best_seller;

    public boolean Chefs_special;

    public boolean Seasonal;
    public boolean taxable;

    public Item(String[] customisation, String _id, String name, int price, int acPrice, boolean jain, String description, String item_image, boolean AR, boolean live, String item_type, int serving_time, String model_android, String model_ios, boolean vegan, boolean gluten_free, boolean best_seller, boolean chefs_special, boolean seasonal, boolean taxable) {
        Customisation = customisation;
        this._id = _id;
        Name = name;
        Price = price;
        AcPrice = acPrice;
        Jain = jain;
        Description = description;
        this.item_image = item_image;
        this.AR = AR;
        Live = live;
        this.item_type = item_type;
        this.serving_time = serving_time;
        this.model_android = model_android;
        this.model_ios = model_ios;
        Vegan = vegan;
        Gluten_free = gluten_free;
        Best_seller = best_seller;
        Chefs_special = chefs_special;
        Seasonal = seasonal;
        this.taxable = taxable;
    }

    public String[] getCustomisation() {
        return Customisation;
    }

    public void setCustomisation(String[] customisation) {
        Customisation = customisation;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getAcPrice() {
        return AcPrice;
    }

    public void setAcPrice(int acPrice) {
        AcPrice = acPrice;
    }

    public boolean isJain() {
        return Jain;
    }

    public void setJain(boolean jain) {
        Jain = jain;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getItem_image() {
        return item_image;
    }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }

    public boolean isAR() {
        return AR;
    }

    public void setAR(boolean AR) {
        this.AR = AR;
    }

    public boolean isLive() {
        return Live;
    }

    public void setLive(boolean live) {
        Live = live;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public int getServing_time() {
        return serving_time;
    }

    public void setServing_time(int serving_time) {
        this.serving_time = serving_time;
    }

    public String getModel_android() {
        return model_android;
    }

    public void setModel_android(String model_android) {
        this.model_android = model_android;
    }

    public String getModel_ios() {
        return model_ios;
    }

    public void setModel_ios(String model_ios) {
        this.model_ios = model_ios;
    }

    public boolean isVegan() {
        return Vegan;
    }

    public void setVegan(boolean vegan) {
        Vegan = vegan;
    }

    public boolean isGluten_free() {
        return Gluten_free;
    }

    public void setGluten_free(boolean gluten_free) {
        Gluten_free = gluten_free;
    }

    public boolean isBest_seller() {
        return Best_seller;
    }

    public void setBest_seller(boolean best_seller) {
        Best_seller = best_seller;
    }

    public boolean isChefs_special() {
        return Chefs_special;
    }

    public void setChefs_special(boolean chefs_special) {
        Chefs_special = chefs_special;
    }

    public boolean isSeasonal() {
        return Seasonal;
    }

    public void setSeasonal(boolean seasonal) {
        Seasonal = seasonal;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
}
