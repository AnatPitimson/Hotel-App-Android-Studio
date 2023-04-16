package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.channels.FileChannel;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map map;

        String toastEmpty = getString(R.string.Toast_Enter_Name);
        String toastToLong= getString(R.string.Toast_Name_To_Long);

        final EditText nameEt = findViewById(R.id.NameInput);//פה מכניסים שם
        Button enter =findViewById(R.id.EnterButton);//כפתור כניסה לאפליקציה

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nameEt.getText().toString();
                if(name.isEmpty())
                {
                    Toast.makeText(MainActivity.this,toastEmpty,Toast.LENGTH_LONG).show();
                }
                else if(name.length()>20)
                {
                    Toast.makeText(MainActivity.this,toastToLong,Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent= new Intent(MainActivity.this, SecondPage.class);
                    intent.putExtra("user name",name);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

}