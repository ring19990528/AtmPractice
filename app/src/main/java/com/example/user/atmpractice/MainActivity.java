package com.example.user.atmpractice;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final int RC_LOGIN = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boolean logon = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!logon){
            Intent intent =  new Intent(this,LoginActivity.class);
            startActivityForResult(intent,RC_LOGIN);
        }
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RC_LOGIN){
            if(resultCode != RESULT_OK){
                finish();
            }
        }
    }
}
