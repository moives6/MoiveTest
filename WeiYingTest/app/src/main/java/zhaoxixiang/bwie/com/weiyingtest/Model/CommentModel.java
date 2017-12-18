package zhaoxixiang.bwie.com.weiyingtest.Model;

import zhaoxixiang.bwie.com.weiyingtest.View.OnFinishComment;

/**
 * Created by 胡靖宇 on 2017/12/17.
 */

public interface CommentModel {
    void getcommentData(OnFinishComment commentPresenter);

    //获取二级列表id
    void getdataid(String dataid);
}
