package com.example.user.simplegyro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GyroDetector.ISwingDetectListener{
    private TextView mTextView;
    private GyroDetector mGyroDetector;
    private float degree = 0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.text);
        mGyroDetector = new GyroDetector(this);
    }

    @Override
    protected void onResume(){
        super.onResume();

        if(mGyroDetector !=null){
            mGyroDetector.startSensor();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mGyroDetector != null) {
            mGyroDetector.stopSensor();
        }
    }


    @Override
    public void onChanged(float gz) {
        degree += gz;

        if(Math.abs(gz) > 0.175f){
            mTextView.setRotation(degree);
            Log.d("gz", String.valueOf(gz));
        }
         mTextView.setText(String.valueOf(degree));
    }
}