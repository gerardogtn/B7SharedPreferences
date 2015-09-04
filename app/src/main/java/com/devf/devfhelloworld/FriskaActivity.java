package com.devf.devfhelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FriskaActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String LOG_TAG = FriskaActivity.class.getSimpleName();

    Button createAccount;
    Button login;
    EditText username;
    EditText password;
    TextView forgotAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        createAccount = (Button)findViewById(R.id.btn_create_account);
        login = (Button) findViewById(R.id.btn_login);
        username = (EditText)findViewById(R.id.edittext_username);
        password = (EditText)findViewById(R.id.edittext_password);
        forgotAccount = (TextView)findViewById(R.id.txt_forgot_account);

        //Asignando el escuchador
        login.setOnClickListener(this);

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewClicked) {
                Toast toast = Toast.makeText(FriskaActivity.this, "El botón fue clickeado", Toast.LENGTH_SHORT);
                        toast.show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        String usuarioCapturado = username.getText().toString();
        String passwordCapturado = password.getText().toString();

        //Validación de campos
        if (usuarioCapturado.isEmpty() || passwordCapturado.isEmpty()){
            username.setError("No puede estar vacio");
            password.setError("No puede estar vacio");
        }

        else {
            Intent veAlHome = new Intent(this, FriskaHomeActivity.class);
            veAlHome.putExtra("EXTRA_USERNAME", usuarioCapturado);
            veAlHome.putExtra("EXTRA_PASSWORD", passwordCapturado);

            startActivity(veAlHome);
        }
    }
}
