package com.example.images;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView[] iv = new ImageView[3];
    int[] id = new int[3];
    Button btn;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button2);
        iv[0] = findViewById(R.id.iv1);
        iv[1] = findViewById(R.id.iv1);
        iv[2] = findViewById(R.id.iv1);

        id[0] = R.drawable.one;
        id[1] = R.drawable.two;
        id[2] = R.drawable.three;
    }


    @SuppressLint("SetTextI18n")
    public void button2(View view){
        int max, min;
        max = 3;
        min = 1;
        int number = (int) Math.floor(Math.random() *(max - min + 1) + min);
        if (number == 1){
            iv[0].setImageResource(id[0]);
            btn.setText("Click for Image: 1");
        }
        else if(number == 2){
            iv[1].setImageResource(id[1]);
            btn.setText("Click for Image: 2");
        }
        else{
            iv[2].setImageResource(id[2]);
            btn.setText("Click for Image: 3");
        }
    }
}