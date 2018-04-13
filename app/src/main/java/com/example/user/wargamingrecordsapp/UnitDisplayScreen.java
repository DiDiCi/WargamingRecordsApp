package com.example.user.wargamingrecordsapp;

import android.hardware.Sensor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UnitDisplayScreen extends AppCompatActivity {

    TextView txtUnitName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_display_screen);

        Bundle bundle = getIntent().getExtras();
        Unit unit = bundle.getParcelable("unitName");

        txtUnitName = (TextView) findViewById(R.id.txtUnitName);

        txtUnitName.setText(unit.getUnitName());
    }
}