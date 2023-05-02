package com.example.praktikumlab3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvNama;
    EditText etJumlah;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.nama);
        etJumlah= findViewById(R.id.nominal);
        btnsubmit= findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder(MainActivity.this);

                alertdialogBuilder.setTitle("konfirmasi");
                alertdialogBuilder.setMessage("apakah anda yakin menyimpan data?")
                        .setIcon(R.drawable.ic_avatar)
                        .setCancelable(false)
                        .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String nama = tvNama.getText().toString();
                                String Jumlah = etJumlah.getText().toString();

                                if (Jumlah.isEmpty(){
                                    Toast.makeText(MainActivity.this "jumlah Pengeluaran harus diisi".)
                                }else {
                                    //opsi 1 passing data
                                    Bundle bundle = new Bundle();
                                    bundle.putString("keyNama",nama);
                                    bundle.putString("keyJumlah", Jumlah);
                                    Intent intent= new Intent(MainActivity.this, DataActivity.class);
                                    intent.putExtra(bundle);
                                    startActivities(intent);


                                }

                            }
                        })
                        .setNegativeButton("tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();

                            }
                        });
                AlertDialog dialog= alertdialogBuilder.create();
                dialog.show();
            }
        });
    }
}