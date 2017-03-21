package com.example.administrator.videoplayer;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/3/20.
 */

public class WelcomeActivity extends Activity implements Animator.AnimatorListener {

    @BindView(R.id.welcome)
    ImageView welcome;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        unbinder = ButterKnife.bind(this);
        welcome.setAlpha(0.3f);
        welcome.animate()
                .alpha(1.0f)
                .scaleX(0.5f)
                .setDuration(3000)
                .setListener(this)
                .start();
    }

    @Override
    public void onAnimationStart(Animator animator) {

    }

    @Override
    public void onAnimationEnd(Animator animator) {
        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onAnimationCancel(Animator animator) {

    }

    @Override
    public void onAnimationRepeat(Animator animator) {

    }
}
