package zhaoxixiang.bwie.com.weiyingtest.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.widget.media.AndroidMediaController;
import tv.danmaku.ijk.media.widget.media.IjkVideoView;
import zhaoxixiang.bwie.com.weiyingtest.Bean.XiangQingBean;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PlayMainPresenter;
import zhaoxixiang.bwie.com.weiyingtest.Prestener.PlayPresenter;
import zhaoxixiang.bwie.com.weiyingtest.R;
import zhaoxixiang.bwie.com.weiyingtest.View.PlayView;

/**
 * Created by FLOWER on 2017/12/15.
 */

public class PlayerActivity extends AppCompatActivity implements PlayView{
    private TextView mtitle;
    private IjkVideoView ivv;
    private ImageView back;
    private PagerSlidingTabStrip tabs;
    private ViewPager play_vp;
    PlayPresenter playPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        initView();
        Intent intent = getIntent();
        String dataId = intent.getStringExtra("dataId");
        String description = intent.getStringExtra("description");
        playPresenter = new PlayMainPresenter(this);
        playPresenter.setData(dataId);

    }
    private void initView(){
        mtitle = (TextView)findViewById(R.id.title);
        ivv = (IjkVideoView)findViewById(R.id.ivv);
        back = (ImageView)findViewById(R.id.back);
        tabs = (PagerSlidingTabStrip)findViewById(R.id.tabs);
        play_vp = (ViewPager)findViewById(R.id.play_vp);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void getData(XiangQingBean xiangQingBean) {
        String hdurl = xiangQingBean.getRet().getHDURL();
        String title = xiangQingBean.getRet().getTitle();

        mtitle.setText(title);

        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        AndroidMediaController controller = new AndroidMediaController(this, false);
        ivv.setMediaController(controller);
        ivv.setVideoURI(Uri.parse(hdurl));
        ivv.start();
        //Log.i("bbbb",hdurl);
    }
}
