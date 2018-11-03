package com.example.user.atmpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText name;
    private EditText passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View view){
        name = findViewById(R.id.username);
        passwd = findViewById(R.id.password);
        String n = name.getText().toString();
        String pswd = passwd.getText().toString();
        if("ring".equals(n)&&"0528".equals(pswd)){
            setResult(RESULT_OK);
            finish();
        }else{
            Intent intent = new Intent(this,LogonActivity.class);
            startActivity(intent);
        }
    }
}
