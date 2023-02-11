package com.jherrera.aprendeingles;

public class Sound {
    private String word;
    private int image;
    private int sound;

    public Sound(String word, int image, int sound) {
        this.word = word;
        this.image = image;
        this.sound = sound;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }
}
