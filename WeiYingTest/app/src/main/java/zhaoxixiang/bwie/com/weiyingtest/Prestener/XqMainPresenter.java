package zhaoxixiang.bwie.com.weiyingtest.Prestener;

import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Model.XqMainModel;
import zhaoxixiang.bwie.com.weiyingtest.Model.XqModel;
import zhaoxixiang.bwie.com.weiyingtest.View.XqView;

/**
 * Created by FLOWER on 2017/12/15.
 */

public class XqMainPresenter implements XqPresenter{
    XqModel xqModel;
    XqView xqView;

    public XqMainPresenter(XqView xqView) {
        this.xqView = xqView;
        xqModel = new XqMainModel(this);
    }

    @Override
    public void setData() {
        xqModel.setData();
    }

    @Override
    public void getData(FenLeiBean fenLeiBean) {
        xqView.getData(fenLeiBean);
    }
}
