package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Restaurant extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant);
        final EditText btnEt=findViewById(R.id.How_Many_Pepole);
        Button finishBtn=findViewById(R.id.OrderPlace);

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numOfButtonsStr = btnEt.getText().toString();
                String RLG=getString(R.string.LuckyGuestNumber);
                if (numOfButtonsStr.isEmpty()) {
                } else {
                    int numOfBtn = Integer.parseInt(numOfButtonsStr);
                    LinearLayout btnsLayout = findViewById(R.id.btnsLayout);
                    btnsLayout.removeAllViews();
                    for (int i = 0; i < numOfBtn; i++) {
                        TextView btn = new TextView(Restaurant.this);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        btn.setLayoutParams(layoutParams);
                        btn.setText(RLG+ (i + 1));
                        btnsLayout.addView(btn, 0);
                    }
                }
            }
        });
    }

}
