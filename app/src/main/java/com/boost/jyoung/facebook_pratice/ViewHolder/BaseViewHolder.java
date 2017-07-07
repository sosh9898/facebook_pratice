package com.boost.jyoung.facebook_pratice.ViewHolder;

import android.content.ClipData;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.boost.jyoung.facebook_pratice.Model.MainItem;
import com.boost.jyoung.facebook_pratice.R;
import com.boost.jyoung.facebook_pratice.databinding.FragmentHeaderItemBinding;
import com.boost.jyoung.facebook_pratice.databinding.FragmentMainItemBinding;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {
    public TextView main_header;
    public ImageView profile;
    public TextView user_name;
    public TextView other_name;
    public TextView main_content;
    public ImageView main_img;
    public TextView like_cnt;
    public TextView comment_cnt;
    public TextView time;

    public ImageView like_img;
    public ImageView click_like_img;
    public ImageView comment_img;
    public ImageView share_img;


    public BaseViewHolder(View view) {
        super(view);

        main_header = (TextView)view.findViewById(R.id.main_header);
        profile = (ImageView) view.findViewById(R.id.profile);
        user_name = (TextView)view.findViewById(R.id.user_name);
        other_name = (TextView)view.findViewById(R.id.other_name);
        main_content = (TextView)view.findViewById(R.id.content_text);
        main_img = (ImageView)view.findViewById(R.id.content_img);
        like_cnt = (TextView)view.findViewById(R.id.like_cnt);
        comment_cnt = (TextView)view.findViewById(R.id.comment_cnt);
        time = (TextView)view.findViewById(R.id.time_text);

        like_img = (ImageView)view.findViewById(R.id.like_img);
        click_like_img = (ImageView)view.findViewById(R.id.click_like);
        comment_img = (ImageView)view.findViewById(R.id.comment_img);
        share_img = (ImageView)view.findViewById(R.id.share_img);
    }
}

