package com.w3sols.rewards;

import android.content.Context;
import android.widget.Toast;

public class Rewards {
    public static void showToast(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
