package ru.netology.Radio;

public class Radio {
    private int currentStation;
    private int lastStation = 9;
    private int firstStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int lastStation, int firstStation, int maxVolume, int minVolume) {
        this.lastStation = lastStation;
        this.firstStation = firstStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio() {
    }

    public Radio(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        setCurrentStation(currentStation + 1);
    }

    public void prev() {
        setCurrentStation(currentStation - 1);
    }

    public void plusOne() {
        setCurrentVolume(currentVolume + 1);
    }

    public void minusOne() {
        setCurrentVolume(currentVolume - 1);
    }

    public void setCurrentStation(int desiredStation) {

        if (desiredStation > lastStation) {
            this.currentStation = firstStation;
        } else if (desiredStation < firstStation) {
            this.currentStation = lastStation;
        } else {
            this.currentStation = desiredStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume;
        }
    }
}