package com.example.auser.androidjavatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
//AppCompatActivity是一個可以往前相容的類
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);  //呼叫版面
        //以下利用程式定義版面
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);
        //定義版面完成

        //做10個按鈕
        Button[] bt=new Button[10];
        for (int i=0;i<bt.length;i++){
            bt[i]=new Button(this);
            bt[i].setText(Integer.toString(i));
//            bt[i].setLay
            linearLayout.addView(bt[i]);

        }
//
//        TextView tv1=new TextView(this);//呼叫建構式
//        tv1.setText("Welcome!");
//        TextView tv2=new TextView(this);
//        tv2.setText("Hello!");
//
//
//        Button bt1=new Button(this);
//        Button bt2=new Button(this);
//        bt1.setText("OK");
//        bt2.setText("Cancel");
//
//        //將widge接到版面上
//        linearLayout.addView(tv2);
//        linearLayout.addView(tv1);
//        linearLayout.addView(bt1);
//        linearLayout.addView(bt2);




    }
}
