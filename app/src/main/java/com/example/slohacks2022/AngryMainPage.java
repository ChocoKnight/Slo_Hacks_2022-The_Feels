package com.example.slohacks2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AngryMainPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;
    private ImageButton buttonRedOne;
    private ImageButton buttonRedTwo;
    private ImageButton buttonRedThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.angry_main_page);

        buttonBackMenu = findViewById((R.id.imageButton_red_menu));
        buttonRedOne = findViewById((R.id.imageButton_red_one));
        buttonRedTwo = findViewById((R.id.imageButton_red_two));
        buttonRedThree = findViewById((R.id.imageButton_red_three));

        transitionToFeelingsPage();
        transitionToAngryPaint();
        transitionToAngryPlay();
        transitionToAngryWatch();
    }

    public void transitionToFeelingsPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(AngryMainPage.this, FeelingsPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToAngryPaint()
    {
        buttonRedOne.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(AngryMainPage.this, AngryPaintPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToAngryPlay()
    {
        buttonRedTwo.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(AngryMainPage.this, AngryPlayPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToAngryWatch()
    {
        buttonRedThree.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(AngryMainPage.this, AngryWatchPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
