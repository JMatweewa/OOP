package ru.netology.domain.field;


public class Radio {
    private int quantityRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int calculateNextRadioStation() {
        if (currentRadioStation < quantityRadioStation - 1) {
            this.currentRadioStation = currentRadioStation + 1;
        } else {
            return this.currentRadioStation = minRadioStation;
        }
        return this.currentRadioStation;
    }

    public int calculatePrevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            return this.currentRadioStation = quantityRadioStation - 1;
        }
        return this.currentRadioStation;
    }

    public int calculateIncreaseVolume() {
        if (currentVolume + 1 > maxVolume) {
            return this.currentVolume = maxVolume;
        } else {
            return this.currentVolume = currentVolume + 1;
        }
    }

    public int calculateLowVolume() {
        if (currentVolume > minVolume) {
            return this.currentVolume = currentVolume - 1;
        } else {
            return this.currentVolume = minVolume;
        }
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public void setQuantityRadioStation(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > quantityRadioStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }
}
