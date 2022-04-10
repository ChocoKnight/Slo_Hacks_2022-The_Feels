package com.example.slohacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FeelingsPage extends AppCompatActivity {

    private ImageButton buttonAngry;
    private ImageButton buttonHappy;
    private ImageButton buttonNervous;
    private ImageButton buttonExcited;
    private ImageButton buttonConfident;
    private ImageButton buttonSad;
    private Button buttonVideoPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.feelings_page_refined);

        buttonHappy = findViewById((R.id.imageButton_yellow_happy));
        buttonExcited = findViewById((R.id.imageButton_purple_excited));
        buttonSad = findViewById((R.id.imageButton_blue_sad));
        buttonAngry = findViewById((R.id.imageButton_red_angry));
        buttonNervous = findViewById((R.id.imageButton_green_nervous));
        buttonConfident = findViewById((R.id.imageButton_pink_confident));
        buttonVideoPage = findViewById(R.id.button_video);

        buttonHappyPage();
        buttonExcited();
        buttonSad();
        buttonAngry();
        buttonNervous();
        buttonConfident();

        transitionToVideoPage();
    }


    public void transitionToVideoPage()
    {
        buttonVideoPage.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(FeelingsPage.this, VideoPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void buttonAngry()
    {
        buttonAngry.setOnClickListener(v -> {
            Intent changeToAngry = new Intent(FeelingsPage.this, AngryMainPage.class);
            startActivity(changeToAngry); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void buttonHappyPage()
    {
        buttonHappy.setOnClickListener(v -> {
            Intent changeToAngry = new Intent(FeelingsPage.this, HappyMainPage.class);
            startActivity(changeToAngry); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void buttonNervous()
    {
        buttonNervous.setOnClickListener(v -> {
            Intent changeToAngry = new Intent(FeelingsPage.this, NervousMainPage.class);
            startActivity(changeToAngry); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void buttonExcited()
    {
        buttonExcited.setOnClickListener(v -> {
            Intent changeToAngry = new Intent(FeelingsPage.this, ExcitedMainPage.class);
            startActivity(changeToAngry); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void buttonSad()
    {
        buttonSad.setOnClickListener(v -> {
            Intent changeToAngry = new Intent(FeelingsPage.this, SadMainPage.class);
            startActivity(changeToAngry); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void buttonConfident()
    {
        buttonConfident.setOnClickListener(v -> {
            Intent changeToAngry = new Intent(FeelingsPage.this, ConfidentMainPage.class);
            startActivity(changeToAngry); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}