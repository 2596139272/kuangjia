package com.jy.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jy.frame.base.BaseActivity;
import com.jy.frame.interfaces.IPersenter;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPersenter createPersenter() {
        return null;
    }
}
