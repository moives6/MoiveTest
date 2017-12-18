package zhaoxixiang.bwie.com.weiyingtest.activity;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Adapter.FuliAdapter;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FavBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.GankItemBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.FuliPresenter;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.FuliView;

/**
 * Created by admin on 2017/12/16/016.
 */

public class FuliActivity extends AppCompatActivity implements FuliView{
    private RecyclerView fuliRlv;
    private ImageView fuliBack;
    private FuliPresenter presenter;
    private List<FavBean.ResultsBean> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuli);

        initView();

        presenter=new FuliPresenter(this);
        presenter.get();
        fuliBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void initView() {
        fuliRlv = (RecyclerView) findViewById(R.id.fuli_rlv);
        fuliRlv.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        fuliBack = (ImageView) findViewById(R.id.fuli_back);
        list=new ArrayList<>();
    }

    @Override
    public void getFuli(FavBean baseBean) {
        list=baseBean.getResults();
        FuliAdapter adapter=new FuliAdapter(FuliActivity.this,list);
        fuliRlv.setAdapter(adapter);
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        fuliRlv.addItemDecoration(decoration);
    }

    @Override
    public int getnum() {
        return 500;
    }

    @Override
    public int getpage() {
        return 1;
    }
    public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

        private int space;

        public SpacesItemDecoration(int space) {
            this.space=space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            outRect.left=space;
            outRect.right=space;
            outRect.bottom=space;
            if(parent.getChildAdapterPosition(view)==0){
                outRect.top=space;
            }
        }
    }
}
