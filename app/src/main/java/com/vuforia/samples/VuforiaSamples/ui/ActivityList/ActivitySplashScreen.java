/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other 
countries.
===============================================================================*/

package com.vuforia.samples.VuforiaSamples.ui.ActivityList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.vuforia.samples.VuforiaSamples.R;

//应用程序从这里开始，这个活动是一个启动界面
public class ActivitySplashScreen extends Activity
{
//    启动界面显示时间：0.45秒
    private static long SPLASH_MILLIS = 450;
    
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        该界面无标题，全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        LayoutInflater用来加载布局文件的（.xml）
        LayoutInflater inflater = LayoutInflater.from(this);
//        使用inflater方法加载一个布局文件
        RelativeLayout layout = (RelativeLayout) inflater.inflate(
            R.layout.splash_screen, null, false);
//        设置布局参数
        addContentView(layout, new LayoutParams(LayoutParams.MATCH_PARENT,
            LayoutParams.MATCH_PARENT));
//        Handle实例化，它负责处理pstDeylayed()方法发出的Message
        final Handler handler = new Handler();
//        延迟SPLASH_MILLIS时间后启动
        handler.postDelayed(new Runnable()
        {
            
            @Override
            public void run()
            {
                
                Intent intent = new Intent(ActivitySplashScreen.this,
                    ActivityLauncher.class);
                startActivity(intent);
                
            }
            
        }, SPLASH_MILLIS);
    }
    
}
