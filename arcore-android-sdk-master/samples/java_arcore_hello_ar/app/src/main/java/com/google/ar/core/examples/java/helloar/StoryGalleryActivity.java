package com.google.ar.core.examples.java.helloar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoryGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_gallery);

        Button storyButton = (Button)findViewById(R.id.story_button);

        storyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }

    private void launchActivity() {
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }
}
