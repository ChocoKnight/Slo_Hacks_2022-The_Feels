package com.example.slohacks2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConfidentMainPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;
    private ImageButton buttonPinkOne;
    private ImageButton buttonPinkTwo;
    private ImageButton buttonPinkThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.confident_main_page);

        buttonBackMenu = findViewById((R.id.imageButton_pink_menu));
        buttonPinkOne = findViewById((R.id.imageButton_pink_one));
        buttonPinkTwo = findViewById((R.id.imageButton_pink_two));
        buttonPinkThree = findViewById((R.id.imageButton_pink_three));

        transitionToFeelingsPage();
        transitionToConfidentPicture();
        transitionToConfidentPose();
        transitionToConfidentWatch();
    }

    public void transitionToFeelingsPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ConfidentMainPage.this, FeelingsPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToConfidentPicture()
    {
        buttonPinkOne.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ConfidentMainPage.this, ConfidentPicturePage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToConfidentPose()
    {
        buttonPinkTwo.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ConfidentMainPage.this, ConfidentPosePage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToConfidentWatch()
    {
        buttonPinkThree.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ConfidentMainPage.this, ConfidentWatchPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
