package zhaoxixiang.bwie.com.weiyingtest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Adapter.XqAdapter;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.XqMainPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.XqPresenter;
import zhaoxixiang.bwie.com.weiyingtest.View.XqView;

import zhaoxixiang.bwie.com.weiyingtest.Adapter.XqAdapter;

import zhaoxixiang.bwie.com.weiyingtest.activity.PlayerActivity;


public class XiangQActivity extends AppCompatActivity implements XqView{

    private SharedPreferences user;
    private TextView xq_title;
    private RecyclerView xq_rlv;
    private ImageView xq_iv;
    XqPresenter xqPresenter;
    private List<ShouYeBean.RetBean.ListBean.ChildListBean> childList;
    private SharedPreferences.Editor editor;
    private String dataId;
    private String description;
    private List<FenLeiBean.RetBean.ListBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_q);
        user = getSharedPreferences("user",MODE_PRIVATE);
        editor = user.edit();

        xqPresenter = new XqMainPresenter(this);
        xqPresenter.setData();
        xq_title = (TextView)findViewById(R.id.xq_title);
        xq_rlv = (RecyclerView)findViewById(R.id.xq_rlv);
        xq_iv = (ImageView)findViewById(R.id.xq_iv);
        xq_rlv.setLayoutManager(new GridLayoutManager(this,3));

        /*Intent intent = getIntent();
        String title = intent.getStringExtra("title");*/
        //xq_title.setText(title);
        xq_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void getData(FenLeiBean fenLeiBean) {
        list = fenLeiBean.getRet().getList();

        XqAdapter xqAdapter = new XqAdapter(this, list);
        xq_rlv.setAdapter(xqAdapter);
        xqAdapter.setOnXqItemListener(new XqAdapter.OnXqItemListener() {
            @Override
            public void OnXqItemClick(int position) {
                Intent intent = new Intent(XiangQActivity.this, PlayerActivity.class);
                dataId = list.get(position).getDataId();
                description = list.get(position).getDescription();
                editor.putString("dataId", dataId);

                intent.putExtra("dataId",dataId);
                intent.putExtra("description",description);
                startActivity(intent);
            }
        });
    }
}
