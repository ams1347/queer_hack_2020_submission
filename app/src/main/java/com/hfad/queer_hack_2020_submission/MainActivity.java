package com.hfad.queer_hack_2020_submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView coolText = findViewById(R.id.image_caption);
        coolText.setText("Hello again");
    }

    public void goToShop(View v){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }
}