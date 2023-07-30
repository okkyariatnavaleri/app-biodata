package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nama, jenis_kelamin, alamat, tempat_lahir, nomor_hp;
    Button kirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama=findViewById(R.id.nama);
        jenis_kelamin=findViewById(R.id.jenis_kelamin);
        alamat=findViewById(R.id.alamat);
        tempat_lahir=findViewById(R.id.tempat_lahir);
        nomor_hp=findViewById(R.id.nomor_hp);

        kirim=findViewById(R.id.kirim_data);
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra("kirim nama", nama.getText().toString());
                intent.putExtra("kirim jenis kelamin", jenis_kelamin.getText().toString());
                intent.putExtra("kirim alamat", alamat.getText().toString());
                intent.putExtra("kirim tempat lahir", tempat_lahir.getText().toString());
                intent.putExtra("kirim nomor hp", nomor_hp.getText().toString());
                startActivity(intent);
            }
        });
    }
}