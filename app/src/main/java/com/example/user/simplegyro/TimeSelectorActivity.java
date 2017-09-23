package com.example.user.simplegyro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by erunn on 2017-09-23.
 */

public class TimeSelectorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_timeselector);

        Button timeButton = (Button)findViewById(R.id.button4);

        timeButton.setOnClickListener(listener);
        timeButton.setOnClickListener(listener);
        timeButton.setOnClickListener(listener);


    }

    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()){
                case  R.id.button4 :
                    Intent toTime = new Intent(TimeSelectorActivity.this, WaitActivity.class);
                    startActivity(toTime);
                    finish();
                    break;
                case R.id.button5 :
                    break;


                default:
                    break;
            }
        }
    };

}
