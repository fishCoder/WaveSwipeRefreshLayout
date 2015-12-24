package com.maimengmami.waverrefreshlayoutdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maimengmami.waveswiperefreshlayout.WaveSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    WaveSwipeRefreshLayout waveSwipeRefreshLayout;
    RecyclerView recyclerView;

    ArrayList<String> mData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        waveSwipeRefreshLayout = (WaveSwipeRefreshLayout) findViewById(R.id.wave_layout);
        int homepage_refresh_spacing = 40;
        waveSwipeRefreshLayout.setProgressViewOffset(false, -homepage_refresh_spacing * 2, homepage_refresh_spacing);
        waveSwipeRefreshLayout.setOnRefreshListener(new WaveSwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                waveSwipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh();
                        adapter.notifyDataSetChanged();
                        waveSwipeRefreshLayout.setRefreshing(false);
                    }
                },2000);
            }

            @Override
            public void onLoad() {
                waveSwipeRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        more();
                        adapter.notifyDataSetChanged();
                        waveSwipeRefreshLayout.setLoading(false);
                    }
                },2000);
            }

            @Override
            public boolean canLoadMore() {
                return true;
            }

            @Override
            public boolean canRefresh() {
                return true;
            }


        });
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        refresh();
        setupRecyclerView(recyclerView);

    }


    void refresh(){
        mData.clear();
        Random random = new Random();
        for (int i=0;i<15;i++){
            mData.add("num : "+random.nextInt());
        }
    }

    void more(){
        Random random = new Random();
        for (int i=0;i<15;i++){
            mData.add("num : "+random.nextInt());
        }
    }




    private void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }


    RecyclerView.Adapter adapter = new  RecyclerView.Adapter<RecyclerView.ViewHolder>() {


       class ViewHolder extends RecyclerView.ViewHolder {

            public final TextView textView;

            public ViewHolder(View view) {
                super(view);
                textView = (TextView) view.findViewById(R.id.text);
            }


        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ((ViewHolder)holder).textView.setText("txt"+position);
        }


        @Override
        public int getItemCount() {
            return mData.size();
        }
    };



}
