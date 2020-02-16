package com.jy.frame.base;

import android.content.Context;
import android.os.Bundle;

import com.jy.frame.interfaces.IBaseView;
import com.jy.frame.interfaces.IPersenter;

import androidx.appcompat.app.AppCompatActivity;


public abstract class BaseActivity<V extends IBaseView,P extends IPersenter> extends AppCompatActivity implements IBaseView {

    protected Context context;
    protected P persenter;



    protected Bundle pageBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.pageBundle = savedInstanceState;

        setContentView(getLayout());

            context = this;

            initView();

            initData();
        }


    //获取布局
    protected abstract int getLayout();

    //初始化布局
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();

    //创建P
    protected abstract P createPersenter();



    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String err) {

    }


}
