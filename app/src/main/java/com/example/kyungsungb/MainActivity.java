package com.example.kyungsungb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPosActivity(View v) {
        Intent intent = new Intent(this, ItemPosActivity.class);
        startActivity(intent);
    }

    public void goToCal(View v) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.calculator");
        startActivity(intent);

    }

    public void goToCreditInfo(View v) {
        Intent intent = new Intent(this,CreditInfoActivity.class);
        startActivity(intent);
    }

    public void goToSalesRecord(View v) {
        Intent intent = new Intent(this,SalesRecordActivity.class);
        startActivity(intent);
    }
}