package com.example.slohacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class SadPaintPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad_paint_page);

        buttonBackMenu = findViewById((R.id.imageButton_blue_paint_menu));

        transitionToSadMainPage();
    }

    public void transitionToSadMainPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(SadPaintPage.this, SadMainPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

}