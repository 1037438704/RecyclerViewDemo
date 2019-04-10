package com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju.zitiaomu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ninetaildemonfox.recyclerviewdemo.Bean;
import com.example.ninetaildemonfox.recyclerviewdemo.R;

import java.util.Map;


/**
 * Created by Administrator on 2019/3/7.
 */

public class ViewHolderContext extends RecyclerView.ViewHolder {
    private TextView text_title;
    private ImageView imageView;
    private Context me;

    public ViewHolderContext(View itemView) {
        super(itemView);
    }

    public ViewHolderContext(View itemView, Context me) {
        super(itemView);
        this.me = me;
        imageView = itemView.findViewById(R.id.imageView);
        text_title = itemView.findViewById(R.id.text_title);
    }

    public void introduction(Bean.ResultBean.VideoBean videoBean) {
        Glide.with(me).load(videoBean.getCoverImgUrl()).into(imageView);
        text_title.setText(videoBean.getTitle());
    }
}
