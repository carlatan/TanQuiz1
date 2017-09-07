package com.tan.tanquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ISActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is);
    }

    public void callHome (View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void callITActivity (View view) {
        Intent intent = new Intent(this,ITActivity.class);

        startActivity(intent);
    }

    public void callCSActivity (View view){
        Intent intent = new Intent(this,CSActivity.class);
        startActivity(intent);
    }

}
