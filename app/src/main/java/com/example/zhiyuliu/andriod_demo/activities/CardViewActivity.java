package com.example.zhiyuliu.andriod_demo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import com.example.zhiyuliu.andriod_demo.R;
import com.example.zhiyuliu.andriod_demo.module.GirlFriend;

import java.util.List;

public class CardViewActivity extends AppCompatActivity {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List mGirlList;
    GirlFriend mGirlData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
    }
}
