package com.boost.jyoung.facebook_pratice.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.boost.jyoung.facebook_pratice.Handler.MyHandler;
import com.boost.jyoung.facebook_pratice.Model.ListItem;
import com.boost.jyoung.facebook_pratice.ViewHolder.BaseViewHolder;
import com.boost.jyoung.facebook_pratice.ViewHolder.HeaderViewHolder;
import com.boost.jyoung.facebook_pratice.databinding.FragmentHeaderItemBinding;
import com.boost.jyoung.facebook_pratice.databinding.FragmentMainItemBinding;

import java.util.ArrayList;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class RecyclerAdapter extends RecyclerView.Adapter {

    public static final int TYPE_HEADER = 0;
    public static final int TYPE_BASE = 1;

    ArrayList<ListItem> listItems;
    Context context;

    public RecyclerAdapter(ArrayList<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case TYPE_HEADER:
                FragmentHeaderItemBinding binding_header = FragmentHeaderItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                view = binding_header.getRoot();
                return new HeaderViewHolder(view);
            case TYPE_BASE:
                FragmentMainItemBinding binding_base = FragmentMainItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                view = binding_base.getRoot();
                return new BaseViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeaderViewHolder) {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;

        } else if (holder instanceof BaseViewHolder) {
            ListItem listItem = listItems.get(position);
            BaseViewHolder baseViewHolder = (BaseViewHolder) holder;
            baseViewHolder.binding.setBase(listItem);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return listItems.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return listItems != null ? listItems.size() : 0;
    }








    ///////////////////////////////////////////////////////////////////////////////////////

//      baseViewHolder.binding.likeImg.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "좋아요 클릭", Toast.LENGTH_SHORT).show();
//        }
//    });
//            baseViewHolder.binding.commentImg.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "댓글 달기 클릭", Toast.LENGTH_SHORT).show();
//        }
//    });
//            baseViewHolder.binding.shareImg.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "공유하기 클릭", Toast.LENGTH_SHORT).show();
//        }
//    });

//    headerViewHolder.binding.profile.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "프로필 클릭", Toast.LENGTH_SHORT).show();
//        }
//    });
//            headerViewHolder.binding.mystory.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "마이스토리 클릭", Toast.LENGTH_SHORT).show();
//        }
//    });
//            headerViewHolder.binding.camara.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "카메라 클릭", Toast.LENGTH_SHORT).show();
//        }
//    });

}

