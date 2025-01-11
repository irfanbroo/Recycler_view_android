package com.example.recycleview;

import android.os.Bundle;
import android.widget.Adapter;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.Myadapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcview;
    private Myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rcview = findViewById(R.id.rcview);
        rcview.setHasFixedSize(true);
        rcview.setLayoutManager(new LinearLayoutManager(this));
        List<ListItem> itemList = new ArrayList();

       for(int i=0;i<50;i++){
           ListItem item = new ListItem("i am title","position" + i);
           itemList.add(item);
       }


        adapter = new Myadapter(MainActivity.this,itemList);
        rcview.setAdapter(adapter);



    }
}