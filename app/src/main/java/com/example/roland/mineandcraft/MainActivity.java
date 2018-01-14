package com.example.roland.mineandcraft;

import android.app.ActionBar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Map<String,Integer> _rohstoffmengen;
    Button _resourcesButton;
    Button _backButton;
    View _mainFrame;
    View _resoucesFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _rohstoffmengen = new HashMap<String, Integer>();
        _rohstoffmengen.put("coal",0);
        _resourcesButton = findViewById(R.id.resources_button);
        _backButton = findViewById(R.id.back_button);
        _mainFrame = findViewById(R.id.main_frame);
        _resoucesFrame = findViewById(R.id.resources_frame);

        _resourcesButton.setOnClickListener(this);
        _backButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.resources_button) {
            _mainFrame.setVisibility(View.GONE);
            _resoucesFrame.setVisibility(View.VISIBLE);
        }
        else if(view.getId() == R.id.back_button) {
            _resoucesFrame.setVisibility(View.GONE);
            _mainFrame.setVisibility(View.VISIBLE);
        }
    }
}
