package com.it_skills.ramzi.yourname;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textViewreuslat;
    private static final String TAG = "Activity2";
    String add="addition",sub="subctration";
    int txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textViewreuslat=(TextView)findViewById(R.id.textViewreuslat);
        Bundle i = getIntent().getExtras();
         txtData = i.getInt("resulat");
        String txVal= i.getString("val");
        if (txVal.equals("addition")){
            Log.d(TAG, "valeurx:" + txtData);
            textViewreuslat.setText("calculation of "+ add + txtData);
        } else {
            Log.d(TAG, "valeurx:" + txtData);
            textViewreuslat.setText("calculation of "+ sub + txtData);
        }

    }

    public void open(View view) {
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }
}
