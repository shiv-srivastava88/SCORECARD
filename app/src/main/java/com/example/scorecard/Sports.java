package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Sports extends AppCompatActivity {

    private FirebaseAuth mAuth;
    ImageView cricket,badminton,football,basketball,tennis,volleyball;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        mAuth=FirebaseAuth.getInstance();
        cricket=(ImageView)findViewById(R.id.imageView1);
        badminton=(ImageView)findViewById(R.id.imageView2);
        football=(ImageView)findViewById(R.id.imageView3);
        basketball=(ImageView)findViewById(R.id.imageView4);
        tennis=(ImageView)findViewById(R.id.imageView5);
        volleyball=(ImageView)findViewById(R.id.imageView6);

        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cr=new Intent(Sports.this,Auth.class);
                cr.putExtra("game","Cricket");
                startActivity(cr);
            }
        });
        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bad=new Intent(Sports.this,Auth.class);
                bad.putExtra("game","Badminton");
                startActivity(bad);
            }
        });
        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ft=new Intent(Sports.this,Auth.class);
                ft.putExtra("game","Football");
                startActivity(ft);
            }
        });
        basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bb=new Intent(Sports.this,Auth.class);
                bb.putExtra("game","Basketball");
                startActivity(bb);
            }
        });
        tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tn=new Intent(Sports.this,Auth.class);
                tn.putExtra("game","Tennis");
                startActivity(tn);
            }
        });
        volleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent vb=new Intent(Sports.this,Auth.class);
                vb.putExtra("game","Volleyball");
                startActivity(vb);
            }
        });
    }
}