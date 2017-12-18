package zhaoxixiang.bwie.com.weiyingtest.Adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
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
import zhaoxixiang.bwie.com.weiyingtest.Bean.XiangQingBean;
import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by FLOWER on 2017/12/14.
 */

public class qxAdapter extends RecyclerView.Adapter<qxAdapter.MyViewHolder>{
    private Context context;
    private List<XiangQingBean.RetBean.ListBean> list ;
    private OnItemListener onItemListener;



    public qxAdapter(Context context,List<XiangQingBean.RetBean.ListBean> list) {
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
        View view = LayoutInflater.from(context).inflate(R.layout.item_collect, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.zhuanti_title.setText(list.get(0).getChildList().get(position).getTitle());
        Picasso.with(context).load(list.get(0).getChildList().get(position).getPic()).into(holder.zhuanti_iv);
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


        public MyViewHolder(View itemView) {
            super(itemView);
            zhuanti_title = (TextView)itemView.findViewById(R.id.text_collect);
            zhuanti_iv = (ImageView)itemView.findViewById(R.id.collect_image_view);

        }
    }
}
