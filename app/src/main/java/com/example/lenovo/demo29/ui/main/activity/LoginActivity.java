package com.example.lenovo.demo29.ui.main.activity;


import android.support.v4.app.FragmentManager;

import com.example.lenovo.demo29.R;
import com.example.lenovo.demo29.bean.BaseActivity;
import com.example.lenovo.demo29.presenter.LoginMainPresenter;
import com.example.lenovo.demo29.ui.main.fragment.LoginMainFragment;
import com.example.lenovo.demo29.view.LoginMainIView;

public class LoginActivity extends BaseActivity<LoginMainIView,LoginMainPresenter> implements LoginMainIView{

    @Override
    protected LoginMainPresenter initPresenter() {
        return new LoginMainPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.fl_container,new LoginMainFragment()).commit();
    }
}
