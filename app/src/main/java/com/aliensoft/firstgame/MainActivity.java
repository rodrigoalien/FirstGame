package com.aliensoft.firstgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNum(View view){
        int num = new Random().nextInt(11);
        TextView mostraNum = findViewById(R.id.mostraNum);

        mostraNum.setText("O número sorteado é: " + num);

    }
}
