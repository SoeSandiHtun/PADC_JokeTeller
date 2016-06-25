package net.sandi.exercise3;

import android.app.Application;
import android.content.Context;

/**
 * Created by UNiQUE on 6/25/2016.
 */
public class HarThaApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }
}
