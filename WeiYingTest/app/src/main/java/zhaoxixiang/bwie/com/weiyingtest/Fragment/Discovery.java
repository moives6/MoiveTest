package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import com.facebook.drawee.backends.pipeline.Fresco;
import com.mcxtzhang.layoutmanager.swipecard.CardConfig;
import com.mcxtzhang.layoutmanager.swipecard.OverLayCardLayoutManager;
import com.mcxtzhang.layoutmanager.swipecard.RenRenCallback;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Adapter.Myadapter;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.DiscoveryPresenter.DiscoveryPresenterSe;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.ShowDiscoveryView;

/**
 * Created by 胡靖宇 on 2017/12/14.
 */

public class Discovery extends Fragment implements ShowDiscoveryView {
    RecyclerView swipeDeck;
    private Myadapter adapter;
    List<FenLeiBean.RetBean.ListBean> list;
    Button bt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        View view=  View.inflate(getContext(), R.layout.discoveryfragment,null);


        swipeDeck=view.findViewById(R.id.rc);
        bt=view.findViewById(R.id.bt_dis);
        DiscoveryPresenterSe ds=new DiscoveryPresenterSe(this);
        ds.PresenterDisData();

        swipeDeck.setLayoutManager(new OverLayCardLayoutManager());
        CardConfig.initConfig(getActivity());

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DiscoveryPresenterSe ds=new DiscoveryPresenterSe(Discovery.this);
                ds.PresenterDisData();
            }
        });


        return view;
    }

    @Override
    public void ShowDiscoveryData(FenLeiBean searchBean) {
        list= searchBean.getRet().getList();
        adapter=new Myadapter(getActivity(),list);
        ItemTouchHelper.Callback callback = new RenRenCallback(swipeDeck,adapter,list);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(swipeDeck);
        swipeDeck.setAdapter(adapter);

        adapter.setOnItemClickListener(new Myadapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                
                Toast.makeText(getActivity(), list.get(position).getDataId().toString(),Toast.LENGTH_SHORT).show();

            }
        });
    }

}
