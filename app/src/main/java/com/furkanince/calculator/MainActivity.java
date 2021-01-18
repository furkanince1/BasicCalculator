package com.furkanince.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nummer1Text;
    EditText nummer2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         nummer1Text = findViewById(R.id.Nummer1);
         nummer2Text = findViewById(R.id.Nummer2);
         resultText = findViewById(R.id.Result);

    }

    public void sum(View view){
        if (nummer1Text.getText().toString().matches("") || nummer2Text.getText().toString().matches("") ) {
            resultText.setText("Enter Nummer!");
        } else {
            int nummer1 = Integer.parseInt(nummer1Text.getText().toString());
            int nummer2 = Integer.parseInt(nummer2Text.getText().toString());

            int result = nummer1 + nummer2;

            resultText.setText("Result: "+ result);
        }

    }

    public void deduct(View view){
        if (nummer1Text.getText().toString().matches("") || nummer2Text.getText().toString().matches("") ) {
            resultText.setText("Enter Nummer!");
        } else {
            int nummer1 = Integer.parseInt(nummer1Text.getText().toString());
            int nummer2 = Integer.parseInt(nummer2Text.getText().toString());

            int result = nummer1 - nummer2;

            resultText.setText("Result: "+ result);
        }

    }

    public void multiply(View view){
        if (nummer1Text.getText().toString().matches("") || nummer2Text.getText().toString().matches("") ) {
            resultText.setText("Enter Nummer!");
        } else {
            int nummer1 = Integer.parseInt(nummer1Text.getText().toString());
            int nummer2 = Integer.parseInt(nummer2Text.getText().toString());

            int result = nummer1 * nummer2;

            resultText.setText("Result: "+ result);
        }
    }

    public void divide(View view){
        if (nummer1Text.getText().toString().matches("") || nummer2Text.getText().toString().matches("") ) {
            resultText.setText("Enter Nummer!");
        } else {
            int nummer1 = Integer.parseInt(nummer1Text.getText().toString());
            int nummer2 = Integer.parseInt(nummer2Text.getText().toString());

            int result = nummer1 / nummer2;

            resultText.setText("Result: "+ result);
        }
    }


}