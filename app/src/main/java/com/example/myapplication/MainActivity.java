package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String islem;
    EditText aedit1;
    float a1,a2,h;

    public void aktar()
    {
        aedit1= (EditText)findViewById(R.id.edit1);
        a1=Float.parseFloat(aedit1.getText().toString());
        aedit1.setText(" ");
    }

    public void topla(View v)
    {
        islem="+";
        aktar();
    }
    public void cik(View v)
    {
        islem="-";
        aktar();

    }

    public void carp(View v)
    {
        islem="*";
        aktar();

    }

    public void bol(View v)
    {
        islem="/";
        aktar();

    }

    public void temiz(View v)
    {
        aedit1=(EditText)findViewById(R.id.edit1) ;
        aedit1.setText(" ");
    }

    public void esit(View v)
    {
        aedit1=(EditText)findViewById(R.id.edit1);
        a2=Float.parseFloat(aedit1.getText().toString());


        if (islem=="+") h=a1+a2;
        if (islem=="-") h=a1-a2;
        if (islem=="*") h=a1*a2;
        if (islem=="/") h=a1/a2;

        aedit1.setText(String.valueOf(h));
    }

}