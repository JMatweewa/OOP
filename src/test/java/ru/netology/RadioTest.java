package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void checkCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMoreMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void checkLessMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void clickNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.setNextRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void clickMaxNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.setNextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void clickMinNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.setNextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void clickPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.setPrevRadioStation();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void clickMinPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.setPrevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void clickMaxPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.setPrevRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void checkCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMinCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMaxCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMoreMaxCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkLessMinCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.setIncreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMinIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setIncreaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMaxIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setIncreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.setLowVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMinLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setLowVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void checkMaxLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setLowVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}