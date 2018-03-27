package com.unnc.digitalmenu.intelligentdigitalmenu;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class OrderActivity extends AppCompatActivity {
    private Button button1;
    private CardView cardView;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private ImageView image7;
    private ImageView image8;
    private ImageView image9;
    private Button butexit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        cardView = (CardView)findViewById(R.id.cardView);
        cardView.setRadius(8);
        cardView.setCardElevation(8);
        cardView.setContentPadding(5,5,5,5);

        //button1 = (Button)findViewById(R.id.button1);
        image1 = (ImageView) findViewById(R.id.image1);
        butexit = (Button)findViewById(R.id.Exit);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog dialog = new  CustomDialog(OrderActivity.this);
                dialog.show();
            }
        });

        image2 = (ImageView) findViewById(R.id.image2);
        butexit = (Button)findViewById(R.id.Exit);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog1 dialog = new  CustomDialog1(OrderActivity.this);
                dialog.show();
            }
        });

        image3 = (ImageView) findViewById(R.id.image3);
        butexit = (Button)findViewById(R.id.Exit);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog2 dialog = new  CustomDialog2(OrderActivity.this);
                dialog.show();
            }
        });


        image4 = (ImageView) findViewById(R.id.image4);
        butexit = (Button)findViewById(R.id.Exit);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog3 dialog = new  CustomDialog3(OrderActivity.this);
                dialog.show();
            }
        });


        image5 = (ImageView) findViewById(R.id.image5);
        butexit = (Button)findViewById(R.id.Exit);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog4 dialog = new  CustomDialog4(OrderActivity.this);
                dialog.show();
            }
        });

        image6 = (ImageView) findViewById(R.id.image6);
        butexit = (Button)findViewById(R.id.Exit);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog5 dialog = new  CustomDialog5(OrderActivity.this);
                dialog.show();
            }
        });

        image7 = (ImageView) findViewById(R.id.image7);
        butexit = (Button)findViewById(R.id.Exit);
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog6 dialog = new  CustomDialog6(OrderActivity.this);
                dialog.show();
            }
        });

        image8 = (ImageView) findViewById(R.id.image8);
        butexit = (Button)findViewById(R.id.Exit);
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog7 dialog = new  CustomDialog7(OrderActivity.this);
                dialog.show();
            }
        });

        image9 = (ImageView) findViewById(R.id.image9);
        butexit = (Button)findViewById(R.id.Exit);
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog8 dialog = new  CustomDialog8(OrderActivity.this);
                dialog.show();
            }
        });

    }
}