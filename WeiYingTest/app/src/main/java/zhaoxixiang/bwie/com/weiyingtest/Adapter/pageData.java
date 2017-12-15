package zhaoxixiang.bwie.com.weiyingtest.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import zhaoxixiang.bwie.com.weiyingtest.Fragment.Introduce_play;
import zhaoxixiang.bwie.com.weiyingtest.Fragment.comment_play;

/**
 * Created by 胡靖宇 on 2017/12/15.
 */

public  class pageData extends FragmentPagerAdapter {
    public pageData(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "简介";
            case 1:
                return "评论";
        }
            return "";
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;


        switch (position) {
            case 0:
                fragment = new Introduce_play();
                break;
            case 1:
                fragment = new comment_play();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2; // 代表页数
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // 这里Destroy的是Fragment的视图层次，并不是Destroy Fragment对象
        super.destroyItem(container, position, object);

    }


}
