package zhaoxixiang.bwie.com.weiyingtest.Prestener;

import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Model.ZtMainModel;
import zhaoxixiang.bwie.com.weiyingtest.Model.ZtModel;
import zhaoxixiang.bwie.com.weiyingtest.View.ZtView;

/**
 * Created by FLOWER on 2017/12/14.
 */

public class ZtMainPresenter implements ZtPresenter{
    ZtView ztView;
    ZtModel ztModel;

    public ZtMainPresenter(ZtView ztView) {
        this.ztView = ztView;
        ztModel = new ZtMainModel(this);
    }

    @Override
    public void setData() {
        ztModel.setData();
    }

    @Override
    public void getData(ShouYeBean shouYeBean) {
        ztView.getData(shouYeBean);
    }
}
