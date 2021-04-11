package com.example.calverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btnBack;
    Button btnExit;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnMul,btnSub,btnDiv,btnDot,btnEqual,btnClr;
    float res1, res2;
    EditText et1;
    boolean Add, Sub, Mul, Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnExit = (Button) findViewById(R.id.btnExit);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnClr = (Button) findViewById(R.id.btnClr);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        et1 = (EditText) findViewById(R.id.et1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+ ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.length()== 0){
                    et1.setError("Please Enter Number Here");
                }else {
                    res1 = Float.parseFloat(et1.getText()+"");
                    Add=true;
                    et1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.length()== 0){
                    et1.setError("Please Enter Number Here");
                }else {
                    res1 = Float.parseFloat(et1.getText()+"");
                    Sub=true;
                    et1.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.length()== 0){
                    et1.setError("Please Enter Number Here");
                }else {
                    res1 = Float.parseFloat(et1.getText()+"");
                    Mul=true;
                    et1.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.length()== 0){
                    et1.setError("Please Enter Number Here");
                }else {
                    res1 = Float.parseFloat(et1.getText()+"");
                    Div=true;
                    et1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(et1.getText()+"");
                if (Add==true){
                    et1.setText(res1+res2+"");
                    Add = false;
                }
                if (Sub==true){
                    et1.setText(res1-res2+"");
                    Sub = false;
                }
                if (Mul==true){
                    et1.setText(res1*res2+"");
                    Mul = false;
                }
                if (Div==true){
                    et1.setText(res1/res2+"");
                    Div = false;
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}