package com.example.ishpreetkaur.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    public static final String TAG = "ActivityLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        Log.i(TAG," onCreate() Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG," onStart() Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG," onResume() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG," onPause() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG," onStop() Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG," onDestroy() Called");
    }
}
