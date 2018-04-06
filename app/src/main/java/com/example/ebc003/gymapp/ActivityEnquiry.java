package com.example.ebc003.gymapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActivityEnquiry extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry);

        toolbar=new Toolbar(this);
        toolbar.setTitle("Enquiry");
    }

    public void onClickEnqFormTwo(View view) {
        Intent intent=new Intent(this,ActivityEnquiryFormTwo.class);
        startActivity(intent);
    }
}

