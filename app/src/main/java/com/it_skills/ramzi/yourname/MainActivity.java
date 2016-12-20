package com.it_skills.ramzi.yourname;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    RadioButton radioButtonAdd, radioButtonSub;
    Button button;
    RadioGroup radiogroup;
    int a, b, x;
    String add="addition",sub="subctration";
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.Number1);
        number2 = (EditText) findViewById(R.id.Number2);
        radioButtonAdd = (RadioButton) findViewById(R.id.radioAdd);
        radioButtonSub = (RadioButton) findViewById(R.id.radioSub);
        radiogroup =(RadioGroup)findViewById(R.id.radiogroup);
        button = (Button) findViewById(R.id.button);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioAdd:
                if (checked)
                    button.setVisibility(View.VISIBLE);
                break;
            case R.id.radioSub:
                if (checked)
                    button.setVisibility(View.VISIBLE);
                break;
        }
    }


    public void calcluate(View view) {
      a = Integer.parseInt(number1.getText().toString());
        b = Integer.parseInt(number2.getText().toString());
        if (radioButtonAdd.isChecked()) {
            x = a + b;
            Log.d(TAG, "valeur:" + x);
            Intent i = new Intent(this, Activity2.class);
            i.putExtra("resulat", x);
            i.putExtra("val", add);
            startActivity(i);
            finish();
        } else if (radioButtonSub.isChecked()) {
            x = a - b;
            Log.d(TAG, "valeur:" + x);
            Intent i = new Intent(this, Activity2.class);
            i.putExtra("resulat", x);
            i.putExtra("val",sub);
            startActivity(i);
            finish();
        }
    }
}

   /* public void calcluate(View view) {
        a = Integer.parseInt(number1.getText().toString());
        b = Integer.parseInt(number2.getText().toString());
        switch(view.getId()) {
            case R.id.radioAdd:
                x=a+b;
                Intent i =new Intent(this,Activity2.class);
                i.putExtra("resulat", x);
                startActivity(i);
                finish();
                break;
            case R.id.radioSub:
                x=a-b;
                Intent ii =new Intent(this,Activity2.class);
                ii.putExtra("resulat", x);
                startActivity(ii);
                finish();
                break;
        }
    }*/