package com.sneha.pear.Models;

import com.sneha.pear.Adapter.ParentListItem;

import java.util.List;

public class Category implements ParentListItem {

    public List<Item> Items;
    public String _id;

    public String Category_bundle_link;

    public String Category_name;

    public double Version;
    public String category_image;

    public boolean Live;
    public boolean hasCategoryDiscount;
    public int categoryDiscountPercentage;

    public Category(List<Item> items, String _id, String category_bundle_link, String category_name, double version, String category_image, boolean live, boolean hasCategoryDiscount, int categoryDiscountPercentage) {
        Items = items;
        this._id = _id;
        Category_bundle_link = category_bundle_link;
        Category_name = category_name;
        Version = version;
        this.category_image = category_image;
        Live = live;
        this.hasCategoryDiscount = hasCategoryDiscount;
        this.categoryDiscountPercentage = categoryDiscountPercentage;
    }

    public List<Item> getItems() {
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCategory_bundle_link() {
        return Category_bundle_link;
    }

    public void setCategory_bundle_link(String category_bundle_link) {
        Category_bundle_link = category_bundle_link;
    }

    public String getCategory_name() {
        return Category_name;
    }

    public void setCategory_name(String category_name) {
        Category_name = category_name;
    }

    public double getVersion() {
        return Version;
    }

    public void setVersion(double version) {
        Version = version;
    }

    public String getCategory_image() {
        return category_image;
    }

    public void setCategory_image(String category_image) {
        this.category_image = category_image;
    }

    public boolean isLive() {
        return Live;
    }

    public void setLive(boolean live) {
        Live = live;
    }

    public boolean isHasCategoryDiscount() {
        return hasCategoryDiscount;
    }

    public void setHasCategoryDiscount(boolean hasCategoryDiscount) {
        this.hasCategoryDiscount = hasCategoryDiscount;
    }

    public int getCategoryDiscountPercentage() {
        return categoryDiscountPercentage;
    }

    public void setCategoryDiscountPercentage(int categoryDiscountPercentage) {
        this.categoryDiscountPercentage = categoryDiscountPercentage;
    }

    @Override
    public List<?> getChildItemList() {
        return Items;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
