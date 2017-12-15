package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.Myimageloader;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PreInter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PreSx;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.ShiPinActivity;
import zhaoxixiang.bwie.com.weiyingtest.View.ViewInter;
import zhaoxixiang.bwie.com.weiyingtest.Adapter.RecycAdapter;

/**
 * Created by 王爱诗 on 2017/12/14.
 */

public class ShouYeFragment extends Fragment implements ViewInter{
    private List<ShouYeBean.RetBean.ListBean> list1;
    private View view;
    private RecyclerView recyc;
    private Banner banner;
    private List<String> vlist;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        view = View.inflate(getActivity(), R.layout.shouyefragment,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();

        vlist = new ArrayList<String>();
        vlist.add("http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/11/20/1511144172307028693.jpg");
        vlist.add("http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/11/03/1509674836179084610.jpg");
        vlist.add("http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/11/13/1510554001280066272.jpg");
        vlist.add("http://yweb1.cnliveimg.com/cnlive/public/160623173845025_495.jpg");
        vlist.add("http://phonemovie.ks3-cn-beijing.ksyun.com/image/2017/12/01/1512110434460035423.jpg");
        getimage();

        PreInter preInter = new PreSx(this);
        preInter.re();
    }

    private void initView() {
        recyc = (RecyclerView)view.findViewById(R.id.recyclerView);
        banner = (Banner)view.findViewById(R.id.banner);
    }

    private void getimage() {

        banner.setImageLoader(new Myimageloader());

        banner.setImages(vlist);

        banner.setDelayTime(2000);
        banner.start();
    }

    @Override
    public void getBean(ShouYeBean shouYeBean) {
        list1 = shouYeBean.getRet().getList();
        recyc.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecycAdapter adapter=new RecycAdapter(getActivity(), list1);
        recyc.setAdapter(adapter);
        String angleIcon = list1.get(0).getChildList().get(0).getAngleIcon();
        Log.i("code", angleIcon);

        adapter.setOnItemClickListener(new RecycAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
               //startActivity(new Intent(getActivity(),Main2Activity.class));
                Intent intent=new Intent(getActivity(), ShiPinActivity.class);
                startActivity(intent);
            }
        });
    }
}
