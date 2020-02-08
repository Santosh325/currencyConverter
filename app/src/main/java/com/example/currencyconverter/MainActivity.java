package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText inr;
    Button dlr,euro,pound;
    Button aus,can,yen;
    Button dinar, bitCoin, ruble;
    Button clear;
    TextView res;
    String getInr;
    double dollarConvert, euroConvert,poundConvert;
    double ausConvert, canConvert,yenConvert;
    double dinarConvert, pesoConvert, rubleConvert;
    String strConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       inr = findViewById(R.id.inputText);
       res = findViewById(R.id.result);
       dlr = findViewById(R.id.dollar);
       euro = findViewById(R.id.euro);
       pound = findViewById(R.id.pounds);
       aus = findViewById(R.id.aus);
       can = findViewById(R.id.canada);
       yen = findViewById(R.id.yen);
       dinar = findViewById(R.id.dinar);
       bitCoin = findViewById(R.id.peso);
       ruble = findViewById(R.id.ruble);
       clear = findViewById(R.id.clear);
       dlr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                getInr = inr.getText().toString();
                if(getInr.equals("")) return;
               else {
                    dollarConvert = Double.parseDouble(getInr) * 0.014;
                    String strConvert = String.valueOf(dollarConvert);
                    res.setText(strConvert);
                }
           }

       });
       euro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              getInr = inr.getText().toString();
              if(getInr.equals("")) return;
              else {
                  euroConvert = Double.parseDouble(getInr) * 0.013;
                  strConvert = String.valueOf(euroConvert);
                  res.setText(strConvert);
              }
           }
       });
       pound.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getInr = inr.getText().toString();
               if(getInr.equals("")) return;
               else {
                   poundConvert = Double.parseDouble(getInr) * 0.011;
                   strConvert = String.valueOf(poundConvert);
                   res.setText(strConvert);
               }

           }
       });
       aus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getInr = inr.getText().toString();
               if(getInr.equals("")) return;
               else {
                   ausConvert = Double.parseDouble(getInr) * 0.021;
                   strConvert = String.valueOf(ausConvert);
                   res.setText(strConvert);
               }

           }
       });
       can.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getInr = inr.getText().toString();
               if(getInr.equals("")) return;
               else {
                   canConvert = Double.parseDouble(getInr) * 0.008;
                   strConvert = String.valueOf(canConvert);
                   res.setText(strConvert);
               }

           }
       });
      yen.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              getInr = inr.getText().toString();
              if(getInr.equals("")) return;
              else {
                  yenConvert = Double.parseDouble(getInr) * 1.54;
                  strConvert = String.valueOf(yenConvert);
                  res.setText(strConvert);
              }

          }
      });
      dinar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              getInr = inr.getText().toString();
              if(getInr.equals("")) return;
              else {
                  dinarConvert = Double.parseDouble(getInr) * 0.0043;
                  strConvert = String.valueOf(dinarConvert);
                  res.setText(strConvert);
              }

          }
      });
      bitCoin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              getInr = inr.getText().toString();
              if(getInr.equals("")) return;
              else {
                  pesoConvert= Double.parseDouble(getInr) * 0.26;
                  strConvert = String.valueOf(pesoConvert);
                  res.setText(strConvert);
              }

          }
      });
      ruble.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              getInr = inr.getText().toString();
              if(getInr.equals("")) return;
              else {
                  rubleConvert = Double.parseDouble(getInr) * 0.86;
                  strConvert = String.valueOf(rubleConvert);
                  res.setText(strConvert);
              }
          }
      });
      clear.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              res.setText("Result");
              inr.getText().clear();

          }
      });

    }
}
