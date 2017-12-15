package zhaoxixiang.bwie.com.weiyingtest.Prestener;

import zhaoxixiang.bwie.com.weiyingtest.Bean.XiangQingBean;
import zhaoxixiang.bwie.com.weiyingtest.Model.PlayMianModel;
import zhaoxixiang.bwie.com.weiyingtest.Model.PlayModel;
import zhaoxixiang.bwie.com.weiyingtest.View.PlayView;

/**
 * Created by FLOWER on 2017/12/15.
 */

public class PlayMainPresenter implements PlayPresenter{
    PlayModel playModel;
    PlayView playView;

    public PlayMainPresenter(PlayView playView) {
        this.playView = playView;
        playModel = new PlayMianModel(this);
    }

    @Override
    public void setData(String dataId) {
        playModel.setData(dataId);
    }

    @Override
    public void getData(XiangQingBean xiangQingBean) {
        playView.getData(xiangQingBean);
    }
}
