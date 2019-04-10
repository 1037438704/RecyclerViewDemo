package com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju.zitiaomu;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.ninetaildemonfox.recyclerviewdemo.R;

/**
 * Created by Administrator on 2019/3/7.
 */

public class ViewHolderHead extends RecyclerView.ViewHolder {
    private TextView text_time_title;
    private Context me;

    public ViewHolderHead(View itemView) {
        super(itemView);
        text_time_title = itemView.findViewById(R.id.text_time_title);
    }

    public ViewHolderHead(View itemView, Context me) {
        super(itemView);
        this.me = me;
    }
    public void introduction(String text){
        text_time_title.setText(text);
    }

}
