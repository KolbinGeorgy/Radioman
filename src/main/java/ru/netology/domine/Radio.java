package ru.netology.domine;

public class Radio {

    private int maxStation;
    private int minStation = 0;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int summStations) {
        this.maxStation = summStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void previousStation() {
        if (currentStation == minStation) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {//  Установить уровень звука
        if (currentVolume < minVolume) {// Если меньше минимума
            return;
        }
        if (currentVolume > maxVolume) {//  Если больше максимума (в конструкторе)
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {//  Громкость +1
        if (currentVolume == maxVolume) { // Если равна Max
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void volumeDown() {//  Громкость -1
        if (currentVolume == minVolume) {   //  Если равна Min
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}
