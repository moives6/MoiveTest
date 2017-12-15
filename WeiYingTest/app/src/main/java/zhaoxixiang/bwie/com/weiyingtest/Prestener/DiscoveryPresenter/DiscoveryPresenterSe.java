package zhaoxixiang.bwie.com.weiyingtest.Prestener.DiscoveryPresenter;

import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.SearchBean;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.Discovery;
import zhaoxixiang.bwie.com.weiyingtest.Model.DiscoveryModel.ShowDiscoveryModel;
import zhaoxixiang.bwie.com.weiyingtest.Model.DiscoveryModel.ShowDiscoveryModelse;
import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.OnFinishDiscovery;
import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.ShowDiscoveryView;

/**
 * Created by 胡靖宇 on 2017/12/14.
 */

public class DiscoveryPresenterSe implements DiscoveryPresenter,OnFinishDiscovery {

    ShowDiscoveryView showDiscoveryView;
    ShowDiscoveryModelse showDiscoveryModel;

    public DiscoveryPresenterSe(ShowDiscoveryView showDiscoveryView) {
        this.showDiscoveryView=showDiscoveryView;

        showDiscoveryModel= new ShowDiscoveryModel();
    }

    @Override
    public void PresenterDisData() {
       showDiscoveryModel.getDisData(this);
    }

    @Override
    public void onSuccessDis(FenLeiBean seBean) {
        showDiscoveryView.ShowDiscoveryData(seBean);
    }
}
