package ru.netology.domain.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // значения по умолчанию
    @Test
    public void checkQuantityRadioStation() {
        Radio radio = new Radio();

        assertEquals(10, radio.getQuantityRadioStation());
    }

    @Test
    public void checkCurrentRadioStation() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void checkMinRadioStation() {
        Radio radio = new Radio();

        assertEquals(0, radio.getMinCurrentRadioStation());
    }

    @Test
    public void checkMaxRadioStation() {
        Radio radio = new Radio();

        assertEquals(9, radio.getMaxCurrentRadioStation());
    }

    @Test
    public void clickNextRadioStation() {
        Radio radio = new Radio();

        assertEquals(1, radio.getNextRadioStation());
    }

    @Test
    public void clickPrevRadioStation() {
        Radio radio = new Radio();

        assertEquals(0, radio.getPrevRadioStation());
    }

    @Test
    public void checkCurrentVolume() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void checkMinCurrentVolume() {
        Radio radio = new Radio();

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void checkMaxCurrentVolume() {
        Radio radio = new Radio();

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void checkIncreaseVolume() {
        Radio radio = new Radio();

        assertEquals(1, radio.getIncreaseVolume());
    }

    @Test
    public void checkLowVolume() {
        Radio radio = new Radio();

        assertEquals(0, radio.getLowVolume());
    }

    //конструктор

    @Test
    public void constructorQuantityRadioStation() {
        Radio radio = new Radio(20, 19, 10, 0, 11, 10);

        assertEquals(20, radio.getQuantityRadioStation());
    }

    @Test
    public void constructorMaxCurrentRadioStation() {
        Radio radio = new Radio(20, 19, 10, 0, 11, 10);

        assertEquals(19, radio.getMaxCurrentRadioStation());
    }

    @Test
    public void constructorCurrentRadioStation() {
        Radio radio = new Radio(20, 19, 10, 0, 11, 10);

        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorMinCurrentRadioStation() {
        Radio radio = new Radio(20, 19, 10, 0, 11, 10);

        assertEquals(0, radio.getMinCurrentRadioStation());
    }

    @Test
    public void constructorNextRadioStation() {
        Radio radio = new Radio(20, 19, 10, 0, 11, 10);

        assertEquals(11, radio.getNextRadioStation());
    }

    @Test
    public void constructorPrevRadioStation() {
        Radio radio = new Radio(20, 19, 10, 0, 11, 10);

        assertEquals(10, radio.getPrevRadioStation());
    }

    @Test
    public void constructorCurrentVolume() {
        Radio radio = new Radio(50, 51, 50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void constructorIncreaseVolume() {
        Radio radio = new Radio(50, 51, 50);
        assertEquals(51, radio.getIncreaseVolume());
    }

    @Test
    public void constructorLowVolume() {
        Radio radio = new Radio(50, 51, 50);
        assertEquals(50, radio.getLowVolume());
    }
}
