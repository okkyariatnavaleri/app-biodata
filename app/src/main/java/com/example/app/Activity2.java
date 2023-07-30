package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView nama, jenis_kelamin, alamat, tempat_lahir, nomor_hp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        nama=findViewById(R.id.nama);
        jenis_kelamin=findViewById(R.id.jenis_kelamin);
        alamat=findViewById(R.id.alamat);
        tempat_lahir=findViewById(R.id.tempat_lahir);
        nomor_hp=findViewById(R.id.nomor_hp);

        String get_nama=getIntent().getStringExtra("kirim nama");
        String get_jenis=getIntent().getStringExtra("kirim jenis kelamin");
        String get_alamat=getIntent().getStringExtra("kirim alamat");
        String get_tempat=getIntent().getStringExtra("kirim tempat lahir");
        String get_nohp=getIntent().getStringExtra("kirim nomor hp");
        nama.setText(get_nama);
        jenis_kelamin.setText(get_jenis);
        alamat.setText(get_alamat);
        tempat_lahir.setText(get_tempat);
        nomor_hp.setText(get_nohp);
    }
}