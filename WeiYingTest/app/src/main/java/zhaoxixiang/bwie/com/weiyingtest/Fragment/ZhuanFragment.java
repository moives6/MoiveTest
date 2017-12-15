package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Adapter.ZtAdapter;
import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.ZtMainPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.ZtPresenter;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.ZtView;





import zhaoxixiang.bwie.com.weiyingtest.XiangQActivity;



/**
 * Created by FLOWER on 2017/12/14.
 */






public class ZhuanFragment extends Fragment implements ZtView{
    private RecyclerView rlv;
    ZtPresenter ztPresenter;
    private SharedPreferences user;
    private SharedPreferences.Editor editor;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.zhuanti_fragment, container, false);

        user = getActivity().getSharedPreferences("user", Context.MODE_PRIVATE);
        editor = user.edit();

        ztPresenter = new ZtMainPresenter(this);
        ztPresenter.setData();

        rlv = (RecyclerView)view.findViewById(R.id.rlv);
        rlv.setLayoutManager(new GridLayoutManager(getContext(),2));
        return view;
    }

    @Override
    public void getData(ShouYeBean shouYeBean) {
        final List<ShouYeBean.RetBean.ListBean> list = shouYeBean.getRet().getList();

        //Log.i("xxx",ret.getList().toString());
        ZtAdapter ztAdapter = new ZtAdapter(getActivity(),list);
        rlv.setAdapter(ztAdapter);

        ztAdapter.setOnItemListener(new ZtAdapter.OnItemListener() {
            @Override
            public void OnItemClick(int position) {
                String title = list.get(position).getTitle();
                Intent intent = new Intent(getActivity(), XiangQActivity.class);
                startActivity(intent);
                intent.putExtra("title",title);
            }
        });
    }


}
