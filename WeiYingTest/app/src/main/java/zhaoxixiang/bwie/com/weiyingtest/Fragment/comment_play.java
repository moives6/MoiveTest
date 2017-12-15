package zhaoxixiang.bwie.com.weiyingtest.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;

import zhaoxixiang.bwie.com.weiyingtest.R;

/**

 comment

 * Created by 胡靖宇 on 2017/12/15.
 */

public class comment_play extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        View view = View.inflate(getContext(), R.layout.commentplay, null);

        return view;
    }
}
