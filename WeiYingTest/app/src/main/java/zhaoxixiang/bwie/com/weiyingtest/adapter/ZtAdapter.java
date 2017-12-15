package zhaoxixiang.bwie.com.weiyingtest.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by FLOWER on 2017/12/14.
 */

public class ZtAdapter extends RecyclerView.Adapter<ZtAdapter.MyViewHolder>{
    private Context context;
    private List<ShouYeBean.RetBean.ListBean> list = new ArrayList<>();
    private OnItemListener onItemListener;

    public ZtAdapter(Context context, List<ShouYeBean.RetBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }
    public interface OnItemListener{
        void OnItemClick(int position);
    }

    public void setOnItemListener(OnItemListener onItemListener) {
        this.onItemListener = onItemListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.zhuanti_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.zhuanti_title.setText(list.get(position).getTitle());
        List<ShouYeBean.RetBean.ListBean.ChildListBean> childList = list.get(0).getChildList();
        Picasso.with(context).load(childList.get(position).getPic()).into(holder.zhuanti_iv);
       /* for (int i = 0;i<childList.size();i++){
            String pic = childList.get(i).getPic();
            String[] split = pic.split("\\?");

            if (split[0]!=null&&i==0&&!"".equals(split[0])) {
                Log.i("SSSS",split[0]);
                Picasso.with(context).load(split[0]).into(holder.zhuanti_iv);
            }else {
                holder.zhuanti_iv.setImageResource(R.mipmap.ic_launcher);
            }
        }*/
      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if (onItemListener!=null){
                  onItemListener.OnItemClick(position);
              }
          }
      });
}

    @Override
    public int getItemCount() {
        return list.get(0).getChildList().size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView zhuanti_title;
        private final ImageView zhuanti_iv;
        private final RelativeLayout rl;

        public MyViewHolder(View itemView) {
            super(itemView);
            zhuanti_title = (TextView)itemView.findViewById(R.id.zhuanti_title);
            zhuanti_iv = (ImageView)itemView.findViewById(R.id.zhuanti_iv);
            rl = (RelativeLayout)itemView.findViewById(R.id.rl);
        }
    }
}
