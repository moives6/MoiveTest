package zhaoxixiang.bwie.com.weiyingtest.Model;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FavBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.GankItemBean;
import zhaoxixiang.bwie.com.weiyingtest.Util.API;
import zhaoxixiang.bwie.com.weiyingtest.Util.ApiService;
import zhaoxixiang.bwie.com.weiyingtest.Util.RetrofitUtils;
import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.FuliFinishListener;
import zhaoxixiang.bwie.com.weiyingtest.View.OnFinishListener;

/**
 * Created by admin on 2017/12/16/016.
 */

public class FuliModel implements FuliModelLitener {
    @Override
    public void getData(final FuliFinishListener listener, int num, int page) {
        ApiService service = RetrofitUtils.getInstance().getApiService(API.HOST, ApiService.class);

        Observable<FavBean> observable = service.getGirlList(num, page);

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FavBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(FavBean gankItemBean) {
                        listener.onSuccess(gankItemBean);
                    }
                });
    }
}
