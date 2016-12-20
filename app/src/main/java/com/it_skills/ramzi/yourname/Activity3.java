package com.it_skills.ramzi.yourname;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    EditText editText;
    Button button;
    int txtData3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button2);

    }
    public void doubleNumber(View view) {

        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(Activity3.this);
        alertdialogbuilder.setTitle("Option");
        alertdialogbuilder
                .setMessage("what do you want to do")
                .setCancelable(false)
                .setPositiveButton("Rest to 10", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        txtData3 =Integer.parseInt(editText.getText().toString());
                        double xx=txtData3*10.0;
                         i = (int)xx;
                        editText.setText(i);
                    }
                })
                .setNegativeButton("close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    finish();
                    }
                });
        AlertDialog alert11 = alertdialogbuilder.create();
        alert11.show();

    }
}

