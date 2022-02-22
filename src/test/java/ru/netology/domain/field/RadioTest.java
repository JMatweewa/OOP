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
    public void shouldInitMaxRadioStation() {
        assertEquals(9, radio.getMaxRadioStation());
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
    public void shouldCurrentRadioStation() {
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldMinCurrentRadioStation() {
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldMaxCurrentRadioStation() {
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouLessMinCurrentRadioStation() {
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldMoreMaxCurrentRadioStation() {
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void checkNextCurrentRadioStation() {
        radio.calculateNextRadioStation(4);
        assertEquals(5, radio.getNextRadioStation());
    }

    @Test
    public void checkMaxNextCurrentRadioStation() {
        radio.setNextRadioStation(9);
        assertEquals(0, radio.getNextRadioStation());
    }

    @Test
    public void checkMinNextCurrentRadioStation() {
        radio.setNextRadioStation(0);
        assertEquals(1, radio.getNextRadioStation());
    }

    @Test
    public void checkPrevCurrentRadioStation() {
        radio.calculatePrevRadioStation(4);
        assertEquals(3, radio.getPrevRadioStation());
    }

    @Test
    public void checkMaxPrevCurrentRadioStation() {
        radio.setPrevRadioStation(9);
        assertEquals(8, radio.getPrevRadioStation());
    }

    @Test
    public void checkMinPrevCurrentRadioStation() {
        radio.setPrevRadioStation(0);
        assertEquals(9, radio.getPrevRadioStation());
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
        radio.calculateIncreaseVolume(4);
        assertEquals(5, radio.getIncreaseVolume());
    }

    @Test
    public void checkMinIncreaseVolume() {
        radio.setIncreaseVolume(0);
        assertEquals(1, radio.getIncreaseVolume());
    }

    @Test
    public void checkMaxIncreaseVolume() {
        radio.setIncreaseVolume(100);
        assertEquals(100, radio.getIncreaseVolume());
    }

    @Test
    public void checkLowVolume() {
        radio.calculateLowVolume(60);
        assertEquals(59, radio.getLowVolume());
    }

    @Test
    public void checkMinLowVolume() {
        radio.setLowVolume(0);
        assertEquals(0, radio.getLowVolume());
    }

    @Test
    public void checkMaxLowVolume() {
        radio.setLowVolume(100);
        assertEquals(99, radio.getLowVolume());
    }

    @Test
    public void checkQuantityRadioStationConstructor() {
        Radio radio1 = new Radio(50, 49, 25, 60);
        assertEquals(50, radio1.getQuantityRadioStation());
    }

    @Test
    public void checkMaxRadioStationConstructor() {
        Radio radio1 = new Radio(50, 49, 25, 60);
        assertEquals(49, radio1.getMaxRadioStation());
    }

    @Test
    public void checkCurrentRadioStationConstructor() {
        Radio radio1 = new Radio(50, 49, 25, 60);
        assertEquals(25, radio1.getCurrentRadioStation());
    }

    @Test
    public void checkVolumeConstructor() {
        Radio radio1 = new Radio(50, 49, 25, 60);
        assertEquals(60, radio1.getCurrentVolume());
    }

}




