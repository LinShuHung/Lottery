package com.suhun.lottery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    String tag = MainActivity.class.getSimpleName();
    int numOfLottery = 6;
    TextView[] lotteryNum = new TextView[numOfLottery];
    int[] view = {R.id.num0, R.id.num1, R.id.num2, R.id.num3, R.id.num4, R.id.num5};
    Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLotteryNum();
            }
        });
    }

    private void initView(){
        for(int i=0; i< lotteryNum.length;i++){
            lotteryNum[i] = findViewById(view[i]);
            lotteryNum[i].setText("-");
        }
        createButton =findViewById(R.id.createNum);
    }

    private void showLotteryNum(){
        int[] lotteryNumber = createLotteryNumber();
        for(int i=0;i<lotteryNumber.length;i++){
            Log.d(tag, "Lottery number is " + lotteryNumber[i]);
            lotteryNum[i].setText(""+lotteryNumber[i]);
        }
    }

    private int[] createLotteryNumber(){
        TreeSet<Integer> numSet = new TreeSet<>();
        int i=0;int[] numTemp = new int[lotteryNum.length];

        while(numSet.size()<lotteryNum.length){
            numSet.add(new Random().nextInt(49)+1);
        }
        for(Integer num:numSet){
            numTemp[i++] = num;
        }
        return numTemp;
    }
}