package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class Contact extends AppCompatActivity {
    private ConstraintLayout layout;
    private Placeholder placeholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        layout = findViewById(R.id.layout);
        placeholder = findViewById(R.id.placeholder);

    }

    public void swapView_A(View v) {
        TransitionManager.beginDelayedTransition(layout);
        placeholder.setContentId(v.getId());
    }

}
