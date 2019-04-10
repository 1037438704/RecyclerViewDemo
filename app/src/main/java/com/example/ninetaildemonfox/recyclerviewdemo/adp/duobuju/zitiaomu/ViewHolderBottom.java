package com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju.zitiaomu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ninetaildemonfox.recyclerviewdemo.R;

/**
 * Created by NineTailDemonFox on 2019/4/10.
 */

public class ViewHolderBottom extends RecyclerView.ViewHolder {
    private TextView textView;
    private Context me;

    public ViewHolderBottom(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_time_title);
    }

    public ViewHolderBottom(View itemView, Context me) {
        super(itemView);
        this.me = me;
    }

    public void introduction(String text) {
        textView.setText(text);
    }
}