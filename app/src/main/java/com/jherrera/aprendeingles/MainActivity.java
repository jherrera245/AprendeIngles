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

        soundList.add(new Sound("Blue/Azul", R.drawable.blue, R.raw.blue, R.raw.azul));
        soundList.add(new Sound("Yellow/Amarillo", R.drawable.yellow, R.raw.yellow, R.raw.amarillo));
        soundList.add(new Sound("Black/Negro", R.drawable.black, R.raw.black, R.raw.negro));
        soundList.add(new Sound("Gray/Gris", R.drawable.gray, R.raw.grey, R.raw.gris));
        soundList.add(new Sound("Pink/Rosa", R.drawable.pink, R.raw.pink, R.raw.rosa));
        soundList.add(new Sound("Brown/Yellow", R.drawable.brown, R.raw.brown, R.raw.cafe));
        soundList.add(new Sound("Orange/Naranja", R.drawable.orange, R.raw.orange, R.raw.naranja));
        soundList.add(new Sound("Green/Verde", R.drawable.green, R.raw.green, R.raw.verde));
        soundList.add(new Sound("Red/Rojo", R.drawable.red, R.raw.red, R.raw.rojo));
        soundList.add(new Sound("White/Blanco", R.drawable.white, R.raw.white, R.raw.blanco));
    }

    private void setAdapterSound() {
        SoundAdapter adapter = new SoundAdapter(soundList, this);
        recyclerViewContent.setAdapter(adapter);
    }
}