package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;

import zhaoxixiang.bwie.com.weiyingtest.Bean.XiangQingBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PlayMainPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PlayPresenter;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.PlayView;

/**

 comment

 * Created by 胡靖宇 on 2017/12/15.
 */

public class Introduce_play extends Fragment implements PlayView {
    PlayPresenter playPresenter;
    TextView dy,zy;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        View view = View.inflate(getContext(), R.layout.introduceplay, null);
        Intent intent = getActivity().getIntent();
        String dataId = intent.getStringExtra("dataId");
        playPresenter = new PlayMainPresenter(this);
        playPresenter.setData(dataId);
        dy=view.findViewById(R.id.daoyan);
        zy=view.findViewById(R.id.zhuyan);
        return view;
    }

    @Override
    public void getData(XiangQingBean xiangQingBean) {
        dy.setText("导演:"+xiangQingBean.getRet().getDirector());
        zy.setText("主演:"+xiangQingBean.getRet().getActors());
    }
}
