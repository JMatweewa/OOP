package ru.netology.domain.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldInitQuantityRadioStation() {
        assertEquals(10, radio.getQuantityRadioStation());
    }

    @Test
    public void shouldInitCurrentRadioStation() {
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldInitMinRadioStation() {
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldInitCurrentVolume() {
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldInitMinVolume() {
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldInitMaxVolume() {
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldQuantityRadioStation() {
        radio.setQuantityRadioStation(5);

        assertEquals(5, radio.getQuantityRadioStation());
    }

    @Test
    public void shouldCurrentRadioStation() {
        Radio radio1 = new Radio(20);
        radio1.setCurrentRadioStation(15);

        assertEquals(15, radio1.getCurrentRadioStation());
    }

    @Test
    public void shouldMinCurrentRadioStation() {
        Radio radio2 = new Radio(15);
        radio2.setCurrentRadioStation(0);

        assertEquals(0, radio2.getCurrentRadioStation());
    }

    @Test
    public void shouldMaxCurrentRadioStation() {
        Radio radio3 = new Radio(20);
        radio3.setCurrentRadioStation(19);

        assertEquals(19, radio3.getCurrentRadioStation());
    }

    @Test
    public void shouldLessMinCurrentRadioStation() {
        radio.setCurrentRadioStation(-1);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldMoreMaxCurrentRadioStation() {
        Radio radio4 = new Radio(30);
        radio4.setCurrentRadioStation(30);

        assertEquals(0, radio4.getCurrentRadioStation());
    }

    @Test
    public void checkNextCurrentRadioStation() {
        radio.setCurrentRadioStation(5);

        assertEquals(6, radio.calculateNextRadioStation());
    }

    @Test
    public void checkMaxNextCurrentRadioStation() {
        Radio radio5 = new Radio(30);
        radio5.setCurrentRadioStation(29);

        assertEquals(0, radio5.calculateNextRadioStation());
    }

    @Test
    public void checkMinNextCurrentRadioStation() {
        Radio radio6 = new Radio(40);
        radio6.setCurrentRadioStation(0);

        assertEquals(1, radio6.calculateNextRadioStation());
    }

    @Test
    public void checkPrevCurrentRadioStation() {
        Radio radio7 = new Radio(50);
        radio7.setCurrentRadioStation(30);

        assertEquals(29, radio7.calculatePrevRadioStation());
    }

    @Test
    public void checkMaxPrevCurrentRadioStation() {
        Radio radio8 = new Radio(40);
        radio8.setCurrentRadioStation(39);

        assertEquals(38, radio8.calculatePrevRadioStation());
    }

    @Test
    public void checkMinPrevCurrentRadioStation() {
        Radio radio9 = new Radio(60);
        radio9.setCurrentRadioStation(0);

        assertEquals(59, radio9.calculatePrevRadioStation());
    }

    @Test
    public void checkCurrentVolume() {
        radio.setCurrentVolume(20);

        assertEquals(20, radio.getCurrentVolume());
    }

    @Test
    public void checkMinCurrentVolume() {
        radio.setCurrentVolume(0);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void checkMaxCurrentVolume() {
        radio.setCurrentVolume(100);

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void checkLessMinCurrentVolume() {
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void checkMoreMaxCurrentVolume() {
        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void checkIncreaseVolume() {
        radio.setCurrentVolume(63);

        assertEquals(64, radio.calculateIncreaseVolume());
    }

    @Test
    public void checkMinIncreaseVolume() {
        radio.setCurrentVolume(0);

        assertEquals(1, radio.calculateIncreaseVolume());
    }

    @Test
    public void checkMaxIncreaseVolume() {
        radio.setCurrentVolume(100);

        assertEquals(100, radio.calculateIncreaseVolume());
    }

    @Test
    public void checkLowVolume() {
        radio.setCurrentVolume(63);

        assertEquals(62, radio.calculateLowVolume());
    }

    @Test
    public void checkMinLowVolume() {
        radio.setCurrentVolume(0);

        assertEquals(0, radio.calculateLowVolume());
    }

    @Test
    public void checkMaxLowVolume() {
        radio.setCurrentVolume(100);

        assertEquals(99, radio.calculateLowVolume());
    }

    @Test
    public void checkQuantityRadioStationConstructor() {
        Radio radio1 = new Radio(50);

        assertEquals(50, radio1.getQuantityRadioStation());
    }
}




