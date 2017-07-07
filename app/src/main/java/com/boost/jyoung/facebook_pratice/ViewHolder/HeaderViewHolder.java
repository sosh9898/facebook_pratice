package com.boost.jyoung.facebook_pratice.ViewHolder;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.boost.jyoung.facebook_pratice.BR;
import com.boost.jyoung.facebook_pratice.Model.MainItem;
import com.boost.jyoung.facebook_pratice.R;
import com.boost.jyoung.facebook_pratice.databinding.FragmentHeaderItemBinding;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class HeaderViewHolder extends RecyclerView.ViewHolder {
    public ImageView camara;
    public ImageView mystory;
    public ImageView profile;

    public HeaderViewHolder(View view) {
        super(view);

        camara = (ImageView)view.findViewById(R.id.camara);
        mystory = (ImageView)view.findViewById(R.id.mystory);
        profile = (ImageView)view.findViewById(R.id.profile);
    }

}

