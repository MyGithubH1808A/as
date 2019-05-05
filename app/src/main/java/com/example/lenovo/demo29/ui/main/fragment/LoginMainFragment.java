package com.example.lenovo.demo29.ui.main.fragment;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.demo29.R;
import com.example.lenovo.demo29.bean.BaseFragment;
import com.example.lenovo.demo29.presenter.LoginMainPresenter;
import com.example.lenovo.demo29.ui.main.activity.WebViewActivity;
import com.example.lenovo.demo29.view.LoginMainIView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 作者：周子强
 * 邮箱：1670375515@qq.com
 * 时间：2019/5/5
 * 项目工作空间：Demo29
 */
public class LoginMainFragment extends BaseFragment<LoginMainIView, LoginMainPresenter> implements LoginMainIView {

    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @BindView(R.id.tv_hello)
    TextView mTvHello;
    @BindView(R.id.tv_login)
    TextView mTvLogin;
    @BindView(R.id.tv_coutry_code)
    TextView mTvCoutryCode;
    @BindView(R.id.et_phone)
    EditText mEtPhone;
    @BindView(R.id.btn_send_verify)
    Button mBtnSendVerify;
    @BindView(R.id.ll_container)
    LinearLayout mLlContainer;
    @BindView(R.id.view)
    View mView;
    @BindView(R.id.ll_or)
    LinearLayout mLlOr;
    @BindView(R.id.iv_wechat)
    ImageView mIvWechat;
    @BindView(R.id.iv_qq)
    ImageView mIvQq;
    @BindView(R.id.iv_sina)
    ImageView mIvSina;
    @BindView(R.id.tv_protocol)
    TextView mTvProtocol;

    @Override
    protected LoginMainPresenter initPresenter() {
        return new LoginMainPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login_main;
    }

    @OnClick({R.id.iv_back, R.id.btn_send_verify, R.id.iv_wechat, R.id.iv_qq, R.id.iv_sina})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                break;
            case R.id.btn_send_verify:
                break;
            case R.id.iv_wechat:
                break;
            case R.id.iv_qq:
                break;
            case R.id.iv_sina:
                break;
        }
    }

    @Override
    protected void initView() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getResources().getString(R.string.agree_protocol));
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                WebViewActivity.startAct(getActivity());
            }
        };
        spannableStringBuilder.setSpan(clickableSpan, 13, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        //下划线
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableStringBuilder.setSpan(underlineSpan, 13, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        //前景色
        ForegroundColorSpan what = new ForegroundColorSpan(
                getResources().getColor(R.color.c_fa6a13));
        spannableStringBuilder.setSpan(what, 13, 17, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        //需要设置这个ClickableSpan才会有效果
        mTvProtocol.setMovementMethod(LinkMovementMethod.getInstance());
        mTvProtocol.setText(spannableStringBuilder);
    }
}
