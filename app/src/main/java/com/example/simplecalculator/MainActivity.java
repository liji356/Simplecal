package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    AppCompatButton b1,b2,b3,b4;

//  String getResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.fno);
        ed2=(EditText) findViewById(R.id.sno);
        ed3=(EditText) findViewById(R.id.result);
        b1=(AppCompatButton) findViewById(R.id.add);
        b2=(AppCompatButton) findViewById(R.id.sub);
        b3=(AppCompatButton) findViewById(R.id.div);
        b4=(AppCompatButton) findViewById(R.id.multi);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double first=Double.parseDouble(ed1.getText().toString());
                double second=Double.parseDouble(ed2.getText().toString());
                double sum=first+second;
               ed3.setText(Double.toString(sum));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first=Double.parseDouble(ed1.getText().toString());
                double second=Double.parseDouble(ed2.getText().toString());
                double sub=first-second;
                ed3.setText(Double.toString(sub));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               float first=Float.parseFloat(ed1.getText().toString());
                float second=Float.parseFloat(ed2.getText().toString());
                float div=first/second;
                ed3.setText(Float.toString(div));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first=Double.parseDouble(ed1.getText().toString());
                double second=Double.parseDouble(ed2.getText().toString());
                double multi=first*second;
                ed3.setText(Double.toString(multi));
            }
        });
    }
}