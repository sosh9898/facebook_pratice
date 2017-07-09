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

import com.boost.jyoung.facebook_pratice.BR;
import com.boost.jyoung.facebook_pratice.Model.MainItem;
import com.boost.jyoung.facebook_pratice.R;
import com.boost.jyoung.facebook_pratice.databinding.FragmentHeaderItemBinding;
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

