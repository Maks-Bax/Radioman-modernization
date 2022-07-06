package ru.netology.Radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int Stations = 10;

    public Radio(int stations) {
        this.Stations = stations;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        setCurrentStation(currentStation++);
    }

    public void prev() {
        setCurrentStation(currentStation--);
    }

    public void more() {
        setCurrentVolume(currentVolume++);
    }

    public void less() {
        setCurrentVolume(currentVolume--);
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = Stations;
        }
        if (currentStation > 30) {
            currentStation = Stations;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }
}