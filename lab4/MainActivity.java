package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mButton;
    public static final String EXTRA_MESSAGE = "com.example.hellotoast.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mButton = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = Integer.toString(mCount);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            if (mCount % 2 == 1)
                mButton.setBackgroundColor(Color.GREEN);
            else if (mCount % 2 == 0)
                mButton.setBackgroundColor(Color.BLUE);
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    public void reZero(View view) {
        mCount = 0;
        mButton.setBackgroundColor(R.color.gray);
        mShowCount.setText(Integer.toString(mCount));
    }
}