package zhaoxixiang.bwie.com.weiyingtest.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.ShouYeBean;
import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by 王爱诗 on 2017/12/15.
 */

public class RecycAdapter extends RecyclerView.Adapter<RecycAdapter.Myadapter> implements View.OnClickListener{
    private Context context;
    private List<ShouYeBean.RetBean.ListBean> list ;
    private OnItemClickListener mOnItemClickListener = null;
    public RecycAdapter(Context context, List<ShouYeBean.RetBean.ListBean> list) {
        this.context = context;
        this.list = list;
    }


    public static interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
    @Override
    public Myadapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.item, null);

        Myadapter myadapter=new Myadapter(inflate);
        inflate.setOnClickListener(this);
        return myadapter;
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取position
            mOnItemClickListener.onItemClick(v,(int)v.getTag());
        }
    }
    @Override
    public void onBindViewHolder(Myadapter holder, int position) {
        List<ShouYeBean.RetBean.ListBean.ChildListBean> childList = list.get(position).getChildList();

        holder.sdv.setImageURI(childList.get(0).getPic());
        holder.textView.setText(childList.get(0).getTitle());

        //将position保存在itemView的Tag中，以便点击时进行获取
        holder.itemView.setTag(position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myadapter extends RecyclerView.ViewHolder {
        SimpleDraweeView sdv;
        TextView textView;
        public Myadapter(View itemView) {
            super(itemView);
            sdv = itemView.findViewById(R.id.sdv);
            textView = itemView.findViewById(R.id.textview);
        }
    }
}
