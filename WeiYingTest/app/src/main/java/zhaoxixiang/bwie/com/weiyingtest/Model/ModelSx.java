package zhaoxixiang.bwie.com.weiyingtest.Model;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Listener;
import zhaoxixiang.bwie.com.weiyingtest.Util.ApiService;

/**
 * Created by 王爱诗 on 2017/12/15.
 */

public class ModelSx implements ModelInter {
    @Override
    public void getData(final Listener listener) {
        String url="http://api.svipmovie.com/front/";
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.svipmovie.com/front/").addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        Observable<ShouYeBean> observable = apiService.getShouYe();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShouYeBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ShouYeBean shouYeBean) {


                        listener.onSuccess(shouYeBean);
                    }
                });

    }
}
