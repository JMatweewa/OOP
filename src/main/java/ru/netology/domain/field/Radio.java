package ru.netology.domain.field;


public class Radio {
    private int quantityRadioStation = 10;
    private int maxRadioStation = calculateMaxRadioStation(quantityRadioStation);
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int nextRadioStation = calculateNextRadioStation(currentRadioStation);
    private int prevRadioStation = calculatePrevRadioStation(currentRadioStation);
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int increaseVolume = calculateIncreaseVolume(currentVolume);
    private int lowVolume = calculateLowVolume(currentVolume);

    public Radio() {

    }

    public Radio(int quantityRadioStation, int maxRadioStation, int currentRadioStation, int currentVolume) {
        this.quantityRadioStation = quantityRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
    }

    public int calculateMaxRadioStation(int quantityRadioStation) {
        this.maxRadioStation = quantityRadioStation - 1;
        return maxRadioStation;
    }

    public int calculateNextRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation + 1;
        return currentRadioStation + 1;
    }

    public int calculatePrevRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation - 1;
        return currentRadioStation - 1;
    }

    public int calculateIncreaseVolume(int currentVolume) {
        this.currentVolume = currentVolume + 1;
        return currentVolume + 1;
    }

    public int calculateLowVolume(int currentVolume) {
        this.currentVolume = currentVolume - 1;
        return currentVolume - 1;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getNextRadioStation() {
        return nextRadioStation = currentRadioStation;
    }

    public void setNextRadioStation(int currentRadioStation) {
        if (currentRadioStation >= maxRadioStation) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }

    public int getPrevRadioStation() {
        return prevRadioStation = currentRadioStation;
    }

    public void setPrevRadioStation(int currentRadioStation) {

        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            this.currentRadioStation = maxRadioStation;
        }
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

    public int getIncreaseVolume() {
        return increaseVolume = currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume + 1 > maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public int getLowVolume() {
        return lowVolume = currentVolume;
    }

    public void setLowVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = minVolume;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }
}









