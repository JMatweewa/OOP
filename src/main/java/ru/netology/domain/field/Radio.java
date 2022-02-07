package ru.netology.domain.field;

public class Radio {

    private int quantityRadioStation = 10;
    private int maxCurrentRadioStation = this.calculateMaxCurrentRadioStation();
    private int currentRadioStation;
    private int minCurrentRadioStation = 0;
    private int nextRadioStation = this.calculateNextRadioStation();
    private int prevRadioStation = this.calculatePrevRadioStation();
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int increaseVolume = this.calculateIncreaseVolume();
    private int lowVolume = this.calculateLowVolume();

    public Radio() {

    }

    public Radio(int quantityRadioStation, int maxCurrentRadioStation, int currentRadioStation, int minCurrentRadioStation, int nextRadioStation, int prevRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
        this.maxCurrentRadioStation = maxCurrentRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.minCurrentRadioStation = minCurrentRadioStation;
        this.nextRadioStation = nextRadioStation;
        this.prevRadioStation = prevRadioStation;
    }

    public Radio(int currentVolume, int increaseVolume, int lowVolume) {
        this.currentVolume = currentVolume;
        this.increaseVolume = increaseVolume;
        this.lowVolume = lowVolume;
    }

    private int calculateMaxCurrentRadioStation() {
        return this.quantityRadioStation - 1;
    }

    private int calculateNextRadioStation() {
        this.currentRadioStation = currentRadioStation + 1;

        if (currentRadioStation > maxCurrentRadioStation) {
            this.currentRadioStation = minCurrentRadioStation;
        }
        return this.currentRadioStation;
    }

    private int calculatePrevRadioStation() {

        this.currentRadioStation = currentRadioStation - 1;

        if (currentRadioStation <= -1) {
            this.currentRadioStation = maxCurrentRadioStation;
        }
        return this.currentRadioStation;
    }

    private int calculateIncreaseVolume() {

        this.currentVolume = currentVolume + 1;
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
        return this.currentVolume;
    }

    private int calculateLowVolume() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
        return this.currentVolume;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMinCurrentRadioStation() {
        return minCurrentRadioStation;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public int getLowVolume() {
        return lowVolume;
    }

    public int getPrevRadioStation() {
        return prevRadioStation;
    }

    public int getMaxCurrentRadioStation() {
        return maxCurrentRadioStation;
    }

    public int getNextRadioStation() {
        return nextRadioStation;
    }
}