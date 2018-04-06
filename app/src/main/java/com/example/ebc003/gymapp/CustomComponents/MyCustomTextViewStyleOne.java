package com.example.ebc003.gymapp.CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.TextView;

/**
 * Created by EBC003 on 01-08-2017.
 */

public class MyCustomTextViewStyleOne extends android.support.v7.widget.AppCompatTextView {
    public MyCustomTextViewStyleOne(Context context) {
        super(context);
    }

    public MyCustomTextViewStyleOne(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"font/DroidSerif.ttf"));
    }

    public MyCustomTextViewStyleOne(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
