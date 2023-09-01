package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText N1;
    TextView result;
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        N1 = findViewById(R.id.N1);
        result = findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Created by Priyanshu Gupta!", Toast.LENGTH_SHORT).show();
                int n = Integer.parseInt(N1.getText().toString());
                res="";
                for(int i=1;i<=10;i++)
                {
                    res+=n+" x "+i+" = "+n*i+"\n";
                    result.setText(res);
                }
            }
        });
    }
}