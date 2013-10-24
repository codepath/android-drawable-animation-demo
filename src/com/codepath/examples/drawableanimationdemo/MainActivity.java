package com.codepath.examples.drawableanimationdemo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btnAnimate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onAnimate(View v) {
		btnAnimate = (Button) findViewById(R.id.btnAnimate);
		final float originalY = btnAnimate.getY();
		// Slide up and off and then back down
		// See https://github.com/thecodepath/android_guides/wiki/Animations
		btnAnimate.animate().y(-100).setDuration(1000).setListener(new AnimatorListenerAdapter() {
			@Override
			public void onAnimationEnd(Animator animation) {
				btnAnimate.animate().y(originalY);
			}
		});
	}

}
