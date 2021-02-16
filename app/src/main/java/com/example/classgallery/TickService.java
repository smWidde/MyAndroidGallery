package com.example.classgallery;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class TickService extends Service {
    public int time;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw  new UnsupportedOperationException();
    }
    @Override
    public void onCreate() {
        time = 0;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), "YES", Toast.LENGTH_SHORT);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {

    }
}
