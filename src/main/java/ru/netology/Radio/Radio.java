package ru.netology.Radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }

    public Radio(int totalStations) {
        this.maxStation = totalStations - 1;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void next() {
        setCurrentStation(currentStation = currentStation + 1);
    }

    public void prev() {
        setCurrentStation(currentStation = currentStation - 1);
    }

    public void plusOne() {
        setCurrentVolume(currentVolume = currentVolume + 1);
    }

    public void minusOne() {
        setCurrentVolume(currentVolume = currentVolume - 1);
    }

    public void setCurrentStation(int desiredStation) {
        if (desiredStation < minStation) {
            desiredStation = maxStation;
        }
        if (desiredStation > maxStation) {
            desiredStation = minStation;
        }
        this.currentStation = desiredStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }
}