package com.example.exampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonmul,buttondiv,buttonadd,buttonsub,
    buttonc,buttonac,buttonboth,buttonbraces,buttonpercentage,buttondot,buttoneql;
TextView textview1;
float value1,value2,result;
boolean isAdd,isSub,isDiv,isMul,isPer;
String text,text1[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonc = (Button) findViewById(R.id.buttonc);
        buttonac = (Button) findViewById(R.id.buttonac);
        buttonboth = (Button) findViewById(R.id.buttonboth);
        buttonbraces = (Button) findViewById(R.id.buttonbraces);
        buttonpercentage = (Button) findViewById(R.id.buttonpercentage);
        buttondot = (Button) findViewById(R.id.buttondot);
        buttoneql = (Button) findViewById(R.id.buttoneql);

        textview1 = (TextView) findViewById(R.id.textView1);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttonc.setOnClickListener(this);
        buttonac.setOnClickListener(this);
        buttonboth.setOnClickListener(this);
        buttonbraces.setOnClickListener(this);
        buttonpercentage.setOnClickListener(this);
        buttondot.setOnClickListener(this);
        buttoneql.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                textview1.setText(textview1.getText()+"1");
                break;
            case R.id.button2:
                textview1.setText(textview1.getText()+"2");
                break;
            case R.id.button3:
                textview1.setText(textview1.getText()+"3");
                break;
            case R.id.button4:
                textview1.setText(textview1.getText()+"4");
                break;
            case R.id.button5:
                textview1.setText(textview1.getText()+"5");
                break;
            case R.id.button6:
                textview1.setText(textview1.getText()+"6");
                break;
            case R.id.button7:
                textview1.setText(textview1.getText()+"7");
                break;
            case R.id.button8:
                textview1.setText(textview1.getText()+"8");
                break;
            case R.id.button9:
                textview1.setText(textview1.getText()+"9");
                break;
            case R.id.button0:
                textview1.setText(textview1.getText()+"0");
                break;
            case R.id.buttonac:
                textview1.setText("");
                break;
            case R.id.buttondot:
                textview1.setText(textview1.getText()+".");
                break;
            case R.id.buttonc:
                String text2 = textview1.getText().toString();
                //text2.text2.length()-1
                text2 = text2.substring(0, text2.length() - 1);
                textview1.setText(text2);
                break;
            case R.id.buttonadd:
               // text = textview1.getText().toString();
               // if(text.contains("=")){
                  //  text1 = text.split("=");
                 //   value1 = Float.parseFloat(text1[text1.length-1]);

               // }else {
                    value1 = Float.parseFloat(textview1.getText().toString());

               // }
                textview1.setText("");
                isAdd = true;
                break;
            case R.id.buttonpercentage:
                value1 = Float.parseFloat(textview1.getText().toString());
                textview1.setText("");
                isPer=true;
                break;

            case R.id.buttonsub:
                //value1 = Float.parseFloat(textview1.getText().toString());
                text = textview1.getText().toString();
                if(text.contains("=")){
                    String[] text1 = text.split("=");
                    value1 = Float.parseFloat(text1[text1.length-1]);

                }else {
                    value1 = Float.parseFloat(textview1.getText().toString());

                }
                textview1.setText("");
                isSub = true;
                break;
            case R.id.buttonmul:
                text = textview1.getText().toString();
                //value1 = Float.parseFloat(textview1.getText().toString());
                if(text.contains("=")){
                    String[] text1 = text.split("=");
                    value1 = Float.parseFloat(text1[text1.length-1]);

                }else {
                    value1 = Float.parseFloat(textview1.getText().toString());

                }
                textview1.setText("");
                isMul = true;
                break;
            case R.id.buttondiv:
                text = textview1.getText().toString();
                //value1 = Float.parseFloat(textview1.getText().toString());
                if(text.contains("=")){
                    String[] text1 = text.split("=");
                    value1 = Float.parseFloat(text1[text1.length-1]);

                }else {
                    value1 = Float.parseFloat(textview1.getText().toString());

                }
                textview1.setText("");
                isDiv = true;
                break;
            case R.id.buttoneql:
                if(isAdd){
                    value2 = Float.parseFloat(textview1.getText().toString());
                    result = value1+value2;
                    textview1.setText(String.valueOf(result));
                    isAdd = false;
                }else if(isSub){
                    value2 = Float.parseFloat(textview1.getText().toString());
                    result = value1-value2;
                    textview1.setText(value1 +"-"+value2+"="+String.valueOf(result));
                    isSub = false;
                }else if(isMul){
                    value2 = Float.parseFloat(textview1.getText().toString());
                    result = value1*value2;
                    textview1.setText(value1 +"*"+value2+"="+String.valueOf(result));
                    isMul = false;
                }else if(isDiv){
                    value2 = Float.parseFloat(textview1.getText().toString());
                    result = value1/value2;
                    textview1.setText(value1 +"/"+value2+"="+String.valueOf(result));
                    isDiv = false;
                }else if ((isPer)){
                    value2= Float.parseFloat(textview1.getText().toString());
                    result = (value1*value2)/100;
                    textview1.setText(String.valueOf(result));
                    isPer = false;
                }

                break;

            default:
                textview1.setText(textview1.getText()+"0");
                break;

        }








    }
}
