package com.example.thong.animationexample;

import android.app.Activity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * Created by thong on 04/08/2015.
 */
@EActivity(R.layout.activity_thread)
public class ThreadExample extends Activity {

    @AfterViews
    public void init() {
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread1");
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread2");
        runnableDemo1.start();
        runnableDemo2.start();
    }
}
