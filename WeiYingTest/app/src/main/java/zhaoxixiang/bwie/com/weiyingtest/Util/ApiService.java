package zhaoxixiang.bwie.com.weiyingtest.Util;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FavBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.GankItemBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.PingLunBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.SearchBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.XiangQingBean;

/**
 * Created by admin on 2017/12/14/014.
 */

public interface ApiService {

    //首页
    @GET("homePageApi/homePage.do")
    Observable<ShouYeBean> getShouYe();

    //影片详情
    @FormUrlEncoded
    @POST("videoDetailApi/videoDetail.do")
    Observable<XiangQingBean> getXiangQing(@Field("mediaId")String mediaId);
    //分类列表
    @FormUrlEncoded
    @POST("columns/getVideoList.do")
    Observable<FenLeiBean> getFenLei(@Field("catalogId")String catalogId, @Field("pnum")int page);
    //搜索影片
    @FormUrlEncoded
    @POST("searchKeyWordApi/getVideoListByKeyWord.do")
    Observable<SearchBean> getSearch(@Field("keyword")String keyword, @Field("pnum")int page);
    //评论列表
    @FormUrlEncoded
    @POST("Commentary/getCommentList.do")
    Observable<PingLunBean> getPinglun(@Field("mediaId")String mediaId, @Field("pnum")int page);

    /**
     * 福利列表
     */
    @GET("data/福利/{num}/{page}")
    Observable<FavBean> getGirlList(@Path("num") int num, @Path("page") int page);

}
