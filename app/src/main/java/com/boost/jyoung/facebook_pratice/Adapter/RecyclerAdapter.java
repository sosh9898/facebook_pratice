package com.boost.jyoung.facebook_pratice.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.boost.jyoung.facebook_pratice.BR;
import com.boost.jyoung.facebook_pratice.Model.MainItem;
import com.boost.jyoung.facebook_pratice.ViewHolder.BaseViewHolder;
import com.boost.jyoung.facebook_pratice.ViewHolder.HeaderViewHolder;
import com.boost.jyoung.facebook_pratice.databinding.FragmentHeaderItemBinding;
import com.boost.jyoung.facebook_pratice.databinding.FragmentMainItemBinding;

import java.util.ArrayList;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class RecyclerAdapter extends RecyclerView.Adapter {

    public static final int TYPE_HEADER =0;
    public static final int TYPE_BASE = 1;

    ArrayList<MainItem> mainItems;
    Context context;

    public RecyclerAdapter(ArrayList<MainItem> mainItems, Context context) {
        this.mainItems = mainItems;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_HEADER){
            FragmentHeaderItemBinding binding = FragmentHeaderItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            View view = binding.getRoot();
            return new HeaderViewHolder(view);
        }else if(viewType == TYPE_BASE){
            FragmentMainItemBinding binding = FragmentMainItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            View view = binding.getRoot();
            return new BaseViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof HeaderViewHolder){
            HeaderViewHolder headerViewHolder = (HeaderViewHolder)holder;
            headerViewHolder.camara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "camara click!!", Toast.LENGTH_SHORT).show();
                }
            });
            headerViewHolder.mystory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "mystory click!!", Toast.LENGTH_SHORT).show();

                }
            });
            headerViewHolder.profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "profile click!!", Toast.LENGTH_SHORT).show();

                }
            });
        }
        else if(holder instanceof BaseViewHolder){
            final MainItem mainItem = mainItems.get(position-1);
            final BaseViewHolder baseViewHolder = (BaseViewHolder)holder;

            setColorInPartitial(mainItem.main_header_name.toString(), "님 외 "+mainItem.main_header_cnt+"명이 여기에 댓글을 남겼습니다.", "#000000", baseViewHolder.main_header);
            baseViewHolder.profile.setBackgroundResource(mainItem.profile);
            baseViewHolder.user_name.setText(mainItem.user_name);
            baseViewHolder.other_name.setText(mainItem.other_name);
            baseViewHolder.main_content.setText(mainItem.content);
            baseViewHolder.main_img.setBackgroundResource(mainItem.main_img);
            baseViewHolder.like_cnt.setText(mainItem.other_name+"님 외 "+mainItem.like_cnt+"명");
            baseViewHolder.time.setText(mainItem.time+"시간");
            baseViewHolder.comment_cnt.setText("댓글 "+mainItem.comment_cnt+"개 공유 "+mainItem.share_cnt+"회");

            baseViewHolder.like_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainItem.like_cnt++;
                    baseViewHolder.like_img.setVisibility(View.INVISIBLE);
                    baseViewHolder.click_like_img.setVisibility(View.VISIBLE);
                    Toast.makeText(context, "like!!", Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();

                }
            });
            baseViewHolder.click_like_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainItem.like_cnt--;
                    baseViewHolder.like_img.setVisibility(View.VISIBLE);
                    baseViewHolder.click_like_img.setVisibility(View.GONE);
                    Toast.makeText(context, "like cancel;;", Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });
            baseViewHolder.comment_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainItem.comment_cnt++;
                    Toast.makeText(context, "comment click!", Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });
            baseViewHolder.share_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainItem.share_cnt++;
                    Toast.makeText(context, "share click!", Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });
        }
    }

    @Override
    public int getItemViewType (int position) {
        if(position == 0) {
            return TYPE_HEADER;
        } else return TYPE_BASE;
    }


    @Override
    public int getItemCount() {
        return mainItems != null ? mainItems.size()+1 : 0;
    }

    private TextView setColorInPartitial(String pre_string, String string, String color, TextView textView){
        SpannableStringBuilder builder = new SpannableStringBuilder(pre_string + string);
        builder.setSpan(new ForegroundColorSpan(Color.parseColor(color)), 0, pre_string.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.append(builder);
        return textView;
    }

}
