package zhaoxixiang.bwie.com.weiyingtest.Adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import zhaoxixiang.bwie.com.weiyingtest.Bean.FavBean;
import zhaoxixiang.bwie.com.weiyingtest.Bean.GankItemBean;
import zhaoxixiang.bwie.com.weiyingtest.R;

/**
 * Created by admin on 2017/12/17/017.
 */

public class FuliAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<FavBean.ResultsBean> list;

    private List<Integer> mheights;
    public FuliAdapter(Context context, List<FavBean.ResultsBean> list) {
        this.context = context;
        this.list = list;
        mheights=new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.fuli_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        FavBean.ResultsBean bean=list.get(position);
        ViewHolder viewHolder= (ViewHolder) holder;
        if(mheights.size()<=position){
            mheights.add((int)(300+Math.random()*100));
        }

        ViewGroup.LayoutParams lp=viewHolder.iv.getLayoutParams();
        lp.height=mheights.get(position);
        viewHolder.iv.setLayoutParams(lp);

        String str=bean.getUrl();
        Uri uri=Uri.parse(str);
        viewHolder.iv.setImageURI(uri);
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private SimpleDraweeView iv;
        public ViewHolder(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.fuli_item);
        }
    }
    @Override
    public int getItemCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
