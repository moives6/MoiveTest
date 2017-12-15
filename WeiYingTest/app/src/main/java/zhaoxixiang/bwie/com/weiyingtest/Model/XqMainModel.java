package zhaoxixiang.bwie.com.weiyingtest.Model;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.XqPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Util.API;
import zhaoxixiang.bwie.com.weiyingtest.Util.ApiService;
import zhaoxixiang.bwie.com.weiyingtest.Util.RetrofitUtils;

/**
 * Created by FLOWER on 2017/12/15.
 */

public class XqMainModel implements XqModel{
    XqPresenter xqPresenter;

    public XqMainModel(XqPresenter xqPresenter) {
        this.xqPresenter = xqPresenter;
    }

    @Override
    public void setData() {
        ApiService apiService = RetrofitUtils.getInstance().getApiService(API.url,ApiService.class);
        Observable<FenLeiBean> fenLei = apiService.getFenLei("402834815584e463015584e538140009", 1);
        fenLei.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FenLeiBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(FenLeiBean fenLeiBean) {
                        xqPresenter.getData(fenLeiBean);
                    }
                });
    }
}
