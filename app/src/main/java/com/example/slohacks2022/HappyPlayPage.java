package com.example.slohacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HappyPlayPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_play_page);

        buttonBackMenu = findViewById((R.id.imageButton_yellow_play_menu));

        transitionToHappyMainPage();
    }

    public void transitionToHappyMainPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(HappyPlayPage.this, HappyMainPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}