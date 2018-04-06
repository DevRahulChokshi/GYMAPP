package com.example.ebc003.gymapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by EBC003 on 01-08-2017.
 */

public class FragmentOverload extends Fragment {
    String current_date;
    String date;
    TextView textDate;
    TextView textMonth;
    TextView textDay;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_overload,container,false);
        textDate=(TextView)view.findViewById(R.id.text_currentDate);
        textMonth=(TextView)view.findViewById(R.id.text_currentMonth);
        textDay=(TextView)view.findViewById(R.id.text_currentDay);
        //saving curent date
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        current_date=date.toString();
        // textDate.setText(current_date);
        String[] dateParts = current_date.split("-");
        String year = dateParts[0];
        String month = dateParts[1];
        month=(String)android.text.format.DateFormat.format("MMMM", new Date());
        String day=dateParts[2];

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);
        textDate.setText(day);
        textMonth.setText(month);
        textDay.setText(dayOfTheWeek);
        return view;
    }
}
