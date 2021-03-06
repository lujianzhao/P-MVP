package me.passin.pmvp.example.app.callback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import timber.log.Timber;

/**
 * <pre>
 * @author : passin
 * Contact me : https://github.com/passin95
 * Date: 2018/3/21 10:30
 * </pre>
 */
public class ActivityLifecycleCallbacksImpl implements Application.ActivityLifecycleCallbacks {

    private final static String EXAMPLE_PACKAGE_NAME = "me.passin.pmvp.example";

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if (activity.toString().contains(EXAMPLE_PACKAGE_NAME)) {
            Timber.w(activity + "implement  "+EXAMPLE_PACKAGE_NAME);
        }
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }
}