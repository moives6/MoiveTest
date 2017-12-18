package zhaoxixiang.bwie.com.weiyingtest.Model;

import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.FuliFinishListener;
import zhaoxixiang.bwie.com.weiyingtest.View.OnFinishListener;

/**
 * Created by admin on 2017/12/16/016.
 */

public interface FuliModelLitener {
    void getData(FuliFinishListener listener, int num, int page);
}
