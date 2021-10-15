package com.example.impintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.security.Key;

public class MainActivity extends AppCompatActivity {
EditText editUri,editnama;
String KEY_NAME = "Nama Saya :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //implicit
    public void proses_visit(View view) {
    String url = editUri.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }
//explicit
    public void proses_simpan(View view) {
        String nama = editnama.getText().toString();
        Intent intent = new Intent( this, SecondActivity.class);
        intent.putExtra(KEY_NAME, nama);
        startActivity(intent);
    }
}