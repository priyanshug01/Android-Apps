package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText N1,N2;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        N1 = findViewById(R.id.N1);
        N2 = findViewById(R.id.N2);
        Result = findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
                int sum = Integer.parseInt(N1.getText().toString()) + Integer.parseInt(N2.getText().toString());
                Result.setText("The Sum is: "+sum);
            }
        });
    }
}