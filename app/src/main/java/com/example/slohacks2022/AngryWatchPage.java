package com.example.slohacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class AngryWatchPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry_watch_page);

        buttonBackMenu = findViewById((R.id.imageButton_red_watch_menu));

        transitionToAngryMainPage();
    }

    public void transitionToAngryMainPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(AngryWatchPage.this, AngryMainPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}