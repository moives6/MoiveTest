package zhaoxixiang.bwie.com.weiyingtest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.hjm.bottomtabbar.BottomTabBar;

import zhaoxixiang.bwie.com.weiyingtest.Fragment.Discovery;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.FragMySelf;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.ShouYeFragment;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.ZhuanFragment;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar mainTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        initView();

        mainTabBar.init(getSupportFragmentManager())
                .setImgSize(60,60)
                .setFontSize(10)
                .setTabPadding(10,10,10)
                .setChangeColor(Color.RED,Color.DKGRAY)
                .setTabBarBackgroundResource(R.mipmap.bottom_bg)
                .addTabItem("精选",R.mipmap.found_select,R.mipmap.found,ShouYeFragment.class)
                .addTabItem("专题",R.mipmap.special_select,R.mipmap.special,ZhuanFragment.class)
                .addTabItem("发现",R.mipmap.fancy_select,R.mipmap.fancy,Discovery.class)
                .addTabItem("我的",R.mipmap.my_select,R.mipmap.my,FragMySelf.class);

    }

    private void initView() {
        mainTabBar = (BottomTabBar) findViewById(R.id.main_tabBar);
    }
}
