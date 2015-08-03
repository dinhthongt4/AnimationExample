package com.example.thong.animationexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @ViewById(R.id.btnAcDe)
    Button mBtnAcDe;

    @Click(R.id.btnAcDe)
    void intentAcDeExample() {
        Intent intent = new Intent(this,AccelerateActivity_.class);
        startActivity(intent);
    }
}