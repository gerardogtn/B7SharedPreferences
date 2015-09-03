package com.devf.devfhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FriskaActivity extends AppCompatActivity {

    public static final String LOG_TAG = FriskaActivity.class.getSimpleName();

    Button createAccount;
    EditText username;
    EditText password;
    TextView forgotAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        createAccount = (Button)findViewById(R.id.btn_create_account);
        username = (EditText)findViewById(R.id.edittext_username);
        password = (EditText)findViewById(R.id.edittext_password);
        forgotAccount = (TextView)findViewById(R.id.txt_forgot_account);

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewClicked) {
                Toast toast = Toast.makeText(FriskaActivity.this, "El botón fue clickeado", Toast.LENGTH_SHORT);
                        toast.show();
            }
        });
    }

}
