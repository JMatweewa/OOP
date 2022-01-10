package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void CheckCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMoreMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckLessMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void ClickNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(6);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickMaxNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickMinNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(0);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickMoreMaxNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickLessMinNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void ClickPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(6);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickMinPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(0);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickMaxPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(9);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickLessMinPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(-1);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickMoreMaxPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMinCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMaxCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMoreMaxCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckLessMinCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void CheckIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(7);
        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMinIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(0);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMaxIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMoreMaxIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckLessMinIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void CheckLowVolume() {
        Radio radio = new Radio();

        radio.setLowVolume(7);
        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMinLowVolume() {
        Radio radio = new Radio();

        radio.setLowVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMaxLowVolume() {
        Radio radio = new Radio();

        radio.setLowVolume(10);
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckLessMinLowVolume() {
        Radio radio = new Radio();

        radio.setLowVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckMoreMaxLowVolume() {
        Radio radio = new Radio();

        radio.setLowVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}