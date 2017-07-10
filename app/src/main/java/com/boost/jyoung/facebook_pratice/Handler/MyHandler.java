package com.boost.jyoung.facebook_pratice.Handler;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by jyoung on 2017. 7. 10..
 */

public class MyHandler extends Activity{
    public void LikeClick(){
        Toast.makeText(getApplicationContext(), "좋아요 클릭", Toast.LENGTH_SHORT).show();
    }
}
