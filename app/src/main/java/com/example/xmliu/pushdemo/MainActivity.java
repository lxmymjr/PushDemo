package com.example.xmliu.pushdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView rid = findViewById(R.id.rid);
        GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(this);
        String RegIdText = FirebaseInstanceId.getInstance().getToken();
        Log.d("RID", "onCreate: " + RegIdText);
        rid.setText(RegIdText);
    }
}
