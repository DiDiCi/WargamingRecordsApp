package com.example.user.wargamingrecordsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuScreen extends AppCompatActivity implements View.OnClickListener{

    Button btnViewRecords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        btnViewRecords = (Button) findViewById(R.id.btnUnitRecords);

        btnViewRecords.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnUnitRecords:
                openRecordsPage();
        }
    }

    public void openRecordsPage() {
        Intent intent = new Intent(this, RecordsScreen.class);
        startActivity(intent);
    }
}