package com.example.ebc003.gymapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityEnquiryFormTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry_form_two);
    }

    public void onClickEnqFormThree(View view) {
        Intent intent=new Intent(this,ActivityEnquiryFormThree.class);
        startActivity(intent);
    }
}
