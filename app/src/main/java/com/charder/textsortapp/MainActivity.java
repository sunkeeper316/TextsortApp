package com.charder.textsortapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> strings = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strings.addAll(Arrays.asList("三","c","ㄧ","G","h","一七二","五","ㄠ","一四","一二" , "A" ,"a" ,"ㄕ","C"));
        Collator collator = Collator.getInstance();
        Collator.getInstance();
        Collections.sort(strings , collator);
        Log.e("strings", String.valueOf(strings));

    }
}