package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void CheckCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void ClickNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ClickPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(5);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void CheckCurrentVolume() {
       Radio radio = new Radio();

       radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();

       assertEquals(expected, actual);
    }

    @Test
    public void CheckIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(15);
        int expected = 10;
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
}