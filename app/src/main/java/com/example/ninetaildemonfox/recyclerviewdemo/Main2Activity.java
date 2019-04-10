package com.example.ninetaildemonfox.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju.VipCoursesAdapter;
import com.example.ninetaildemonfox.recyclerviewdemo.utils.Shujuyuan;
import com.google.gson.Gson;
import com.truizlop.sectionedrecyclerview.SectionedSpanSizeLookup;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private VipCoursesAdapter vipCoursesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);

        vipCoursesAdapter = new VipCoursesAdapter(this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        SectionedSpanSizeLookup lookup = new SectionedSpanSizeLookup(vipCoursesAdapter, layoutManager);
        layoutManager.setSpanSizeLookup(lookup);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(vipCoursesAdapter);

        Gson gson = new Gson();
        Bean bean = gson.fromJson(Shujuyuan.Shuju, Bean.class);
        Bean.ResultBean result = bean.getResult();
        List<List<Bean.ResultBean.VideoBean>> video = result.getVideo();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < video.size(); i++) {
            Bean.ResultBean.VideoBean videoBean = video.get(i).get(0);
            list.add(videoBean.getColumnName());
        }
        vipCoursesAdapter.setAdd(list,video);
        vipCoursesAdapter.notifyDataSetChanged();
    }
}
