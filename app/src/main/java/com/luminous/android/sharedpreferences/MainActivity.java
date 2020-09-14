package com.luminous.android.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.luminous.android.sharedpreferences", Context.MODE_PRIVATE);

        sharedPreferences.edit().putString("name", "Imran").apply();
        String name = sharedPreferences.getString("name", "");
        Log.i("Saved Name is: ", name);

        ArrayList<String> friends = new ArrayList<>();

        friends.add("Anik");
        friends.add("Linkon");
        friends.add("Nayeem");
        friends.add("Munir");
    }
}