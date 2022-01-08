package ru.netology;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation(int currentRadioStation) {

        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 10) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setPrevRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation <= -1) {
            currentRadioStation = 9;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void setLowVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }
}


