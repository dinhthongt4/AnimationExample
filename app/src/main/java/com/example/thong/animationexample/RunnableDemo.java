package com.example.thong.animationexample;

import android.util.Log;

/**
 * Created by thong on 04/08/2015.
 */
public class RunnableDemo implements Runnable {

    private Thread mThread;
    private String threadName;

    public RunnableDemo(String name) {
        this.threadName = name;
        Log.v("Creating", threadName);
    }

    @Override
    public void run() {
        Log.v("Running", threadName);

        for (int i = 4; i > 0; i--) {
            Log.v("Thread", threadName + "," + i);
            try {
                mThread.sleep(1000);
            } catch (InterruptedException e) {
                Log.v("Thread", threadName + "interrupted");
            }
        }

        Log.v("Thread", threadName + "exiting");
    }

    public void start() {
        Log.v("Starting", threadName);
        if (mThread == null) {
            mThread = new Thread(this, threadName);
            mThread.start();
        }
    }
}
