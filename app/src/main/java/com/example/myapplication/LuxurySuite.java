package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class LuxurySuite extends Activity implements AdapterView.OnItemSelectedListener
{
    int displayPic=1;
    ImageView imageView;

    RadioGroup radioGroup;
    RadioButton radioButton;
    Button orderBtn;
    TextView textView;
    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luxury_suite);
        RadioButton r1=findViewById(R.id.radio_Double_Bed);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        orderBtn=findViewById(R.id.orderBtn);
        imageView=findViewById(R.id.picturesSea);
        radioGroup=findViewById(R.id.radioGroup);
        textView=findViewById(R.id.text_selectedSea);

        String chooseBedType = getString(R.string.ChooseBedType);
        String yourOrderIs = getString(R.string.YourOrderIs);
        String guests = getString(R.string.Guests);
        String forX = getString(R.string.For);

        Button buttonApple=findViewById(R.id.orderBtn);
        buttonApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if (radioGroup.getCheckedRadioButtonId() == -1)
                {
                    Toast.makeText(LuxurySuite.this,chooseBedType,Toast.LENGTH_LONG).show();
                }
                else {
                    textView.setText(yourOrderIs + radioButton.getText() +  forX + choice+guests);
                    orderBtn.setVisibility(v.GONE);


                }
            }
        });


        imageView=findViewById(R.id.picturesSuite);

        Spinner spinner=findViewById(R.id.spinner_num_of_guests);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.num_of_guests_Sea_View, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        ImageButton rightBtn=findViewById(R.id.right_btnSuite);
        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPic++;
                if(displayPic==6)
                {
                    displayPic=1;
                }
                setImage();
            }
        });

        ImageButton leftBtn=findViewById(R.id.leftBtnSuite);
        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPic--;
                if(displayPic==0) {
                    displayPic = 5;
                }
                setImage();
            }
        });

        ImageButton back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LuxurySuite.this, SecondPage.class);
                startActivity(intent);
            }
        });
    }
    private void setImage()
    {
        switch (displayPic)
        {
            case 1:
                imageView.setImageResource(R.drawable.suite1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.suite2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.suite3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.suite4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.suite5);
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        choice=parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void checkButton(View v)
    {
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);
    }
}
