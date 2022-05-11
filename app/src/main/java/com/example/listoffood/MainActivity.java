package com.example.listoffood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("fried rice","$8.9", R.drawable.fried);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("amala", "$15", R.drawable.amala);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("yam and egg", "$37", R.drawable.yam);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("rice and stew", "$10", R.drawable.rice_and_stew);

        myFoodList.add(mFoodData);

        myAdapter myAdapter = new myAdapter(MainActivity.this, myFoodList);
        mRecyclerView.setAdapter(myAdapter);


    }
}