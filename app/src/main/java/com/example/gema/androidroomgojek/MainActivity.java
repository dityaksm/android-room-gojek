package com.example.gema.androidroomgojek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ListHistoryModel> listOrder = new ArrayList<>();

    String[] statusOrder = {
            "Selesai",
            "Selesai",
            "Selesai",
            "Selesai"
    };

    String[] timeOrder = {
            "28 Jan, 06:36 PM",
            "10 Feb, 12:13 PM",
            "15 Jul, 23:20 PM",
            "20 Jul, 14:48 PM"
    };

    String[] locationOrder = {
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali",
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali",
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali",
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali"
    };

    int[] imageOrder = {
            R.drawable.food_gojek,
            R.drawable.transport_gojek,
            R.drawable.transport_gojek,
            R.drawable.food_gojek
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler_view);


        for (int i = 0; i < statusOrder.length; i++) {
            ListHistoryModel buah = new ListHistoryModel(statusOrder[i], timeOrder[i], locationOrder[i], imageOrder[i]);
            listOrder.add(buah);
        }

        // adapter
        recycler.setAdapter(new ListHistoryAdapter(MainActivity.this, listOrder));

        // layoutmanager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }
}
