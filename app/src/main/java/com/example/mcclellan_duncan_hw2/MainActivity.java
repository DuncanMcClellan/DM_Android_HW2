package com.example.mcclellan_duncan_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8,
            btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_equal,
            btn_dec, btn_clear;
    private EditText edit1;
    private float value1, value2;
    private boolean add, sub, mul, div, first = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        setOnClick();
    }

    private void initComponents() {
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_equal = (Button) findViewById(R.id.btn_Equal);
        btn_dec = (Button) findViewById(R.id.btn_dec);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        edit1 = (EditText) findViewById(R.id.text);
    }

    private void setOnClick(){
        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("1");
                }else{
                    edit1.setText(edit1.getText() + "1");
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("2");
                }else{
                    edit1.setText(edit1.getText() + "2");
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("3");
                }else{
                    edit1.setText(edit1.getText() + "3");
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("4");
                }else{
                    edit1.setText(edit1.getText() + "4");
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("5");
                }else{
                    edit1.setText(edit1.getText() + "5");
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("6");
                }else{
                    edit1.setText(edit1.getText() + "6");
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("7");
                }else{
                    edit1.setText(edit1.getText() + "7");
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("8");
                }else{
                    edit1.setText(edit1.getText() + "8");
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("9");
                }else{
                    edit1.setText(edit1.getText() + "9");
                }
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("0");
                }else{
                    edit1.setText(edit1.getText() + "0");
                }
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(first){
                    edit1.setText("0.");
                }else{
                    edit1.setText(edit1.getText() + ".");
                }
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(first) {
                        value1 = Float.valueOf(edit1.getText().toString());
                    }else{
                        value2 = Float.valueOf(edit1.getText().toString());
                        value1 = equate();
                        value2 = 0.0f;
                    }
                    edit1.setText("");
                }catch(Exception e){
                    edit1.setText("" + value1);
                }
                add = true;
                sub = false;
                mul = false;
                div = false;
                first = false;
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(first) {
                        value1 = Float.valueOf(edit1.getText().toString());
                    }else{
                        value2 = Float.valueOf(edit1.getText().toString());
                        value1 = equate();
                        value2 = 0.0f;
                    }
                    edit1.setText("");
                }catch(Exception e){
                    edit1.setText("" + value1);
                }
                edit1.setText("");
                sub = true;
                add = false;
                mul = false;
                div = false;
                first = false;
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(first) {
                        value1 = Float.valueOf(edit1.getText().toString());
                    }else{
                        value2 = Float.valueOf(edit1.getText().toString());
                        value1 = equate();
                        value2 = 0.0f;
                    }
                    edit1.setText("");
                }catch(Exception e){
                    edit1.setText("" + value1);
                }
                edit1.setText("");
                mul = true;
                add = false;
                sub = false;
                div = false;
                first = false;
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(first) {
                        value1 = Float.valueOf(edit1.getText().toString());
                    }else{
                        value2 = Float.valueOf(edit1.getText().toString());
                        value1 = equate();
                        value2 = 0.0f;
                    }
                    edit1.setText("");
                }catch(Exception e){
                    edit1.setText("" + value1);
                }
                edit1.setText("");
                div = true;
                add = false;
                sub = false;
                mul = false;
                first = false;
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first){
                    try {
                        value1 = Float.valueOf(edit1.getText().toString());
                    }catch(Exception e){
                        value1 = 0.0f;
                    }
                    edit1.setText("" + value1);
                }else{
                    try {
                        value2 = Float.valueOf(edit1.getText().toString());
                        try {
                            edit1.setText("" + equate());
                        } catch (Exception e) {
                            edit1.setText("Error");
                        }
                    }catch(Exception e){
                        edit1.setText("" + value1);
                    }
                    reset();
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("");
                reset();
            }
        });
    }

    private void reset(){
        add = false;
        sub = false;
        mul = false;
        div = false;
        first = true;
        value1 = 0.0f;
        value2 = 0.0f;
    }

    private float equate() throws Exception {
        if((add&&(sub||mul||div))||(sub&&(add||mul||div))||(mul&&(add||sub||div))||(div&&(add||sub||div))){
            throw new Exception();
        }else if(add){
            return value1 + value2;
        }else if(sub){
            return value1 - value2;
        }else if(mul){
            return value1 * value2;
        }else if(div){
            if(value2 == 0.0f){
                throw new Exception();
            }else{
                return value1 / value2;
            }
        }else{
            return value1;
        }
    }
}