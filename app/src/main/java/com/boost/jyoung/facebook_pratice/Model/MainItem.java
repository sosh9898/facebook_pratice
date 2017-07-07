package com.boost.jyoung.facebook_pratice.Model;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class MainItem {

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


    public MainItem(String main_header_name, int main_header_cnt, int profile, String user_name, String other_name, int time, String content, int main_img, int like_cnt, int comment_cnt, int share_cnt) {
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
}
