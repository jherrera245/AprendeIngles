package com.jherrera.aprendeingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewContent;
    private ArrayList<Sound> soundList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes components
        setInitComponents();
        addSoundList();
        setAdapterSound();
    }

    private void setInitComponents() {
        recyclerViewContent = findViewById(R.id.recyclerViewContent);
        recyclerViewContent.setLayoutManager(new LinearLayoutManager(this));
    }

    private void addSoundList() {
        soundList = new ArrayList<>();
        soundList.add(new Sound("Azul / Blue", R.drawable.ic_pause, 2));
        soundList.add(new Sound("Azul / Blue", R.drawable.ic_pause, 2));
        soundList.add(new Sound("Azul / Blue", R.drawable.ic_pause, 2));
        soundList.add(new Sound("Azul / Blue", R.drawable.ic_pause, 2));
        soundList.add(new Sound("Azul / Blue", R.drawable.ic_pause, 2));
    }

    private void setAdapterSound() {
        SoundAdapter adapter = new SoundAdapter(soundList);
        recyclerViewContent.setAdapter(adapter);
    }
}