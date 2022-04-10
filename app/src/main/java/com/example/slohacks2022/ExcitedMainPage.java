package com.example.slohacks2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ExcitedMainPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;
    private ImageButton buttonPurpleOne;
    private ImageButton buttonPurpleTwo;
    private ImageButton buttonPurpleThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.excited_main_page);

        buttonBackMenu = findViewById((R.id.imageButton_purple_menu));
        buttonPurpleOne = findViewById((R.id.imageButton_purple_one));
        buttonPurpleTwo = findViewById((R.id.imageButton_purple_two));
        buttonPurpleThree = findViewById((R.id.imageButton_purple_three));

        transitionToFeelingsPage();
        transitionToExcitedPicture();
        transitionToExcitedDance();
        transitionToExcitedWatch();
    }

    public void transitionToFeelingsPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ExcitedMainPage.this, FeelingsPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToExcitedPicture()
    {
        buttonPurpleOne.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ExcitedMainPage.this, ExcitedPicturePage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToExcitedDance()
    {
        buttonPurpleTwo.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ExcitedMainPage.this, ExcitedDancePage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToExcitedWatch()
    {
        buttonPurpleThree.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(ExcitedMainPage.this, ExcitedWatchPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
