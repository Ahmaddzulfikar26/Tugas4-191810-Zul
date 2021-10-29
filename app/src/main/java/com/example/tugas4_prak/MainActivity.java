package com.example.tugas4_prak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SepatuAdapter adapter;
    private ArrayList<Sepatu> sepatuArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        adapter = new SepatuAdapter(sepatuArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        sepatuArrayList = new ArrayList<>();
        sepatuArrayList.add(new Sepatu("Nike Air Fragment X TravisScott", "Ukuran = US 10", "Kode Produksi = 021120",R.drawable.travisscot));
        sepatuArrayList.add(new Sepatu("FearOfGod High LightzBone", "Ukuran = US 9", "Kode Produksi = 220318",R.drawable.fog));
        sepatuArrayList.add(new Sepatu("Vans X OffWhite", "Ukuran = US 8.5", "Kode Produksi = 180719",R.drawable.offwhite));
    }
}
