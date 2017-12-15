package zhaoxixiang.bwie.com.weiyingtest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by admin on 2017/12/15/015.
 */

public class LiShiActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView lishiBack;
    private TextView lishiClean;
    private RecyclerView lishiRlv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lishi);

        initView();

//        lishiBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(LiShiActivity.this,"返回",Toast.LENGTH_LONG).show();
//            }
//        });
//        lishiClean.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(LiShiActivity.this,"清除",Toast.LENGTH_LONG).show();
//            }
//        });

    }

    private void initView() {
        lishiBack = (ImageView) findViewById(R.id.lish_back);
        lishiClean = (TextView) findViewById(R.id.lishi_clean);
        lishiRlv = (RecyclerView) findViewById(R.id.lishi_rlv);
        lishiRlv.setLayoutManager(new GridLayoutManager(this,3));
        lishiBack.setOnClickListener(this);
        lishiClean.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lish_back:
                Toast.makeText(LiShiActivity.this,"返回",Toast.LENGTH_LONG).show();
                finish();
                break;
            case R.id.lishi_clean:
                Toast.makeText(LiShiActivity.this,"清除",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
