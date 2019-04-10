package com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.ninetaildemonfox.recyclerviewdemo.Bean;
import com.example.ninetaildemonfox.recyclerviewdemo.R;
import com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju.zitiaomu.ViewHolderBottom;
import com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju.zitiaomu.ViewHolderContext;
import com.example.ninetaildemonfox.recyclerviewdemo.adp.duobuju.zitiaomu.ViewHolderHead;
import com.truizlop.sectionedrecyclerview.SectionedRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Admin
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
//SectionedRecyclerViewAdapter
public class VipCoursesAdapter extends SectionedRecyclerViewAdapter<ViewHolderHead, ViewHolderContext, ViewHolderBottom> {
    private Context context;
    private List<String> data;
    private List<List<Bean.ResultBean.VideoBean>> listContext;

    public VipCoursesAdapter(Context context) {
        this.context = context;
    }


    public VipCoursesAdapter(Context context, List<String> data, List<List<Bean.ResultBean.VideoBean>> listContext) {
        this.context = context;
        this.data = data;
        this.listContext = listContext;
    }

    public void setAdd( List<String> data, List<List<Bean.ResultBean.VideoBean>> listContext){
        this.data = data;
        this.listContext = listContext;
    }

    public void addList(ArrayList<Map<String, String>> data) {
        data.addAll(data);
    }

    @Override
    protected int getSectionCount() {
        return data == null ? 0 : data.size();
    }

    //表示第几个条目
    @Override
    protected int getItemCountForSection(int section) {
//        ArrayList<Map<String, String>> lesson_data = JSONUtils.parseKeyAndValueToMapList(data.get(section).get("lesson_data"));
//        return lesson_data.size();
        return listContext == null ? 0 : listContext.get(section).size();
    }

    //返回true表示含有脚视图
    @Override
    protected boolean hasFooterInSection(int section) {
        return true;
    }

    //头部布局
    @Override
    protected ViewHolderHead onCreateSectionHeaderViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolderHead(LayoutInflater.from(context).inflate(R.layout.itme_home_view_title, parent, false));
    }

    //脚部布局
    @Override
    protected ViewHolderBottom onCreateSectionFooterViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolderBottom(LayoutInflater.from(context).inflate(R.layout.item_home_bottom, parent, false));
    }

    //中间的布局
    @Override
    protected ViewHolderContext onCreateItemViewHolder(ViewGroup parent, int viewType) {


        return new ViewHolderContext(LayoutInflater.from(context).inflate(R.layout.itme_home_view_context, parent, false), context);
    }

    //传向是头部的数据
    @Override
    protected void onBindSectionHeaderViewHolder(ViewHolderHead holder, int section) {
        holder.introduction(data.get(section));
    }

    //传向脚部的数据
    @Override
    protected void onBindSectionFooterViewHolder(ViewHolderBottom holder, int section) {

    }

    //传向中间的数据
    @Override
    protected void onBindItemViewHolder(ViewHolderContext holder, final int section, final int position) {

        Bean.ResultBean.VideoBean videoBean = listContext.get(section).get(position);
        holder.introduction(videoBean);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vipCoursesAdapterClickListener != null) {
                    vipCoursesAdapterClickListener.vipCoursesAdapterClickListener(view, section, position);
                }
            }
        });

    }

    //点击事件的接口回调
    private VipCoursesAdapterClickListener vipCoursesAdapterClickListener;

    public interface VipCoursesAdapterClickListener {
        void vipCoursesAdapterClickListener(View view, int section, int position);
    }

    public void setOnVipCoursesClickListener(VipCoursesAdapterClickListener listener) {
        vipCoursesAdapterClickListener = listener;
    }
}
