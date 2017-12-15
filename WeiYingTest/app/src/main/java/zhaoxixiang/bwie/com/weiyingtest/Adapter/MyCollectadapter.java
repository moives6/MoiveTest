package zhaoxixiang.bwie.com.weiyingtest.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by 胡靖宇 on 2017/11/23.
 */

public class MyCollectadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>implements View.OnClickListener{
    private OnItemClickListener mOnItemClickListener = null;
    List<FenLeiBean.RetBean.ListBean> list;
    Context context;
    public MyCollectadapter(Context context, List<FenLeiBean.RetBean.ListBean> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=   LayoutInflater.from(context).inflate(R.layout.item_discovery,parent,false);
        //将创建的View注册点击事件
        view.setOnClickListener(this);
        return new MySearch_viewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MySearch_viewHolder mv=new MySearch_viewHolder(holder.itemView);
        mv.itemView.setTag(position);
        mv.tv_name.setText(list.get(position).getDescription().toString());
        mv.img.setImageURI(list.get(position).getPic().toString());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View view) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取position
            mOnItemClickListener.onItemClick(view,(int)view.getTag());
        }
    }
    //点击事件
    public static interface OnItemClickListener {
        void onItemClick(View view, int position);

    }
    //最后暴露给外面的调用者，定义一个设置Listener的方法
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public class MySearch_viewHolder extends RecyclerView.ViewHolder{

        TextView tv_name;
        SimpleDraweeView img;
        public MySearch_viewHolder(View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.text_collect);
            img=itemView.findViewById(R.id.collect_image_view);

        }
    }
}
