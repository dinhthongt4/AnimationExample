package com.example.thong.animationexample;

import android.app.Activity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by thong on 03/08/2015.
 */
@EActivity(R.layout.activity_acde)
public class AccelerateActivity extends Activity {

    @ViewById(R.id.button)
    Button button;

    @Click(R.id.button)
    void setAccelerateActivity() {
        button.startAnimation(AnimationUtils.loadAnimation(AccelerateActivity.this,R.anim.scale_button));

    }
}
