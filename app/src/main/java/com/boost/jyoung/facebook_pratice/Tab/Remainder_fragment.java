package com.boost.jyoung.facebook_pratice.Tab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boost.jyoung.facebook_pratice.R;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class Remainder_fragment extends Fragment {
    public Remainder_fragment() {
    }

    public static Remainder_fragment newInstance(){
        Remainder_fragment fragment = new Remainder_fragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_remainder, container, false);
        return view;
    }
}
