package com.jherrera.aprendeingles;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SoundAdapter extends RecyclerView.Adapter<SoundAdapter.ViewHolder> implements View.OnClickListener {
    private ArrayList<Sound> soundList;
    private View.OnClickListener clickListener;
    private Context context;
    public SoundAdapter(ArrayList<Sound> soundList, Context context) {
        this.soundList = soundList;
        this.context = context;
    }

    public void setOnClickListener(View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public SoundAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_desing, null, false);
        view.setOnClickListener(this);
        return new SoundAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundAdapter.ViewHolder holder, int position) {
        holder.textViewWord.setText(soundList.get(position).getWord());
        holder.imageViewLearn.setImageResource(soundList.get(position).getImage());

        holder.buttonEnglish.setOnClickListener(view -> {
            if(holder.mediaPlayer != null) {
                if (holder.mediaPlayer.isPlaying()) {
                    holder.mediaPlayer.release();
                    holder.mediaPlayer = null;
                }
            }
            holder.mediaPlayer = MediaPlayer.create(this.context, soundList.get(position).getSoundEnglish());
            holder.mediaPlayer.start();

            Toast.makeText(context, "Listening word "+holder.textViewWord.getText()+" in English", Toast.LENGTH_SHORT).show();
        });

        holder.buttonSpanish.setOnClickListener(view -> {
            if(holder.mediaPlayer != null) {
                if (holder.mediaPlayer.isPlaying()) {
                    holder.mediaPlayer.release();
                    holder.mediaPlayer = null;
                }
            }
            holder.mediaPlayer = MediaPlayer.create(this.context, soundList.get(position).getSoundSpanish());
            holder.mediaPlayer.start();

            Toast.makeText(context, "Listening word "+holder.textViewWord.getText()+" in Spanish", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return soundList.size();
    }

    @Override
    public void onClick(View view) {
        if(clickListener != null) {
            clickListener.onClick(view);
        }
    }

    //implementamos la interfaz OnClickListener para el evento del click
    public class ViewHolder extends RecyclerView.ViewHolder {

        //Declarations of card vars elements
        private TextView textViewWord;
        private ImageView imageViewLearn;
        private Button buttonEnglish;
        private Button buttonSpanish;
        private MediaPlayer mediaPlayer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewWord = itemView.findViewById(R.id.textViewWord);
            imageViewLearn = itemView.findViewById(R.id.imageViewLearn);
            buttonEnglish = itemView.findViewById(R.id.buttonEnglish);
            buttonSpanish = itemView.findViewById(R.id.buttonSpanish);
        }
    }
}
