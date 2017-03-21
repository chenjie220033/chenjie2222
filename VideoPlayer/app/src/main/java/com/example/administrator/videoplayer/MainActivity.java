package com.example.administrator.videoplayer;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements OnTabSelectListener {

    @BindView(R.id.bottom_bar)
    BottomBar bottomBar;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
//        设置导航选择的监听事件
        bottomBar.setOnTabSelectListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    //     底部导航栏某一项选择的时候触发的
    @Override
    public void onTabSelected(@IdRes int tabId) {
        switch (tabId) {
            case R.id.tab_home:
                Toast.makeText(this, "首页", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tab_movie:
                Toast.makeText(this, "影视", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tab_sign:
                Toast.makeText(this, "更多", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tab_circle:
                Toast.makeText(this, "圈子", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tab_my:
                Toast.makeText(this, "我的", Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new UnsupportedOperationException("unsuppor");

        }
    }
}
