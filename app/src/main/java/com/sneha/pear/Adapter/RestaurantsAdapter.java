package com.sneha.pear.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sneha.pear.Models.Category;
import com.sneha.pear.Models.Coupons;
import com.sneha.pear.Models.Item;
import com.sneha.pear.Models.Restaurants;
import com.sneha.pear.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantsAdapter extends ExpandableRecyclerAdapter<RestaurantsAdapter.RestaurantParentViewHolder, RestaurantsAdapter.RestaurantChildViewHolder> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private String category_name;
    Category head;


    public RestaurantsAdapter(@NonNull List<? extends ParentListItem> parentItemList, Context mContext) {
        super(parentItemList);
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
    }

    @Override
    public RestaurantParentViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View view = mLayoutInflater.inflate(R.layout.restaurant_row_header, parentViewGroup, false);
        return new RestaurantParentViewHolder(view);
    }

    @Override
    public RestaurantChildViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View view = mLayoutInflater.inflate(R.layout.restaurant_row, childViewGroup, false);
        return new RestaurantChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(RestaurantParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        head = (Category) parentListItem;
        parentViewHolder.bind(head);

    }

    @Override
    public void onBindChildViewHolder(RestaurantChildViewHolder childViewHolder, int position, Object childListItem) {
        Item child = (Item) childListItem;
        childViewHolder.bind(child, category_name);


    }


    public class RestaurantParentViewHolder extends ParentViewHolder {

        private static final float INITIAL_POSITION = 0.0f;
        private static final float ROTATED_POSITION = 180f;


        private TextView tvTitle, lblListHeader;
        private TextView tvAge;
        private ImageView ivCollapse, iv_amc;
        private LinearLayout llItem;


        public RestaurantParentViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivCollapse = (ImageView) itemView.findViewById(R.id.image_view_collapse);

        }

        public void bind(Category header) {

            tvTitle.setText(header.getCategory_name());


        }

        @Override
        public void setExpanded(boolean expanded) {
            super.setExpanded(expanded);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                if (expanded) {
                    category_name= tvTitle.getText().toString();
                    ivCollapse.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24);
                } else {
                    ivCollapse.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24);
                }
            }
        }

        @Override
        public void onExpansionToggled(boolean expanded) {
            super.onExpansionToggled(expanded);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                RotateAnimation rotateAnimation;
                if (expanded) { // rotate clockwise
                    rotateAnimation = new RotateAnimation(ROTATED_POSITION,
                            INITIAL_POSITION,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                } else { // rotate counterclockwise
                    rotateAnimation = new RotateAnimation(-1 * ROTATED_POSITION,
                            INITIAL_POSITION,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                }

                rotateAnimation.setDuration(200);
                rotateAnimation.setFillAfter(true);
                ivCollapse.startAnimation(rotateAnimation);
            }
        }
    }


    public class RestaurantChildViewHolder extends ChildViewHolder {
        private ImageView ivRestaurant,ivVegNon;
        private TextView tvTitle, tvDiscount,tvPrice,tvOffer,tvDes;
        private TextView ivBestSeller;
        private Spinner spCoustmize;

        public RestaurantChildViewHolder(View itemView) {
            super(itemView);

            tvDes = (TextView) itemView.findViewById(R.id.tvDes);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDiscount = (TextView) itemView.findViewById(R.id.tvDiscount);
            tvPrice = (TextView) itemView.findViewById(R.id.tvPrice);
            tvOffer = (TextView) itemView.findViewById(R.id.tvOffer);
            ivRestaurant = (ImageView) itemView.findViewById(R.id.ivRestaurant);
            ivVegNon = (ImageView) itemView.findViewById(R.id.ivVegNon);
            ivBestSeller = (TextView) itemView.findViewById(R.id.ivBestSeller);
            spCoustmize = (Spinner) itemView.findViewById(R.id.spCoustmize);

        }

        public void bind(final Item child, String category_name) {
            Log.d("TAG", "appears " + getAdapterPosition());


            tvTitle.setText(child.getName());

//            i'm getting blank in description field so i used dummy text
            if(child.getDescription().isEmpty()) tvDes.setText(mContext.getString(R.string.des)) ;
            else tvDes.setText(child.getDescription()) ;

            tvDiscount.setText(String.format("%1$s %2$s","₹",String.valueOf(child.getAcPrice())));
            tvPrice.setText(String.format("%1$s %2$s","₹",String.valueOf(child.getPrice())));
            double discount =calculateDiscount(child.getAcPrice(),child.getPrice() );
            tvOffer.setText(String.format("%1$s %2$s", discount, "% OFF"));


//           child.isBest_seller()  is always false that's why i used Category name to show bestseller tag
            if(category_name.contains("Best Seller"))ivBestSeller.setVisibility(View.VISIBLE);
            else ivBestSeller.setVisibility(View.GONE);

            if(child.getItem_type().equals("2")) Glide.with(mContext).load(R.drawable.nonveg).into(ivVegNon);
            else Glide.with(mContext).load(R.drawable.veg).into(ivVegNon);



            //Customisation [] is empty.
            String[] custom;
            custom = child.getCustomisation();
            if(custom.length==0)
                custom = new String[]{"Customize","1", "2", "3", "4", "5"};

            spCoustmize.setPrompt(mContext.getString(R.string.customize));
            final List<String> plantsList = new ArrayList<>(Arrays.asList(custom));
            // Initializing an ArrayAdapter
            final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(mContext,android.R.layout.simple_spinner_item,plantsList);
            spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spCoustmize.setAdapter(spinnerArrayAdapter);

        }


    }


    public double calculateDiscount(double actualPrice, double discountPrice){
        double discountPercentile=0.0d;
        try {



            discountPercentile =((actualPrice-discountPrice)/actualPrice)*100;
            discountPercentile = Math.round(discountPercentile);
            return discountPercentile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return discountPercentile;
    }






}
