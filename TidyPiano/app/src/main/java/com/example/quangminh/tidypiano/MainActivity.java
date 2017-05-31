package com.example.quangminh.tidypiano;

import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ImageView ivw1;
    private ImageView ivw2;
    private ImageView ivw3;
    private ImageView ivw4;
    private ImageView ivw5;
    private ImageView ivw6;
    private ImageView ivw7;
    private ImageView ivb1;
    private ImageView ivb2;
    private ImageView ivb3;
    private ImageView ivb4;
    private ImageView ivb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().hide();
        ivw1 = (ImageView) findViewById(R.id.w1);
        ivw2 = (ImageView) findViewById(R.id.w2);
        ivw3 = (ImageView) findViewById(R.id.w3);
        ivw4 = (ImageView) findViewById(R.id.w4);
        ivw5 = (ImageView) findViewById(R.id.w5);
        ivw6 = (ImageView) findViewById(R.id.w6);
        ivw7 = (ImageView) findViewById(R.id.w7);
        ivb2 = (ImageView) findViewById(R.id.b2);
        ivb1 = (ImageView) findViewById(R.id.b1);
        ivb3 = (ImageView) findViewById(R.id.b3);
        ivb4 = (ImageView) findViewById(R.id.b4);
        ivb5 = (ImageView) findViewById(R.id.b5);

        ivw1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivw1.setImageResource(R.drawable.pressed_white_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivw1.setImageResource(R.drawable.default_white_key);
                        break;
                }
                return true;
            }
        });

        ivw2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivw2.setImageResource(R.drawable.pressed_white_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivw2.setImageResource(R.drawable.default_white_key);
                        break;
                }
                return true;
            }
        });
        ivw3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivw3.setImageResource(R.drawable.pressed_white_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivw3.setImageResource(R.drawable.default_white_key);
                        break;
                }
                return true;
            }
        });
        ivw4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivw4.setImageResource(R.drawable.pressed_white_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivw4.setImageResource(R.drawable.default_white_key);
                        break;
                }
                return true;
            }
        });
        ivw5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivw5.setImageResource(R.drawable.pressed_white_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivw5.setImageResource(R.drawable.default_white_key);
                        break;
                }
                return true;
            }
        });
        ivw6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivw6.setImageResource(R.drawable.pressed_white_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivw6.setImageResource(R.drawable.default_white_key);
                        break;
                }
                return true;
            }
        });
        ivw7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivw7.setImageResource(R.drawable.pressed_white_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivw7.setImageResource(R.drawable.default_white_key);
                        break;
                }
                return true;
            }
        });

        ivb1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivb1.setImageResource(R.drawable.pressed_black_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivb1.setImageResource(R.drawable.default_black_key);
                        break;
                }
                return true;
            }
        });
        ivb2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivb2.setImageResource(R.drawable.pressed_black_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivb2.setImageResource(R.drawable.default_black_key);
                        break;
                }
                return true;
            }
        });
        ivb3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivb3.setImageResource(R.drawable.pressed_black_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivb3.setImageResource(R.drawable.default_black_key);
                        break;
                }
                return true;
            }
        });
        ivb4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivb4.setImageResource(R.drawable.pressed_black_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivb4.setImageResource(R.drawable.default_black_key);
                        break;
                }
                return true;
            }
        });
        ivb5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case (MotionEvent.ACTION_DOWN):
                        ivb5.setImageResource(R.drawable.pressed_black_key);
                        break;
                    case (MotionEvent.ACTION_UP):
                        ivb5.setImageResource(R.drawable.default_black_key);
                        break;
                }
                return true;
            }
        });


    }
}
