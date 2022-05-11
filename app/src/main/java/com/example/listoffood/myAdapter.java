package com.example.listoffood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private Context mContext;
    private List<FoodData> myFoodlist;

    public myAdapter(Context mContext, List<FoodData> myFoodlist) {
        this.mContext = mContext;
        this.myFoodlist = myFoodlist;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup ViewGroup, int i) {

        View mView = LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.recycler_row_item, ViewGroup, false);
        return new FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int i) {
    foodViewHolder.imageView.setImageResource(myFoodlist.get(i).getItemImage());
    foodViewHolder.mTitle.setText(myFoodlist.get(i).getItemName());
    foodViewHolder.mPrice.setText(myFoodlist.get(i).getItemPrice());
    }

    @Override
    public int getItemCount() {
        return myFoodlist.size();
    }
}

class FoodViewHolder extends RecyclerView.ViewHolder {

   ImageView imageView;
   TextView mTitle, mPrice;
   CardView mCardview;


    public FoodViewHolder(View itemView) {
        super(itemView);
       imageView = itemView.findViewById(R.id.ivImage);
       mTitle = itemView.findViewById(R.id.tvTitle);
       mPrice = itemView.findViewById(R.id.tvPrice);

       mCardview = itemView.findViewById(R.id.myCardView);

    }
}