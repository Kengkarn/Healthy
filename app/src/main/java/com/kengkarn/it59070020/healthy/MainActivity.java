package com.kengkarn.it59070020.healthy;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase myDB = openOrCreateDatabase("my.db", MODE_PRIVATE, null);
        myDB.execSQL("CREATE TABLE IF NOT EXISTS sleep (_id INTEGER PRIMARY KEY AUTOINCREMENT, currentdate VARCHAR(200), timetosleep VARCHAR(200), timetowakeup VARCHAR(200), counttime VARCHAR(200))");
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_view, new LoginFragment()).commit();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_view, new LoginFragment()).commit();
    }
}
