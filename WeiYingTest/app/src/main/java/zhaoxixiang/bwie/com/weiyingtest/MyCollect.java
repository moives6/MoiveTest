package zhaoxixiang.bwie.com.weiyingtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by 胡靖宇 on 2017/12/15.
 */

public class MyCollect extends AppCompatActivity {
    TextView clean;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycollect);

        clean= (TextView) findViewById(R.id.mycollect_ql);
        recyclerView= (RecyclerView) findViewById(R.id.mycollect_rc);
        //设置gridview适配器
        recyclerView.setLayoutManager(new GridLayoutManager(MyCollect.this,3));



        }
    }
