package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daprlabs.aaron.swipedeck.SwipeDeck;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Adapter.SwipeDeckAdapter;
import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.SearchBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.DiscoveryPresenter.DiscoveryPresenterSe;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.DiscoveryView.ShowDiscoveryView;

/**
 * Created by 胡靖宇 on 2017/12/14.
 */

public class Discovery extends Fragment implements ShowDiscoveryView {
    SwipeDeck swipeDeck;
    private SwipeDeckAdapter adapter;
    List<FenLeiBean.RetBean.ListBean> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        View view=  View.inflate(getContext(), R.layout.discoveryfragment,null);


        swipeDeck=view.findViewById(R.id.swipe_deck);

        swipeDeck.setCallback(new SwipeDeck.SwipeDeckCallback() {
            @Override
            public void cardSwipedLeft(long stableId) {

            }

            @Override
            public void cardSwipedRight(long stableId) {

            }
        });

        DiscoveryPresenterSe ds=new DiscoveryPresenterSe(this);
        ds.PresenterDisData();
       ;

        return view;
    }

    @Override
    public void ShowDiscoveryData(FenLeiBean searchBean) {
        list= searchBean.getRet().getList();
        adapter=new SwipeDeckAdapter(getActivity(),list);
        swipeDeck.setAdapter(adapter);
    }

}
