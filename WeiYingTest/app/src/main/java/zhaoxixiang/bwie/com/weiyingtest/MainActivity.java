package zhaoxixiang.bwie.com.weiyingtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar mainTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();


    }

    private void initView() {
        mainTabBar = (BottomTabBar) findViewById(R.id.main_tabBar);
    }
}
