package info.kuzinonline.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCatClick(View view) {
        Intent catintent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(catintent);
    }

    public void onBirthdayClick(View view) {
        Intent birthdayintent = new Intent (MainActivity.this, BirthdayActivity.class);
        startActivity(birthdayintent);
    }
}
