package br.com.davilnv.countapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.textCount);
    }

    public void countPlusNumber(View view) {
        mCount++;
        if (mShowCount != null) mShowCount.setText(String.format(Locale.getDefault(), "%d", mCount));
    }

    public void countMinusNumber(View view) {
        if (mCount <= 0) {
            Toast toast = Toast.makeText(this, "Contador não pode ser menor que zero!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            mCount--;
            if (mShowCount != null) mShowCount.setText(String.format(Locale.getDefault(), "%d", mCount));
        }
    }
}