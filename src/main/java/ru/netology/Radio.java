package ru.netology;

public class Radio {
    private int currentNumber;
    private int soundVolume;
    private int maxCurrentNumber = 9;
    private int minCurrentNumber = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int sizeRadio;

    public Radio(int sizeRadio) {
        this.sizeRadio = sizeRadio - 1;
        this.maxCurrentNumber = minCurrentNumber + sizeRadio;

    }

    public Radio() {
    }

    //настройка станции
    public int getCurrentNumber() {
        return currentNumber;
    }
    protected void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > maxCurrentNumber) {
            return;
        }
        if (newCurrentNumber < minCurrentNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public int getMaxCurrentNumber() {
        return maxCurrentNumber;
    }

    public int getMinCurrentNumber() {
        return minCurrentNumber;
    }

    protected void next() {
        if (currentNumber >= maxCurrentNumber) {
            currentNumber = minCurrentNumber;
        } else {
            currentNumber = currentNumber + 1;
        }
    }

    protected void prev() {
        if (currentNumber == minCurrentNumber) {
            currentNumber = maxCurrentNumber;
        } else {
            currentNumber = currentNumber - 1;
        }
    }

    //настройка громкости
    public int getSoundVolume() {
        return soundVolume;
    }
    public int getMinSoundVolume() {
        return minSoundVolume;
    }
    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    protected void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
    }

    protected void volumeUp() {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = maxSoundVolume;
        } else {

            soundVolume = soundVolume + 1;
        }
    }

    protected void volumeDown() {
        if (soundVolume == minSoundVolume) {
            soundVolume = minSoundVolume;
        } else {
            soundVolume = soundVolume - 1;
        }
    }

}

