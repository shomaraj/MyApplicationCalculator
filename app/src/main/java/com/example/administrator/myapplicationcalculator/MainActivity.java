package com.example.administrator.myapplicationcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText fNum;
    EditText sNum;
    TextView rslt;
    Button btnAdd,btnsub,btnmul,btndiv;
    int n1,n2,sum,difference,product;
    float quotient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fNum = (EditText) findViewById(R.id.firstNumber);
        sNum = (EditText) findViewById(R.id.secondNumber);
        rslt = (TextView) findViewById(R.id.result);
    }

/*public void clearText(View view)
{
    rslt.setText("0");
}*/
    public void addButton(View view)
    {
        String fstring = fNum.getText().toString();
        String sstring = sNum.getText().toString();
        n1 = Integer.parseInt(fstring);
        n2 = Integer.parseInt(sstring);
        sum = n1 + n2;
        rslt.setText("" + sum);

    }
    public void subtractButton(View view) {
        String fstring = fNum.getText().toString();
        String sstring = sNum.getText().toString();
        n1 = Integer.parseInt(fstring);
        n2 = Integer.parseInt(sstring);
        difference = n1 - n2;
        rslt.setText("" + difference);
    }

    public void multiplyButton(View view) {
        String fstring = fNum.getText().toString();
        String sstring = sNum.getText().toString();
        n1 = Integer.parseInt(fstring);
        n2 = Integer.parseInt(sstring);
        product = n1 * n2;
        rslt.setText("" + product);
    }
    public void divideButton(View view) {
        String fstring = fNum.getText().toString();
        String sstring = sNum.getText().toString();
       float f1 = Float.parseFloat(fstring);
       float f2= Float.parseFloat(sstring);
       // int n2 = Integer.parseInt(sstring);
        quotient = f1 / f2;
        rslt.setText("" + quotient);
    }
}