package com.example.ebc003.gymapp;

import android.content.Context;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by EBC003 on 10-08-2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    Context context;
    private static final String TAG=MyFirebaseInstanceIDService.class.getSimpleName();

    MyFirebaseInstanceIDService(Context context){
        this.context=context;
    }

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
    }
}
