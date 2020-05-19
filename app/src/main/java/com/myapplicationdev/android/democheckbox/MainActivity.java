package com.myapplicationdev.android.democheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBox);
        btnCheck = findViewById(R.id.discountGiven);
        tvShow = findViewById(R.id.textViewDisplay);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbEnabled.isChecked()){
                    tvShow.setText("Discount is given");
                    Toast.makeText(MainActivity.this,"Button clicked",Toast.LENGTH_LONG).show();
                }
                else{
                    tvShow.setText("The discount is not given");
                }
            }
        });


    }
}

