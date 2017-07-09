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
import com.boost.jyoung.facebook_pratice.Model.MainItem;
import com.boost.jyoung.facebook_pratice.R;
import com.boost.jyoung.facebook_pratice.databinding.FragmentMainBinding;

import java.util.ArrayList;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class Newsfeed_fragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    ArrayList<MainItem> mainItems;
    LinearLayoutManager linearLayoutManager;
    RecyclerAdapter recyclerAdapter;
    FragmentMainBinding binding;


    public Newsfeed_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        View view = binding.getRoot();

        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.rcv.setLayoutManager(linearLayoutManager);
        binding.rcv.setHasFixedSize(true);

        binding.refreshlayout.setOnRefreshListener(this);


        mainItems = new ArrayList<MainItem>();
        mainItems.add(new MainItem("문경현",
                52,
                R.drawable.kakao5,
                "김준영",
                "boostcamp",
                1,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 김준영입니다.",
                R.drawable.boostcamp,
                27,21,42));
        mainItems.add(new MainItem("정순호",
                66,
                R.drawable.kakao2,
                "문경현",
                "boostcamp",
                2,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 문경현입니다.",
                R.drawable.boostcamp,
                47,24,15));
        mainItems.add(new MainItem("최진주",
                42,
                R.drawable.kakao4,
                "정순호",
                "boostcamp",
                3,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 정순호입니다.",
                R.drawable.boostcamp,
                57,41,82));
        mainItems.add(new MainItem("나영열",
                34,
                R.drawable.kakao1,
                "최진주",
                "boostcamp",
                4,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 최진주입니다.",
                R.drawable.boostcamp,
                87,21,42));
        mainItems.add(new MainItem("김준영",
                11,
                R.drawable.kakao6,
                "이지건",
                "boostcamp",
                5,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 이지건입니다.",
                R.drawable.boostcamp,
                87,21,42));
        mainItems.add(new MainItem("이지건",
                8,
                R.drawable.kakao4,
                "나영열",
                "boostcamp",
                6,
                "안녕하세요! 부스트캠프 2기 안드로이드 b조 나영열입니다.",
                R.drawable.boostcamp,
                87,21,42));


        recyclerAdapter = new RecyclerAdapter(mainItems, getContext());
        binding.rcv.setAdapter(recyclerAdapter);

        return view;
    }

    @Override
    public void onRefresh() {
        binding.refreshlayout.setRefreshing(false);
        Toast.makeText(getContext(), "reload!", Toast.LENGTH_SHORT).show();
    }


}
