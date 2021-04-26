package com.sneha.pear.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sneha.pear.Models.Coupons;
import com.sneha.pear.R;

import java.util.ArrayList;
import java.util.List;

public class CouponsAdapter  extends RecyclerView.Adapter<CouponsAdapter.ViewHolder> {

    private List<Coupons> couponsList;
    private Context context;

    public CouponsAdapter(Context context) {
        couponsList = new ArrayList<>();
        this.context = context;
    }

    @NonNull
    @Override
    public CouponsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.coupon_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CouponsAdapter.ViewHolder holder, int position) {
        final Coupons list = couponsList.get(position);
        holder.tvTitle.setText(list.getDescription());
        holder.tvDetails.setText(list.getSub_description());
    }

    public void addList(List<Coupons> currenctList) {
        this.couponsList = currenctList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return couponsList != null ? couponsList.size() : 0;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle,tvDetails;

        public ViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDetails = (TextView) itemView.findViewById(R.id.tvDetails);


        }
    }
}
