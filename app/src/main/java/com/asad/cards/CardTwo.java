package com.asad.cards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CardTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_two);
    }

    public void clickListener(View view)
    {
        Intent intent = new Intent(CardTwo.this,MainActivity.class);
        startActivity(intent);
    }
}