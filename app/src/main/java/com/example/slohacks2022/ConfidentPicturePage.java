package com.example.slohacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class ConfidentPicturePage extends AppCompatActivity {

    private ImageButton buttonBackMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confident_picture_page);

        buttonBackMenu = findViewById((R.id.imageButton_pink_picture_menu));

        transitionToConfidentMainPage();
    }

    public void transitionToConfidentMainPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ConfidentPicturePage.this, ConfidentMainPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}