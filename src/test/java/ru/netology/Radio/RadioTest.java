package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    // переключение каналов
    @Test
    public void getCurrentStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(5);
        int expected = 5;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(10);
        int expected = 0;
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
    public void next() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(6);
        thisIs.next();
        int expected = 6;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(3);
        thisIs.prev();
        int expected = 3;
        int actual = thisIs.getCurrentStation();
        assertEquals(expected, actual);
    }

    // уровень громкости
    @Test
    public void getCurrentVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(6);
        int expected = 6;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(10);
        int expected = 10;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void more() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(15);
        thisIs.more();
        int expected = 10;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void less() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(1);
        thisIs.less();
        int expected = 1;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lessN() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(0);
        thisIs.less();
        int expected = 0;
        int actual = thisIs.getCurrentVolume();
        assertEquals(expected, actual);
    }
}