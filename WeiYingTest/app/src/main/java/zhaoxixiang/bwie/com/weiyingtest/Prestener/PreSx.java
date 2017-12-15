package zhaoxixiang.bwie.com.weiyingtest.Prestener;

import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.ShouYeFragment;
import zhaoxixiang.bwie.com.weiyingtest.Listener;
import zhaoxixiang.bwie.com.weiyingtest.Model.ModelInter;
import zhaoxixiang.bwie.com.weiyingtest.Model.ModelSx;
import zhaoxixiang.bwie.com.weiyingtest.View.ViewInter;

/**
 * Created by 王爱诗 on 2017/12/15.
 */

public class PreSx implements  PreInter,Listener{
    ViewInter viewInter;
    ModelInter modelInter;

    public PreSx(ShouYeFragment viewInter) {
        this.viewInter = viewInter;
        modelInter=new ModelSx();
    }


    @Override
    public void re() {
        modelInter.getData(this);
    }

    @Override
    public void onSuccess(ShouYeBean shouYeBean) {
        viewInter.getBean(shouYeBean);
    }
}
