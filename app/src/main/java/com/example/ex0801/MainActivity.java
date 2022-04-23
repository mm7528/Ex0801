package com.example.ex0801;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch swtN;
    Button btn;
    View view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.tb);
        swtN = (Switch) findViewById(R.id.sw);
        btn = (Button) findViewById(R.id.button);
        view1= (View) findViewById(R.id.main_layout);


    }

    public void click(View view) {
        if(tb.isChecked()&&swtN.isChecked()){
            view1.setBackgroundColor(Color.MAGENTA);
        }
        else if(tb.isChecked()&& !(swtN.isChecked())){
            view1.setBackgroundColor(Color.CYAN);
        }
        else if(!(tb.isChecked())&&swtN.isChecked()){
            view1.setBackgroundColor(Color.RED);
        }
        else{
            view1.setBackgroundColor(Color.BLUE);
        }

    }
}