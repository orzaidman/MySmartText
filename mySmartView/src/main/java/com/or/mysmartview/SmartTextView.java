package com.or.mysmartview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;


@SuppressLint("AppCompatCustomView")
public class SmartTextView extends TextView {
    private boolean mShowText=false;
    private int textPos=0;
    private int typefaceSpeed;
    private Typeface typeface;

    public SmartTextView(Context context) {
        super(context);
        init(context);
        setExtra(context);
    }

    public SmartTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
        setExtra(context);

    }

    public SmartTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
        setExtra(context);

    }

    public SmartTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
        setExtra(context);

    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView, 0, 0);
        try {
            typefaceSpeed = ta.getInt(R.styleable.CustomTextView_speed012, 0);
        } finally {
            ta.recycle();
        }
        initTypeface(context);
    }

    private void init(Context context) {
        initTypeface(context);
    }

    private void initTypeface(Context context) {
        //You logic to use the variable typefaceType and accordingly set the typeface
        super.setTypeface(typeface);
    }


    private void setExtra(Context context) {
        Typeface typeface = ResourcesCompat.getFont(context, R.font.new_font);
        this.setTypeface(typeface);
        MySignal.start(this, typefaceSpeed);

    }


}