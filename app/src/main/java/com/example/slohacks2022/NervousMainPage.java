package com.example.slohacks2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class NervousMainPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;
    private ImageButton buttonGreenOne;
    private ImageButton buttonGreenTwo;
    private ImageButton buttonGreenThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.nervous_main_page);

        buttonBackMenu = findViewById((R.id.imageButton_green_menu));
        buttonGreenOne = findViewById((R.id.imageButton_green_one));
        buttonGreenTwo = findViewById((R.id.imageButton_green_two));
        buttonGreenThree = findViewById((R.id.imageButton_green_three));

        transitionToFeelingsPage();
        transitionToNervousPaint();
        transitionToNervousListen();
        transitionToNervousWatch();
    }

    public void transitionToFeelingsPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(NervousMainPage.this, FeelingsPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToNervousPaint()
    {
        buttonGreenOne.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(NervousMainPage.this, NervousPaintPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToNervousListen()
    {
        buttonGreenTwo.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(NervousMainPage.this, NervousListenPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToNervousWatch()
    {
        buttonGreenThree.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(NervousMainPage.this, NervousWatchPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
