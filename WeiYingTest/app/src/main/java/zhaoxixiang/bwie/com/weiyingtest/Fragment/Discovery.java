package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by 胡靖宇 on 2017/12/14.
 */

public class Discovery extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=  View.inflate(getContext(), R.layout.discoveryfragment,null);
        return view;
    }
}
