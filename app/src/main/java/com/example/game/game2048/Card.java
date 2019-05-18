package com.example.game.game2048;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Leon on 2017/12/10 0010.
 */

public class Card extends FrameLayout {
    private int num = 0;
    private TextView lable;

    public Card(@NonNull Context context) {
        super(context);
        lable = new TextView(getContext());
        lable.setTextSize(32);
        lable.setBackgroundColor(0x33ffffff);
        lable.setGravity(Gravity.CENTER);
        LayoutParams lp = new LayoutParams(-1,-1);
        lp.setMargins(10,10,0,0);
        addView(lable,lp);
        setNum(0);
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
        if (num <= 0){
            lable.setText("");
        }else {
            lable.setText(num+"");
        }
    }
    public boolean equals(Card o) {
        return getNum() == o.getNum();
    }
}
