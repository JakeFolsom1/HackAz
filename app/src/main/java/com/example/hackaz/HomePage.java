package com.example.hackaz;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;
/**
 * Created by jacob on 1/13/2018.
 */

public class HomePage extends AppCompatActivity {
    private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemReselectedListener onNavigationItemReselectedListener
             = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                default:

            }
        }
    };
    public void openIngredients(View view) {
        Intent openNewActivity = new Intent(this, DisplayNewView.class);
        startActivity(openNewActivity);
    }
}

