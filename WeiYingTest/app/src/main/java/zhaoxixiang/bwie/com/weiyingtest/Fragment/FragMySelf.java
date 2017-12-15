package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.activity.LiShiActivity;

/**
 * Created by admin on 2017/12/13/013.
 */

public class FragMySelf extends Fragment {
    private ImageView myselfSet;
    private RelativeLayout myselfLishi;
    private RecyclerView myselfRlv;
    private RelativeLayout myselfHauncun;
    private RelativeLayout myselfShoucang;
    private RelativeLayout myselfZhuti;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myself_frag, container, false);
        /*getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
*/
        myselfSet = (ImageView) view.findViewById(R.id.myself_set);
        myselfLishi = (RelativeLayout) view.findViewById(R.id.myself_lishi);
        myselfRlv = (RecyclerView) view.findViewById(R.id.myself_rlv);
        myselfHauncun = (RelativeLayout) view.findViewById(R.id.myself_hauncun);
        myselfShoucang = (RelativeLayout) view.findViewById(R.id.myself_shoucang);
        myselfZhuti = (RelativeLayout) view.findViewById(R.id.myself_zhuti);
        myselfSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        myselfHauncun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"敬请期待",Toast.LENGTH_LONG).show();
            }
        });
        myselfLishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), LiShiActivity.class);
                startActivity(intent);
            }
        });
        myselfShoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        myselfZhuti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
