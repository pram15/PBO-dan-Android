package com.smkrevit.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Load();
        isiData();
    }

    public void Load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Eko", "Surabaya"));
        siswaList.add(new Siswa("Tejo", "Surabaya"));
        siswaList.add(new Siswa("Siti", "Surabaya"));
        siswaList.add(new Siswa("Roni", "Surabaya"));
        siswaList.add(new Siswa("Burhan", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));
        siswaList.add(new Siswa("Joni", "Surabaya"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("JONI RAMBO", "JAKARTA"));
        adapter.notifyDataSetChanged();
    }
}