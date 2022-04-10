package com.example.slohacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

// the start page
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // hides the activity bar and fill up the full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.landing_page_refined);

        mainPageTransition();
    }

    /**
     * Method Function: Directs user to the main FeelingsPage
     *
     * Precondition: None
     * Post Condition: Changes activity to FeelingsPage
     */
    public void mainPageTransition()
    {
        new CountDownTimer(3000,1000){
            public void onTick(long millisUntilFinished) {
                //Toast.makeText(getApplicationContext(), "One Second Passes", Toast.LENGTH_SHORT).show();
            }

            public void onFinish() {
                Intent changeToFeelingsPage = new Intent(MainActivity.this, FeelingsPage.class);
                startActivity(changeToFeelingsPage); // change to feelings page screen
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }.start();
    }
}

// copy paste for function descriptions
/**
 * Method Function:
 *
 * Precondition:
 * Post Condition:
 */