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

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int calculateMaxRadioStation(int quantityRadioStation) {
        this.maxRadioStation = quantityRadioStation - 1;
        return maxRadioStation;
    }

    public int calculateNextRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return this.currentRadioStation = minRadioStation;
        }
        if (currentRadioStation >= maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        } else {
            return this.currentRadioStation = currentRadioStation + 1;
        }
        return this.currentRadioStation;
    }


    public int calculatePrevRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return this.currentRadioStation = maxRadioStation;
        }
        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            return this.currentRadioStation = maxRadioStation;
        }
        return this.currentRadioStation;
    }

    public int calculateIncreaseVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return this.currentVolume = minVolume;
        }
        if (currentVolume + 1 > maxVolume) {
            return this.currentVolume = maxVolume;
        } else {
            return this.currentVolume = currentVolume + 1;
        }
    }

    public int calculateLowVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return this.currentVolume = maxVolume;
        }
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
        if (quantityRadioStation <= minRadioStation) {
            return;
        }
        if (quantityRadioStation > maxRadioStation) {
            return;
        }
        this.quantityRadioStation = quantityRadioStation;
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

    public int getPrevRadioStation() {
        return prevRadioStation = currentRadioStation;
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

    public int getLowVolume() {
        return lowVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}









