package com.bwie.myaidldemoserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by 王爱诗 on 2017/12/14.
 */

public class MainService extends Service {

    private ServiceBinder binder=new ServiceBinder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
