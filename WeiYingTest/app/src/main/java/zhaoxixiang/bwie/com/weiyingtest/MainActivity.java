package zhaoxixiang.bwie.com.weiyingtest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hjm.bottomtabbar.BottomTabBar;

import zhaoxixiang.bwie.com.weiyingtest.Fragment.ShouYeFragment;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.ZhuanFragment;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar mainTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        mainTabBar.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.RED,Color.DKGRAY)
                .addTabItem("精选",R.mipmap.found_select,R.mipmap.found,ShouYeFragment.class)
                .addTabItem("专题",R.mipmap.special_select,R.mipmap.special,ZhuanFragment.class)
                .addTabItem("发现",R.mipmap.fancy_select,R.mipmap.fancy,ShouYe.class)
                .addTabItem("我的",R.mipmap.my_select,R.mipmap.my,ShouYe.class);

    }

    private void initView() {
        mainTabBar = (BottomTabBar) findViewById(R.id.main_tabBar);
    }
}
