package zhaoxixiang.bwie.com.weiyingtest.Model;

import java.util.Random;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.weiyingtest.Bean.PingLunBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.commentbean;
import zhaoxixiang.bwie.com.weiyingtest.Util.API;
import zhaoxixiang.bwie.com.weiyingtest.Util.ApiService;
import zhaoxixiang.bwie.com.weiyingtest.Util.RetrofitUtils;
import zhaoxixiang.bwie.com.weiyingtest.View.OnFinishComment;

/**
 * Created by 胡靖宇 on 2017/12/17.
 */

public class CommentModelse  implements CommentModel{

    String id;
    @Override
    public void getcommentData(final OnFinishComment commentPresenter) {

        ApiService service= RetrofitUtils.getInstance().getApiService(API.url,ApiService.class);
        Observable<PingLunBean> observable=service.getPinglun(id,getNextPage());
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PingLunBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(PingLunBean searchBean) {

                        commentPresenter.onSuccessComm(searchBean);

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



    @Override
    public void getdataid(String dataid) {
        id=dataid;
    }
}
