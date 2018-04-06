package com.example.ebc003.gymapp.CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;

/**
 * Created by EBC003 on 03-08-2017.
 */

public class MyCustomCheckbox extends android.support.v7.widget.AppCompatCheckBox{
    public MyCustomCheckbox(Context context) {
        super(context);
    }

    public MyCustomCheckbox(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"font/PT_Sans-Web-Regular.ttf"));
    }

    public MyCustomCheckbox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
