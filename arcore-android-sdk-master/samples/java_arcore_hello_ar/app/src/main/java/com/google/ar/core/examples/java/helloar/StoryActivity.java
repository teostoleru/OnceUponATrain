package com.google.ar.core.examples.java.helloar;

import android.content.Intent;
import android.content.res.Configuration;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;

import java.util.List;

public class StoryActivity extends AppCompatActivity {

    private GeofencingClient mGeofencingClient;

    Geofence geofence = new Geofence.Builder()
            .setRequestId("abc") // Geofence ID
            .setCircularRegion( 1111, 1111, 1000) // defining fence region
            // Transition types that it should look for
            .setTransitionTypes( Geofence.GEOFENCE_TRANSITION_EXIT)
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            launchActivity();
        }
    }

    private void launchActivity() {
        Intent intent = new Intent(this, HelloArActivity.class);
        startActivity(intent);
    }

    private void launchAudio() {
        //..............
    }

}