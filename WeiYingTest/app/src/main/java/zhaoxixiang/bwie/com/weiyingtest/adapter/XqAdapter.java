package zhaoxixiang.bwie.com.weiyingtest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.FenLeiBean;
import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by FLOWER on 2017/12/14.
 */

public class XqAdapter extends RecyclerView.Adapter<XqAdapter.MyViewHolder>{
    private Context context;
    private List<FenLeiBean.RetBean.ListBean> list = new ArrayList<>();

    public XqAdapter(Context context, List<FenLeiBean.RetBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.xiangqing_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.xq_tv.setText(list.get(position).getDescription());
        Picasso.with(context).load(list.get(position).getPic()).into(holder.xq_img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private final ImageView xq_img;
        private final TextView xq_tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            xq_img = (ImageView)itemView.findViewById(R.id.xq_img);
            xq_tv = (TextView)itemView.findViewById(R.id.xq_tv);
        }
    }
}
