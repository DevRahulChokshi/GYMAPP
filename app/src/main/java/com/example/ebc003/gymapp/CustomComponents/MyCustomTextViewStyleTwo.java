package com.example.ebc003.gymapp.CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by EBC003 on 03-08-2017.
 */

public class MyCustomTextViewStyleTwo extends android.support.v7.widget.AppCompatTextView {
    public MyCustomTextViewStyleTwo(Context context) {
        super(context);
    }

    public MyCustomTextViewStyleTwo(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"font/PT_Sans-Web-Regular.ttf"));
    }

    public MyCustomTextViewStyleTwo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
