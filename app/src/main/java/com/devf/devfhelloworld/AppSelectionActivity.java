package com.devf.devfhelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppSelectionActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String LOG_TAG = AppSelectionActivity.class.getSimpleName();

    Button btnFriska;
    Button btnWhatsong;
    Button btnCardApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        btnFriska = (Button) findViewById(R.id.btn_friska);
        btnWhatsong = (Button) findViewById(R.id.btn_whatsong);
        btnCardApp = (Button) findViewById(R.id.btn_card_app);
        

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        btnFriska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Definir que hacer cuando el listener detecte que están haciendo click
            }
        });







        btnWhatsong.setOnClickListener(this);
        btnCardApp.setOnClickListener(this);

    }

    @Override
    public void onClick(View viewClicked) {
        int idClickedView = viewClicked.getId();

        switch (idClickedView) {

            case R.id.btn_friska:
                Intent veAFriska = new Intent(AppSelectionActivity.this, FriskaActivity.class);
                startActivity(veAFriska);
                break;

            case R.id.btn_whatsong:
                Toast.makeText(this, "Whatsong", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_card_app:
                Toast.makeText(this, "Card App", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
