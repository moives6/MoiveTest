package zhaoxixiang.bwie.com.weiyingtest.Model;

import android.util.Log;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.ZtPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Util.API;
import zhaoxixiang.bwie.com.weiyingtest.Util.ApiService;
import zhaoxixiang.bwie.com.weiyingtest.Util.RetrofitUtils;

/**
 * Created by FLOWER on 2017/12/14.
 */

public class ZtMainModel implements ZtModel{
    ZtPresenter ztPresenter;

    public ZtMainModel(ZtPresenter ztPresenter) {
        this.ztPresenter = ztPresenter;
    }

    @Override
    public void setData() {
        ApiService apiService = RetrofitUtils.getInstance().getApiService(API.url,ApiService.class);
        Observable<ShouYeBean> data = apiService.getShouYe();
        data.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ShouYeBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ShouYeBean shouYeBean) {
                        ztPresenter.getData(shouYeBean);
                        Log.i("xxx",shouYeBean.getRet().getList().toString());
                    }
                });
    }
}
