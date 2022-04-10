package com.example.slohacks2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SadMainPage extends AppCompatActivity {

    private ImageButton buttonBackMenu;
    private ImageButton buttonBlueOne;
    private ImageButton buttonBlueTwo;
    private ImageButton buttonBlueThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.sad_main_page);

        buttonBackMenu = findViewById((R.id.imageButton_blue_menu));
        buttonBlueOne = findViewById((R.id.imageButton_blue_one));
        buttonBlueTwo = findViewById((R.id.imageButton_blue_two));
        buttonBlueThree = findViewById((R.id.imageButton_blue_three));

        transitionToFeelingsPage();
        transitionToSadPaint();
        transitionToSadListen();
        transitionToSadWatch();
    }

    public void transitionToFeelingsPage()
    {
        buttonBackMenu.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(SadMainPage.this, FeelingsPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToSadPaint()
    {
        buttonBlueOne.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(SadMainPage.this, SadPaintPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToSadListen()
    {
        buttonBlueTwo.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(SadMainPage.this, SadListenPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }

    public void transitionToSadWatch()
    {
        buttonBlueThree.setOnClickListener(v -> {
            Intent changeToVideoPage = new Intent(SadMainPage.this, SadWatchPage.class);
            startActivity(changeToVideoPage); // change to feelings page screen
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
