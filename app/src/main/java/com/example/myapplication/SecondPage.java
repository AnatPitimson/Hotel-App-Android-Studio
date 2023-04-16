package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondPage extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        String hello = getString(R.string.HelloText);
        String welcome = getString(R.string.Welcome);
        String chooseRoomType = getString(R.string.choose_room);
        String userName= getIntent().getStringExtra("user name");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.secound_page);

        TextView hello_and_welcome=findViewById(R.id.HelloOutput);
        hello_and_welcome.setText(hello + " " +userName +" " + welcome);
        TextView chooseRoom=findViewById(R.id.choose_Room);
        chooseRoom.setText(chooseRoomType);

        ImageButton back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button standardRoomBtn=findViewById(R.id.StandardRoom);
        standardRoomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, StandardRoomPage.class);
                startActivity(intent);
            }
        });

        Button roomWithSeaView=findViewById(R.id.RoomWithSeaView);
        roomWithSeaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, RoomWithSeaView.class);
                startActivity(intent);
            }
        });

        Button roomWithPrivatePool=findViewById(R.id.RoomWithPrivatePool);
        roomWithPrivatePool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, RoomWithPrivatePool.class);
                startActivity(intent);
            }
        });

        Button luxurySuite=findViewById(R.id.LuxurySuite);
        luxurySuite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, LuxurySuite.class);
                startActivity(intent);
            }
        });

        Button restaurant=findViewById(R.id.Restaurant_Btn);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, Restaurant.class);
                startActivity(intent);
            }
        });

        Button contact=findViewById(R.id.ContactBtn);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondPage.this, Contact.class);
                startActivity(intent);
            }
        });




    }

}
