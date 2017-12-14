package zhaoxixiang.bwie.com.weiyingtest.Adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by 胡靖宇 on 2017/12/14.
 */

public class SwipeDeckAdapter extends BaseAdapter {
    List<FenLeiBean.RetBean.ListBean> list;
    Context context;
    public SwipeDeckAdapter(Context context, List<FenLeiBean.RetBean.ListBean> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoleder holder;
        if(view==null){

            holder=new ViewHoleder();
            view=View.inflate(context, R.layout.item_discovery,null);
            holder.tv=view.findViewById(R.id.text_dis);
            holder.draweeView=view.findViewById(R.id.dis_image_view);
            view.setTag(holder);
        }
        else {
           holder= (ViewHoleder) view.getTag();
        }

        holder.tv.setText(list.get(i).getDescription().toString());
        holder.draweeView.setImageURI(list.get(i).getPic().toString());
        return view;
    }

    class ViewHoleder{
        SimpleDraweeView draweeView ;
        TextView tv;
    }
}
