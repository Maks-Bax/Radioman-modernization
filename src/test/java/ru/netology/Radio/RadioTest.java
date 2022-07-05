package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void getCurrentStation() {
        Radio thisIs = new Radio(30);
        thisIs.setCurrentStation(5);
        assertEquals(5, thisIs.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(-1);
        assertEquals(10, thisIs.getCurrentStation());
    }

    @Test
    public void setCurrentStation() {
        Radio thisIs = new Radio(30);
        thisIs.setCurrentStation(31);
        assertEquals(30, thisIs.getCurrentStation());
    }

    @Test
    public void setCurrentStation3() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(9);
        assertEquals(9, thisIs.getCurrentStation());
    }

    @Test
    public void next() {
        Radio thisIs = new Radio(11);
        thisIs.setCurrentStation(12);
        thisIs.next();
        assertEquals(12, thisIs.getCurrentStation());
    }

    @Test
    public void prev() {
        Radio thisIs = new Radio(12);
        thisIs.setCurrentStation(15);
        thisIs.prev();
        assertEquals(15, thisIs.getCurrentStation());
    }

    //  громкость
    @Test
    public void getCurrentVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(6);
        assertEquals(6, thisIs.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(101);
        assertEquals(100, thisIs.getCurrentVolume());
    }


    @Test
    public void more() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(15);
        thisIs.more();
        assertEquals(15, thisIs.getCurrentVolume());
    }


    @Test
    public void less() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(-1);
        thisIs.less();
        assertEquals(0, thisIs.getCurrentVolume());
    }

    @Test
    public void lessN() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(85);
        thisIs.less();
        assertEquals(85, thisIs.getCurrentVolume());
    }
}