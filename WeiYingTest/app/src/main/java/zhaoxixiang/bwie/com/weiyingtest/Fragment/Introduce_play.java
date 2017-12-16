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

    private static final int VIDEO_CONTENT_DESC_MAX_LINE = 3;// 默认展示最大行数3行
    private static final int SHOW_CONTENT_NONE_STATE = 0;// 扩充
    private static final int SHRINK_UP_STATE = 1;// 收起状态
    private static final int SPREAD_STATE = 2;// 展开状态
    private static int mState = SHRINK_UP_STATE;//默认收起状态

    PlayPresenter playPresenter;
    TextView dy,zy,jj,gd;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        View view = View.inflate(getContext(), R.layout.introduceplay, null);
        Intent intent = getActivity().getIntent();
        String dataId = intent.getStringExtra("dataId");
        playPresenter = new PlayMainPresenter(this);
        playPresenter.setData(dataId);
        dy=view.findViewById(R.id.daoyan);
        zy=view.findViewById(R.id.zhuyan);
        jj=view.findViewById(R.id.jianjie);
        gd=view.findViewById(R.id.gd);
        gd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mState == SPREAD_STATE) {
                    jj.setMaxLines(VIDEO_CONTENT_DESC_MAX_LINE);
                    jj.requestLayout();
                    gd.setText("↓展开");
                    mState = SHRINK_UP_STATE;
                } else if (mState == SHRINK_UP_STATE) {
                    jj.setMaxLines(Integer.MAX_VALUE);
                    jj.requestLayout();
                    mState = SPREAD_STATE;
                    gd.setText("↑收起");
                }
            }
        });


        return view;
    }

    @Override
    public void getData(XiangQingBean xiangQingBean) {
        dy.setText("导演:"+xiangQingBean.getRet().getDirector());
        zy.setText("主演:"+xiangQingBean.getRet().getActors());
        jj.setText("简介:"+xiangQingBean.getRet().getDescription());
    }
}
