package com.bwie.shouye;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 王爱诗 on 2017/12/13.
 */

public class MyApp extends Application {
    private static MyApp instance;
    private Set<Activity> allActivities;
    public static MyApp getInstance() {
        return instance;
    }
    static {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO);
    }

 /*   {

        //  PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        //  PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad", "http://sns.whalecloud.com");
    }*/
    @Override
    public void onCreate() {
        super.onCreate();
    //    UMShareAPI.get(this);
        instance = this;
     //   Logger.init("JiaXinCinema")//
                //.logLevel(LogLevel.FULL);//项目未上线时，所有日志都打印
        //  .logLevel(LogLevel.NONE);//项目上线，所有日志不会打印



    }

    /**
     * activity创建后，添加
     * @param act
     */
    public void registerActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new HashSet<Activity>();
        }
        allActivities.add(act);
    }

    /**
     * activity销毁后移除
     * @param act
     */
    public void unregisterActivity(Activity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }

    /**
     * 关闭所有activity，退出应用
     */
    public void exitApp() {
        if (allActivities != null) {
            synchronized (allActivities) {
                for (Activity act : allActivities) {
                    if (act != null && !act.isFinishing())
                        act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

}
