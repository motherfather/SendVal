package com.bit2016.sendval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caller);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallerActivity.this, CalleeActivity.class);
                intent.putExtra("data-number", 10);
                intent.putExtra("data-string", "hello android");

                startActivity(intent);
            }
        });
    }
}
