package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToster(View view) {

        switch (view.getId()){
            case R.id.button_success:
                Toasty.success(this,"Success Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_error:
                Toasty.error(this,"error Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_info:
                Toasty.info(this,"info Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_Warning:
                Toasty.warning(this,"Warning Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_normal:
                Toasty.normal(this,"Toast with and icon", Toast.LENGTH_LONG, ContextCompat.getDrawable(this,R.drawable.ic_android_black_24dp)).show();
        }


    }
}