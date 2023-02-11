package com.jherrera.aprendeingles;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SoundAdapter extends RecyclerView.Adapter<SoundAdapter.ViewHolder> implements View.OnClickListener {
    private ArrayList<Sound> soundList;

    public SoundAdapter(ArrayList<Sound> soundList) {
        this.soundList = soundList;
    }

    @NonNull
    @Override
    public SoundAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_desing, null, false);
        return new SoundAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundAdapter.ViewHolder holder, int position) {
        holder.textViewWord.setText(soundList.get(position).getWord());
        holder.imageViewLearn.setImageResource(soundList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return soundList.size();
    }

    @Override
    public void onClick(View view) {

    }

    //implementamos la interfaz OnClickListener para el evento del click
    public class ViewHolder extends RecyclerView.ViewHolder {

        //Declarations of card vars elements
        private TextView textViewWord;
        private ImageView imageViewLearn;
        private ImageView imageViewPlayOrPause;
        private ImageView imageViewStop;
        private MediaPlayer mediaPlayer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewWord = itemView.findViewById(R.id.textViewWord);
            imageViewLearn = itemView.findViewById(R.id.imageViewLearn);
            imageViewPlayOrPause = itemView.findViewById(R.id.imageViewPlayOrPause);
            imageViewStop = itemView.findViewById(R.id.imageViewStop);
        }
    }
}
