package com.example.ninetaildemonfox.recyclerviewdemo.adp;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.ninetaildemonfox.recyclerviewdemo.Bean;
import com.example.ninetaildemonfox.recyclerviewdemo.R;

import java.util.List;

/**
 * Created by NineTailDemonFox on 2019/4/10.
 */

public class Recycler2Adp extends BaseQuickAdapter<Bean.ResultBean.VideoBean, BaseViewHolder> {


    public Recycler2Adp(int item_layout_rv) {
        super(item_layout_rv);
    }

    @Override
    protected void convert(BaseViewHolder helper, Bean.ResultBean.VideoBean item) {
        helper.setText(R.id.text_title, item.getColumnName());
        ImageView imageView = helper.itemView.findViewById(R.id.image);
        Glide.with(mContext).load(item.getCoverImgUrl()).into(imageView);
    }
}
