package com.example.ninetaildemonfox.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.ninetaildemonfox.recyclerviewdemo.adp.Recycler1Adp;
import com.example.ninetaildemonfox.recyclerviewdemo.adp.Recycler2Adp;
import com.example.ninetaildemonfox.recyclerviewdemo.adp.Recycler3Adp;
import com.example.ninetaildemonfox.recyclerviewdemo.utils.Shujuyuan;
import com.example.ninetaildemonfox.recyclerviewdemo.utils.map.JSONUtils;
import com.google.gson.Gson;
import com.kongzue.baseokhttp.HttpRequest;
import com.kongzue.baseokhttp.listener.ResponseListener;
import com.kongzue.baseokhttp.util.JsonUtil;
import com.kongzue.baseokhttp.util.Parameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView_1;
    private TextView text_1;
    private RecyclerView recyclerView_2;
    private TextView text_2;
    private RecyclerView recyclerView_3;
    private TextView text_3;
    private Recycler1Adp recycler1Adp;
    private Recycler2Adp recycler2Adp;
    private Recycler3Adp recycler3Adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        recyclerView_1 = findViewById(R.id.recyclerView_1);
        recyclerView_1.setLayoutManager(new GridLayoutManager(this,2));
        text_1 = findViewById(R.id.text_1);
        recyclerView_2 = findViewById(R.id.recyclerView_2);
        recyclerView_2.setLayoutManager(new GridLayoutManager(this,2));
        text_2 = findViewById(R.id.text_2);
        recyclerView_3 = findViewById(R.id.recyclerView_3);
        recyclerView_3.setLayoutManager(new GridLayoutManager(this,2));
        text_3 = findViewById(R.id.text_3);

        recycler1Adp = new Recycler1Adp(R.layout.item_layout_rv);
        recycler2Adp = new Recycler2Adp(R.layout.item_layout_rv);
        recycler3Adp = new Recycler3Adp(R.layout.item_layout_rv);

        recyclerView_1.setAdapter(recycler1Adp);
        recyclerView_2.setAdapter(recycler2Adp);
        recyclerView_3.setAdapter(recycler3Adp);
    }

    private void initData() {
        Gson gson = new Gson();
        Bean bean = gson.fromJson(Shujuyuan.Shuju, Bean.class);
        Bean.ResultBean result = bean.getResult();
        List<List<Bean.ResultBean.VideoBean>> video = result.getVideo();
        List<Bean.ResultBean.VideoBean> videoBeans = video.get(0);
        recycler1Adp.setNewData(videoBeans);
        List<Bean.ResultBean.VideoBean> videoBeans1 = video.get(1);
        recycler2Adp.setNewData(videoBeans1);
        List<Bean.ResultBean.VideoBean> videoBeans2 = video.get(2);
        recycler3Adp.setNewData(videoBeans2);
    }
}
