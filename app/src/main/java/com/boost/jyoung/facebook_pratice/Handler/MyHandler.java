package com.boost.jyoung.facebook_pratice.Handler;

import android.app.Activity;
import android.view.View;

import com.boost.jyoung.facebook_pratice.Adapter.RecyclerAdapter;

/**
 * Created by jyoung on 2017. 7. 10..
 */

public class MyHandler extends Activity{
    RecyclerAdapter.ItemClickListener itemClickListener;

    public MyHandler(RecyclerAdapter.ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
    public void LikeClick(View view){
        itemClickListener.Clicked("좋아요 클릭");
    }
    public void CommentClick(View view){
        itemClickListener.Clicked("댓글 달기 클릭");
    }
    public void ShareClick(View view){
        itemClickListener.Clicked("공유하기 클릭");
    }
    public void CamaraClick(View view){
        itemClickListener.Clicked("카메라 클릭");
    }
    public void MyStoryClick(View view){
        itemClickListener.Clicked("내 스토리 클릭");
    }
    public void ProfileClick(View view){
        itemClickListener.Clicked("프로필 클릭");
    }
}
