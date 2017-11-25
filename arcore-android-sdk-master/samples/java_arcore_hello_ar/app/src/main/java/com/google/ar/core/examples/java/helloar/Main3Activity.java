package com.google.ar.core.examples.java.helloar;

import android.content.Intent;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    OrientationEventListener mOrientationListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mOrientationListener = new OrientationEventListener(this,
                SensorManager.SENSOR_DELAY_NORMAL) {

            @Override
            public void onOrientationChanged(int orientation) {
                launchActivity();
            }
        };

        if (mOrientationListener.canDetectOrientation()) {
            Toast.makeText(this,
                    "Can detect orientation", Toast.LENGTH_LONG).show();
            mOrientationListener.enable();
        } else {
            Toast.makeText(this,
                    "Cannot detect orientation", Toast.LENGTH_LONG).show();
            mOrientationListener.disable();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mOrientationListener.disable();
    }

    private void launchActivity() {
        Intent intent = new Intent(this, HelloArActivity.class);
        startActivity(intent);
    }
}
