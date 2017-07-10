package com.boost.jyoung.facebook_pratice.Model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class ListItem extends BaseItem{

    public String main_header_name;
    public int main_header_cnt;
    public int profile;
    public String user_name;
    public String other_name;
    public int time;
    public String content;
    public int main_img;
    public int like_cnt;
    public int comment_cnt;
    public int share_cnt;

    public ListItem(int viewTpye){
        super(viewTpye);
    }

    public ListItem(int viewType, String main_header_name, int main_header_cnt, int profile, String user_name, String other_name, int time, String content, int main_img, int like_cnt, int comment_cnt, int share_cnt) {
        super(viewType);
        this.main_header_name = main_header_name;
        this.main_header_cnt = main_header_cnt;
        this.profile = profile;
        this.user_name = user_name;
        this.other_name = other_name;
        this.time = time;
        this.content = content;
        this.main_img = main_img;
        this.like_cnt = like_cnt;
        this.comment_cnt = comment_cnt;
        this.share_cnt = share_cnt;
    }

    @BindingAdapter({"bind:setImg"})
    public static void setImageResource(ImageView imageView, int resid) {
        imageView.setImageResource(resid);
    }

    public String getMain_header_name() {
        return main_header_name;
    }

    public int getMain_header_cnt() {
        return main_header_cnt;
    }

    public int getProfile() {
        return profile;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getOther_name() {
        return other_name;
    }

    public int getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public int getMain_img() {
        return main_img;
    }

    public int getLike_cnt() {
        return like_cnt;
    }

    public int getComment_cnt() {
        return comment_cnt;
    }

    public int getShare_cnt() {
        return share_cnt;
    }


}