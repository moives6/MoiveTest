package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by admin on 2017/12/13/013.
 */

public class FragMySelf extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.myself_frag,container,false);
        //view.getBackground().mutate().setAlpha(0);

        return view;
    }
}
