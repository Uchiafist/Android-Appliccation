package com.csc411db.roomready;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;

public class ActivitySplashTwo extends Activity
{
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_two);

        new Handler().postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                //The following will happen after the timer is complete
                Intent i = new Intent(ActivitySplashTwo.this, ActivityLogIn.class);

                //Bundle extras = new Bundle();
                //extras.putString("appJSON", jsonForSearch);
                //extras.putString("applicationWanted", appToSearch);
                //i.putExtras(extras);

                startActivity(i);
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_splash_two, menu);
        return true;
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }


    
}
