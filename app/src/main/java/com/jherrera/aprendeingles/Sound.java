package com.jherrera.aprendeingles;

public class Sound {
    private String word;
    private int image;
    private int soundEnglish;

    private int soundSpanish;

    public Sound(String word, int image, int soundEnglish, int soundSpanish) {
        this.word = word;
        this.image = image;
        this.soundEnglish = soundEnglish;
        this.soundSpanish = soundSpanish;
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

    public int getSoundEnglish() {
        return soundEnglish;
    }

    public void setSoundEnglish(int soundEnglish) {
        this.soundEnglish = soundEnglish;
    }

    public int getSoundSpanish() {
        return soundSpanish;
    }

    public void setSoundSpanish(int soundSpanish) {
        this.soundSpanish = soundSpanish;
    }
}
