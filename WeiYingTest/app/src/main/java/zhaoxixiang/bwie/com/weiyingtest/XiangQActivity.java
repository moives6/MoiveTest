package zhaoxixiang.bwie.com.weiyingtest;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.XqMainPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.XqPresenter;
import zhaoxixiang.bwie.com.weiyingtest.View.XqView;
import zhaoxixiang.bwie.com.weiyingtest.Adapter.XqAdapter;

public class XiangQActivity extends AppCompatActivity implements XqView{

    private SharedPreferences user;
    private TextView xq_title;
    private RecyclerView xq_rlv;
    private ImageView xq_iv;
    XqPresenter xqPresenter;
    private List<ShouYeBean.RetBean.ListBean.ChildListBean> childList;
    private SharedPreferences.Editor editor;

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
        List<FenLeiBean.RetBean.ListBean> list = fenLeiBean.getRet().getList();
        for (int i = 0;i<list.size();i++){
            String dataId = list.get(i).getDataId();
            editor.putString("dataId",dataId);
        }
        XqAdapter xqAdapter = new XqAdapter(this,list);
        xq_rlv.setAdapter(xqAdapter);
    }
}
