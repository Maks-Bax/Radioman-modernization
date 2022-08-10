package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void getCurrentStation() {
        Radio thisIs = new Radio(20);
        thisIs.setCurrentStation(15);
        int expected = 15;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(11);
        int expected = 0;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(9);
        int expected = 9;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation3() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(-1);
        int expected = 9;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(9);
        thisIs.next();
        int expected = 0;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(5);
        thisIs.next();
        int expected = 6;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(9);
        thisIs.next();
        int expected = 0;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(3);
        thisIs.prev();
        int expected = 2;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(0);
        thisIs.prev();
        int expected = 9;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(25);
        int expected = 25;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(100);
        int expected = 100;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume2() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(101);
        int expected = 100;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void forward() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(101);
        thisIs.plusOne();
        int expected = 100;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldForward() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(2);
        thisIs.plusOne();
        int expected = 3;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void back() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(2);
        thisIs.minusOne();
        int expected = 1;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBack() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(0);
        thisIs.minusOne();
        int expected = 0;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }
}