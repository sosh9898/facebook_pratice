package com.boost.jyoung.facebook_pratice.Tab;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.boost.jyoung.facebook_pratice.Adapter.RecyclerAdapter;
import com.boost.jyoung.facebook_pratice.Model.ListItem;
import com.boost.jyoung.facebook_pratice.R;
import com.boost.jyoung.facebook_pratice.databinding.FragmentMainBinding;

import java.util.ArrayList;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class Newsfeed_fragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    ArrayList<ListItem> listItems;
    RecyclerAdapter recyclerAdapter;
    FragmentMainBinding binding;



    public Newsfeed_fragment() {
    }

    public static Newsfeed_fragment newInstance(){
        Newsfeed_fragment fragment = new Newsfeed_fragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        binding.rcv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        binding.rcv.setHasFixedSize(true);

        binding.refreshlayout.setOnRefreshListener(this);

        listItems = new ArrayList<ListItem>();
        listItems.add(new ListItem(RecyclerAdapter.TYPE_HEADER));
        listItems.add(new ListItem(RecyclerAdapter.TYPE_BASE,"문경현",
                52,
                R.drawable.kakao5,
                "김준영",
                "boostcamp",
                1,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 김준영입니다.",
                R.drawable.boostcamp,
                27,21,42));
        listItems.add(new ListItem(RecyclerAdapter.TYPE_BASE,"정순호",
                66,
                R.drawable.kakao2,
                "문경현",
                "boostcamp",
                2,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 문경현입니다.",
                R.drawable.boostcamp,
                47,24,15));
        listItems.add(new ListItem(RecyclerAdapter.TYPE_BASE,"최진주",
                42,
                R.drawable.kakao4,
                "정순호",
                "boostcamp",
                3,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 정순호입니다.",
                R.drawable.boostcamp,
                57,41,82));
        listItems.add(new ListItem(RecyclerAdapter.TYPE_BASE,"나영열",
                34,
                R.drawable.kakao1,
                "최진주",
                "boostcamp",
                4,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 최진주입니다.",
                R.drawable.boostcamp,
                87,21,42));
        listItems.add(new ListItem(RecyclerAdapter.TYPE_BASE,"김준영",
                11,
                R.drawable.kakao6,
                "이지건",
                "boostcamp",
                5,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 이지건입니다.",
                R.drawable.boostcamp,
                87,21,42));
        listItems.add(new ListItem(RecyclerAdapter.TYPE_BASE,"이지건",
                8,
                R.drawable.kakao4,
                "나영열",
                "boostcamp",
                6,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 나영열입니다.",
                R.drawable.boostcamp,
                87,21,42));

        recyclerAdapter = new RecyclerAdapter(listItems, getContext(), itemClickListener);
        binding.rcv.setAdapter(recyclerAdapter);

    }

    @Override
    public void onRefresh() {
        binding.refreshlayout.setRefreshing(false);
        Toast.makeText(getContext(), "reload!", Toast.LENGTH_SHORT).show();
    }

    RecyclerAdapter.ItemClickListener itemClickListener = new RecyclerAdapter.ItemClickListener() {
        @Override
        public void Clicked(String msg) {
            Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    };
}