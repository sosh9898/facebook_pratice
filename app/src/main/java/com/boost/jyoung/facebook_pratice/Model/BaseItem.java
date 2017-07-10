package com.boost.jyoung.facebook_pratice.Model;

/**
 * Created by jyoung on 2017. 7. 10..
 */

public class BaseItem {
    private int viewType;

    public BaseItem(int viewType) {
        this.viewType = viewType;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

}
