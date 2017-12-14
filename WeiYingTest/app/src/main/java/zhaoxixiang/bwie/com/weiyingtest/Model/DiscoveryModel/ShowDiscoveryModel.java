package zhaoxixiang.bwie.com.weiyingtest.Model.DiscoveryModel;

import java.util.Random;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.SearchBean;
import zhaoxixiang.bwie.com.weiyingtest.Util.API;
import zhaoxixiang.bwie.com.weiyingtest.Util.ApiService;
import zhaoxixiang.bwie.com.weiyingtest.Util.RetrofitUtils;
import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.OnFinishDiscovery;

/**
 * Created by 胡靖宇 on 2017/12/14.
 */

public class ShowDiscoveryModel implements ShowDiscoveryModelse{


    @Override
    public void getDisData(final OnFinishDiscovery onFinishDiscovery) {
        ApiService service= RetrofitUtils.getInstance().getApiService(API.url,ApiService.class);
        Observable<FenLeiBean> observable=service.getFenLei("402834815584e463015584e539330016",getNextPage());
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FenLeiBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(FenLeiBean searchBean) {

                        onFinishDiscovery.onSuccessDis(searchBean);

                    }
                });
    }
    //随机数
    private int getNextPage() {

          int   page = getRandomNumber(1, 108);

        return page;
    }
    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max) % (max - min + 1) + min;
    }

}
