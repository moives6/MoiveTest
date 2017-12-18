package zhaoxixiang.bwie.com.weiyingtest.Prestener;

import zhaoxixiang.bwie.com.weiyingtest.Bean.PingLunBean;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.comment_play;
import zhaoxixiang.bwie.com.weiyingtest.Model.CommentModel;
import zhaoxixiang.bwie.com.weiyingtest.Model.CommentModelse;
import zhaoxixiang.bwie.com.weiyingtest.Model.DiscoveryModel.ShowDiscoveryModel;
import zhaoxixiang.bwie.com.weiyingtest.View.OnFinishComment;
import zhaoxixiang.bwie.com.weiyingtest.View.commentView;

/**
 * Created by 胡靖宇 on 2017/12/17.
 */

public class CommentPrestenerSe implements CommentPrestener,OnFinishComment{
    commentView commentView;
    CommentModel cModel;
    public CommentPrestenerSe(commentView commentView) {
        this.commentView=commentView;
        cModel=new CommentModelse();
    }

    @Override
    public void relevancecomment() {
        cModel.getdataid(commentView.getdataid());
        cModel.getcommentData(this);
    }

    @Override
    public void onSuccessComm(PingLunBean commentb) {
        commentView.ShowloginData(commentb);
    }
}
