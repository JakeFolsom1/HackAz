package com.example.hackaz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
public class DisplayNewView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void BackToMenu(View view) {
        Intent openNewActivity = new Intent(this, HomePage.class);
        startActivity(openNewActivity);

    }
}
