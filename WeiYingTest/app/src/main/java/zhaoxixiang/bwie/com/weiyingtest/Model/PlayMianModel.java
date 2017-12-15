package zhaoxixiang.bwie.com.weiyingtest.Model;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.weiyingtest.Bean.XiangQingBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PlayPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Util.API;
import zhaoxixiang.bwie.com.weiyingtest.Util.ApiService;
import zhaoxixiang.bwie.com.weiyingtest.Util.RetrofitUtils;

/**
 * Created by FLOWER on 2017/12/15.
 */

public class PlayMianModel implements PlayModel{
    PlayPresenter playPresenter;

    public PlayMianModel(PlayPresenter playPresenter) {
        this.playPresenter = playPresenter;
    }

    @Override
    public void setData(String dataId) {
        ApiService apiService = RetrofitUtils.getInstance().getApiService(API.url,ApiService.class);
        Observable<XiangQingBean> xiangQing = apiService.getXiangQing(dataId);
        xiangQing.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<XiangQingBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(XiangQingBean xiangQingBean) {
                        playPresenter.getData(xiangQingBean);
                    }
                });
    }
}
