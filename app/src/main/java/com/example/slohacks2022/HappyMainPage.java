package com.example.slohacks2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HappyMainPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;
    private ImageButton buttonYellowOne;
    private ImageButton buttonYellowTwo;
    private ImageButton buttonYellowThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.happy_main_page);

        buttonBackMenu = findViewById((R.id.imageButton_yellow_menu));
        buttonYellowOne = findViewById((R.id.imageButton_yellow_one));
        buttonYellowTwo = findViewById((R.id.imageButton_yellow_two));
        buttonYellowThree = findViewById((R.id.imageButton_yellow_three));

        transitionToFeelingsPage();
        transitionToHappyPicture();
        transitionToYellowPlay();
        transitionToYellowWatch();
    }

    public void transitionToFeelingsPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(HappyMainPage.this, FeelingsPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToHappyPicture()
    {
        buttonYellowOne.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(HappyMainPage.this, HappyPicturePage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToYellowPlay()
    {
        buttonYellowTwo.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(HappyMainPage.this, HappyPlayPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToYellowWatch()
    {
        buttonYellowThree.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(HappyMainPage.this, HappyWatchPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
