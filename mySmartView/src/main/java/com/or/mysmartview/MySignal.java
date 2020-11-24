package com.or.mysmartview;

import android.animation.Animator;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;


public class MySignal {
private static int SLOW = 1100;
private static int MEDIUM = 800;
private static int FAST = 550;
    private static final Handler handler = new Handler();
    private static int count = 6;
    private static String theText = "";
    private static SmartTextView smartTextView;
    private static int maxLen = 0;
    private static boolean isStop = true;
    private static int speed;

    public static void animateRotation(final SmartTextView text) {

        text.setScaleY(0);
        text.setScaleX(0);
        text.setRotation(0);


        text.animate()
                .scaleX(1)
                .scaleY(1)
                .setDuration(400)

                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {
                    }
                })
                .setInterpolator(new DecelerateInterpolator())
                .start();

    }



    static final Runnable mCountDown = new Runnable() {
        public void run() {
            if (count >= 0) {
                String temp =  theText.substring(0,maxLen - count);
                smartTextView.setText(temp + "");
                animateRotation(smartTextView);
                count--;
            } else {
                smartTextView.setVisibility(View.GONE);
            }
        }
    };

    public static void start(SmartTextView smartTextView1, int typefaceType) {
        switch (typefaceType)
        {
            case 0:
                speed = SLOW;
               break;
            case 1:
                speed = MEDIUM;
                break;
            case 2:
                speed = FAST;
                break;
            default:
                speed = MEDIUM;
            break;
        }
        smartTextView = smartTextView1;
        count = smartTextView1.getText().length();
        maxLen = smartTextView1.getText().length();
        theText = smartTextView1.getText().toString();
        String temp = theText.substring(0,maxLen-count);
        smartTextView.setText(temp);
        smartTextView.setVisibility(View.VISIBLE);

        for (int i = 0; i <= count; i++) {
            handler.postDelayed(mCountDown, i * speed);
        }

    }

}
