package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

<<<<<<< HEAD
import com.daprlabs.aaron.swipedeck.SwipeDeck;

=======
import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.ZtMainPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.ZtPresenter;
>>>>>>> 75858a54ef3a7cc583b1ec2013d21132ae31e1d4
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.ZtView;
import zhaoxixiang.bwie.com.weiyingtest.adapter.ZtAdapter;

/**
 * Created by FLOWER on 2017/12/14.
 */

<<<<<<< HEAD
public class ZhuanFragment extends Fragment{

=======
public class ZhuanFragment extends Fragment implements ZtView{
    private RecyclerView rlv;
    ZtPresenter ztPresenter;
>>>>>>> 75858a54ef3a7cc583b1ec2013d21132ae31e1d4

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.zhuanti_fragment, container, false);

        ztPresenter = new ZtMainPresenter(this);
        ztPresenter.setData();

        rlv = (RecyclerView)view.findViewById(R.id.rlv);
        rlv.setLayoutManager(new GridLayoutManager(getContext(),2));
        return view;
    }

    @Override
    public void getData(ShouYeBean shouYeBean) {
        List<ShouYeBean.RetBean.ListBean> list = shouYeBean.getRet().getList();
        //Log.i("xxx",ret.getList().toString());
        ZtAdapter ztAdapter = new ZtAdapter(getActivity(),list);
        rlv.setAdapter(ztAdapter);
    }
}
