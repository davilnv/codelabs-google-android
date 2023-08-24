package br.com.davilnv.helloconstraint;

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

    public void plusCount(View view) {
        mCount++;
        setmCount();
    }

    public void minusCount(View view) {
        if (mCount <= 0) {
            Toast toast = Toast.makeText(this, "Contador não pode ser menor que zero!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            mCount--;
            setmCount();
        }
    }

    public void zeroCount(View view) {
        mCount = 0;
        setmCount();
    }

    private void setmCount() {
        if (mShowCount != null) mShowCount.setText(String.format(Locale.getDefault(), "%d", mCount));
    }
}