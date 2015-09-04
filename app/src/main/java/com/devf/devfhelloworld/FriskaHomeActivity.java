package com.devf.devfhelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FriskaHomeActivity extends AppCompatActivity {

    TextView etiquetaDelUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friska_home);

        etiquetaDelUsername = (TextView) findViewById(R.id.txt_username);

        //Recuperación de los datos
        Intent intentDelLogin = getIntent();

        String usernameCapturado = intentDelLogin.getStringExtra("EXTRA_USERNAME");

        //Pintar el username
        etiquetaDelUsername.setText(usernameCapturado);
    }

}
