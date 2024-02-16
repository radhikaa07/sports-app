package com.example.sports_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Sport>sportList;

    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerView);
        sportList= new ArrayList<>();


        Sport s1 = new Sport("football", R.drawable.football);
        Sport s2 = new Sport("basketball", R.drawable.basketball);
        Sport s3= new Sport("vollyball", R.drawable.volley);
        Sport s4= new Sport("tennis", R.drawable.tennis);
        Sport s5= new Sport("ping pong",R.drawable.ping);

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);

        adapter = new CustomAdapter(sportList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}