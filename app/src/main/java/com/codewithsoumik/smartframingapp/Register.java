package com.codewithsoumik.smartframingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Register extends AppCompatActivity {


    Button buttongraph,buttonFieldA,buttonManure,ButtonFieldB,buttonDry,buttonFire;
    TextView textViewContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

         buttongraph =findViewById(R.id.buttonGraph);
         buttonFieldA=findViewById(R.id.buttonFieldA);
        buttonManure=findViewById(R.id.buttonManure);
        ButtonFieldB=findViewById(R.id.buttonFieldB);
        buttonDry=findViewById(R.id.buttonDry);
        buttonFire=findViewById(R.id.buttonFire);
        textViewContact=findViewById(R.id.textViewContact);

         buttongraph.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                   Intent browerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thingspeak.com/channels/617957"));
                   startActivity(browerIntent);
             }
         });

          buttonManure.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent bt =new Intent(Intent.ACTION_VIEW,Uri.parse("https://thingspeak.com/channels/617957/charts/5?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"));
                 startActivity(bt);
              }
          });

          buttonFieldA.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent brower=new Intent(Intent.ACTION_VIEW,Uri.parse("https://thingspeak.com/channels/617957/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line"));
                  startActivity(brower);
              }
          });

          ButtonFieldB.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent VC =new Intent(Intent.ACTION_VIEW,Uri.parse("https://thingspeak.com/channels/617957/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"));
                  startActivity(VC);
              }
          });

          buttonFire.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent Di =new Intent(Intent.ACTION_VIEW,Uri.parse("https://thingspeak.com/channels/617957/charts/3?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"));
                  startActivity(Di);
              }
          });

          buttonDry.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent as =new Intent(Intent.ACTION_VIEW,Uri.parse("https://thingspeak.com/channels/617957/charts/4?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"));
                  startActivity(as);
              }
          });

          textViewContact.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  startActivity(new Intent(getApplicationContext(),Contact2.class));
              }
          });
    }
}
