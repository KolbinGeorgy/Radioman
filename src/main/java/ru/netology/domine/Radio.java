package ru.netology.domine;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

    public void prevStation() {
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {
            this.currentStation = 9;
        }
    }

    public void stationInput(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
    }

    public void volumeDown() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume <= 0) {
            this.currentVolume = 0;
        }
    }
}
