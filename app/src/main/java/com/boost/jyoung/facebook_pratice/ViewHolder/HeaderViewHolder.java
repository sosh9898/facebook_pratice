package com.boost.jyoung.facebook_pratice.ViewHolder;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.boost.jyoung.facebook_pratice.databinding.FragmentHeaderItemBinding;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class HeaderViewHolder extends RecyclerView.ViewHolder {
    public FragmentHeaderItemBinding binding;

    public HeaderViewHolder(View view) {
        super(view);
        binding = DataBindingUtil.bind(view);
    }
}

