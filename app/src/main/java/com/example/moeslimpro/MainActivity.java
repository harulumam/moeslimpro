package com.example.moeslimpro;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }


    }


    public void MasjidTerdekat(View view) {
        Intent intent = new Intent(MainActivity.this, MasjidActivity.class);
        startActivity(intent);
    }


    public void home(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void alquran(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, AlquranActivity.class);
        startActivity(intent);
    }

    public void kiblat(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, KiblatActivity.class);
        startActivity(intent);
    }

    public void favorite(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, FavoriteActivity.class);
        startActivity(intent);
    }

    public void settings(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    public void Adzan(View view) {
        Intent intent = new Intent(MainActivity.this, AdzanActivity.class);
        startActivity(intent);
    }

    public void Shalat(View view) {
        Intent intent = new Intent(MainActivity.this, ShalatActivity.class);
        startActivity(intent);
    }

    public void Dzikir(View view) {
        Intent intent = new Intent(MainActivity.this, DzikirActivity.class);
        startActivity(intent);
    }

    public void Doa(View view) {
        Intent intent = new Intent(MainActivity.this, DoaActivity.class);
        startActivity(intent);
    }

    public void Hadist(View view) {
        Intent intent = new Intent(MainActivity.this, HadistActivity.class);
        startActivity(intent);
    }

    public void Lainnya(View view) {
        Intent intent = new Intent(MainActivity.this, LainnyaActivity.class);
        startActivity(intent);
    }
}