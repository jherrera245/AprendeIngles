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
        /*
        * Sound
        * word -> nombre de la palabra en ingles y español ejemplo Perro / Dog
        * image -> imagen de referencia de la palabra guadar en drawable con el mismo nombre de la palabra ejem. jpg
        * soundEnglish -> sonido en Ingles guardar con el dombre del animal ejemplo dog_english.mp3
        * soundSpanish -> sonido en Español guadar con el nombre del animal ejemplo dog_spanish.mp3
        *
        * Ejemplo
        * soundList.add(new Sound("Perro / Dog", R.drawable.dog, R.raw.dog_english, R.raw.dog_spanish));
        * */

        soundList.add(new Sound("Mario", R.drawable.mario, R.raw.mario_sound, R.raw.mario_vida));
        soundList.add(new Sound("Mario", R.drawable.mario, R.raw.mario_sound, R.raw.mario_vida));
    }

    private void setAdapterSound() {
        SoundAdapter adapter = new SoundAdapter(soundList, this);
        recyclerViewContent.setAdapter(adapter);
    }
}