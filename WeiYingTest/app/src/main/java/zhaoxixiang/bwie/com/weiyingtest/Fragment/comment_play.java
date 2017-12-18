package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Adapter.Commentadapter;
import zhaoxixiang.bwie.com.weiyingtest.Bean.PingLunBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.XiangQingBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.commentbean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.CommentPrestenerSe;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PlayMainPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PlayPresenter;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.PlayView;
import zhaoxixiang.bwie.com.weiyingtest.View.commentView;

/**

 comment

 * Created by 胡靖宇 on 2017/12/15.
 */

public class comment_play extends Fragment implements PlayView,commentView {

    PlayPresenter playPresenter;
    String dataId;
    RecyclerView rc;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        View view = View.inflate(getContext(), R.layout.commentplay, null);
        Intent intent = getActivity().getIntent();
        dataId = intent.getStringExtra("dataId");
        playPresenter = new PlayMainPresenter(this);
        playPresenter.setData(dataId);

        CommentPrestenerSe commentPrestenerSe=new CommentPrestenerSe(this);
        commentPrestenerSe.relevancecomment();

        rc=view.findViewById(R.id.comment_rc);
        rc.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    @Override
    public void getData(XiangQingBean xiangQingBean) {

    }

    @Override
    public void ShowloginData(PingLunBean commentbean) {
     List<PingLunBean.RetBean.ListBean> list=   commentbean.getRet().getList();
        Commentadapter commentadapter=new Commentadapter(getActivity(),list);
        rc.setAdapter(commentadapter);

    }

    @Override
    public String getdataid() {
        return dataId;
    }
}
