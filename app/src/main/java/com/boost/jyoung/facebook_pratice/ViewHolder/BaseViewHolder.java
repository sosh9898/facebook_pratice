package com.boost.jyoung.facebook_pratice.ViewHolder;


import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.boost.jyoung.facebook_pratice.databinding.FragmentMainItemBinding;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {
    public FragmentMainItemBinding binding;

    public BaseViewHolder(View view) {
        super(view);
        binding = DataBindingUtil.bind(view);
    }
}

