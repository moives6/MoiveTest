package zhaoxixiang.bwie.com.weiyingtest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by admin on 2017/12/15/015.
 */

public class SetActivity extends AppCompatActivity {
    private ImageView setBack;
    private RelativeLayout setTuijian;
    private RelativeLayout setHuancun;
    private RelativeLayout setGuanyu;
    private RelativeLayout setJianyi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        initView();

        setBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initView() {
        setBack = (ImageView) findViewById(R.id.set_back);
        setTuijian = (RelativeLayout) findViewById(R.id.set_tuijian);
        setHuancun = (RelativeLayout) findViewById(R.id.set_huancun);
        setGuanyu = (RelativeLayout) findViewById(R.id.set_guanyu);
        setJianyi = (RelativeLayout) findViewById(R.id.set_jianyi);
    }
}
