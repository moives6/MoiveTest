package zhaoxixiang.bwie.com.weiyingtest.Prestener;

import zhaoxixiang.bwie.com.weiyingtest.Bean.BaseBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FavBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.GankItemBean;
import zhaoxixiang.bwie.com.weiyingtest.Model.FuliModel;
import zhaoxixiang.bwie.com.weiyingtest.Model.FuliModelLitener;
import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.FuliFinishListener;
import zhaoxixiang.bwie.com.weiyingtest.View.FuliView;
import zhaoxixiang.bwie.com.weiyingtest.View.OnFinishListener;

/**
 * Created by admin on 2017/12/16/016.
 */

public class FuliPresenter implements Presenter,FuliFinishListener{

    FuliModelLitener model;
    private FuliView view;
    public FuliPresenter(FuliView view){
        this.view=view;
        model=new FuliModel();
    }
    @Override
    public void get() {
        model.getData(this,view.getnum(),view.getpage());
    }


    @Override
    public void onSuccess(FavBean baseBean) {
        view.getFuli(baseBean);
    }
}
