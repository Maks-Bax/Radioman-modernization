package ru.netology.Radio;

public class Radio {

    private int lastStation = 9;
    private int firstStation = 0;
    private int currentStation;
    private int totalStations = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int totalStations) {
        this.totalStations = totalStations;
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