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
    public void shouldQuantityRadioStation() {
        radio.setQuantityRadioStation(5);
        assertEquals(5, radio.getQuantityRadioStation());
    }

    @Test
    public void shouldMaxQuantityRadioStation() {
        radio.setQuantityRadioStation(10);
        assertEquals(10, radio.getQuantityRadioStation());
    }

    @Test
    public void shouldMinQuantityRadioStation() {
        radio.setQuantityRadioStation(1);
        assertEquals(1, radio.getQuantityRadioStation());
    }

    @Test
    public void shouldLessMinQuantityRadioStation() {
        radio.setQuantityRadioStation(0);
        assertEquals(10, radio.getQuantityRadioStation());
    }

    @Test
    public void shouldMoreMaxQuantityRadioStation() {
        radio.setQuantityRadioStation(11);
        assertEquals(10, radio.getQuantityRadioStation());
    }


    @Test
    public void shouldCurrentRadioStation() {
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldMinCurrentRadioStation() {
        radio.setMinRadioStation(0);
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldMaxCurrentRadioStation() {
        radio.calculateMaxRadioStation(10);
        assertEquals(9, radio.getMaxRadioStation());
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
        radio.calculateNextRadioStation(5);
        assertEquals(6, radio.getNextRadioStation());
    }

    @Test
    public void checkMaxNextCurrentRadioStation() {
        radio.calculateNextRadioStation(9);
        assertEquals(0, radio.getNextRadioStation());
    }

    @Test
    public void checkMoreMaxNextCurrentRadioStation() {
        radio.calculateNextRadioStation(10);
        assertEquals(0, radio.getNextRadioStation());
    }

    @Test
    public void checkMinNextCurrentRadioStation() {
        radio.calculateNextRadioStation(0);
        assertEquals(1, radio.getNextRadioStation());
    }

    @Test
    public void checkLessMinNextCurrentRadioStation() {
        radio.calculateNextRadioStation(-1);
        assertEquals(0, radio.getNextRadioStation());
    }

    @Test
    public void checkPrevCurrentRadioStation() {
        radio.calculatePrevRadioStation(4);
        assertEquals(3, radio.getPrevRadioStation());
    }

    @Test
    public void checkMaxPrevCurrentRadioStation() {
        radio.calculatePrevRadioStation(9);
        assertEquals(8, radio.getPrevRadioStation());
    }

    @Test
    public void checkMoreMaxPrevCurrentRadioStation() {
        radio.calculatePrevRadioStation(10);
        assertEquals(9, radio.getPrevRadioStation());
    }

    @Test
    public void checkMinPrevCurrentRadioStation() {
        radio.calculatePrevRadioStation(0);
        assertEquals(9, radio.getPrevRadioStation());
    }

    @Test
    public void checkLessMinPrevCurrentRadioStation() {
        radio.calculatePrevRadioStation(-1);
        assertEquals(9, radio.getPrevRadioStation());
    }

    @Test
    public void checkCurrentVolume() {
        radio.setCurrentVolume(20);
        assertEquals(20, radio.getCurrentVolume());
    }

    @Test
    public void checkMinCurrentVolume() {
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void checkMaxCurrentVolume() {
        radio.setMaxVolume(100);
        assertEquals(100, radio.getMaxVolume());
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
        radio.calculateIncreaseVolume(0);
        assertEquals(1, radio.getIncreaseVolume());
    }

    @Test
    public void checkLessMinIncreaseVolume() {
        radio.calculateIncreaseVolume(-1);
        assertEquals(0, radio.getIncreaseVolume());
    }

    @Test
    public void checkMaxIncreaseVolume() {
        radio.calculateIncreaseVolume(100);
        assertEquals(100, radio.getIncreaseVolume());
    }

    @Test
    public void checkMoreMaxIncreaseVolume() {
        radio.calculateIncreaseVolume(101);
        assertEquals(100, radio.getIncreaseVolume());
    }

    @Test
    public void checkLowVolume() {
        radio.calculateLowVolume(60);
        assertEquals(59, radio.getLowVolume());
    }

    @Test
    public void checkMinLowVolume() {
        radio.calculateLowVolume(0);
        assertEquals(0, radio.getLowVolume());
    }

    @Test
    public void checkLessMinLowVolume() {
        radio.calculateLowVolume(-1);
        assertEquals(0, radio.getLowVolume());
    }

    @Test
    public void checkMaxLowVolume() {
        radio.calculateLowVolume(100);
        assertEquals(99, radio.getLowVolume());
    }

    @Test
    public void checkMoreMaxLowVolume() {
        radio.calculateLowVolume(101);
        assertEquals(100, radio.getLowVolume());
    }

    @Test
    public void checkQuantityRadioStationConstructor() {
        Radio radio1 = new Radio(50);
        assertEquals(50, radio1.getQuantityRadioStation());
    }
}




