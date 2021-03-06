package naman.basic_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends Activity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.i(TAG, "Hello ");
        setContentView(R.layout.splash);


        new Handler().postDelayed(new Runnable() {

/*
* Showing splash screen with a timer. This will be useful when you
* want to show case your app logo / company
*/

            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,Options.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}


