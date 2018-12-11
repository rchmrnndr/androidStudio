package com.example.admin.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ET1, ET2;
    private TextView TVResult;
    private Button btCal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = (EditText)findViewById(R.id.ET1);
        ET2 = (EditText)findViewById(R.id.ET2);
        TVResult = (TextView)findViewById(R.id.TVResult);
        btCal = (Button)findViewById(R.id.btCal);
        }


    private void bmi(){
        float a, b, c;
        a = Float.parseFloat(ET2.getText().toString())/100;
        b = Float.parseFloat(ET1.getText().toString());
        c =  b / (a * a);
        TVResult.setText("" + c);
    }
}
