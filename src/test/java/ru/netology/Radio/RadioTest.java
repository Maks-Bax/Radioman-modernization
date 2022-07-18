package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldTurnNextStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(5);
        thisIs.next();
        assertEquals(6, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnPrevStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(3);
        thisIs.prev();
        assertEquals(2, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnMaxStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(9);
        thisIs.next();
        assertEquals(0, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnMinStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(0);
        thisIs.prev();
        assertEquals(9, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnAfterMinStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(0);
        thisIs.next();
        assertEquals(1, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnPrevMaxStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(9);
        thisIs.prev();
        assertEquals(8, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnBeforeMaxStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(8);
        thisIs.next();
        assertEquals(9, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnAfterOneStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(1);
        thisIs.next();
        assertEquals(2, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnBeforeOneStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(1);
        thisIs.prev();
        assertEquals(0, thisIs.getCurrentStation());
    }

    @Test
    public void shouldCountMinVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(0);
        thisIs.plusOne();
        assertEquals(1, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldCountBeforeMaxVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(9);
        thisIs.plusOne();
        assertEquals(10, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldCountMaxVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(10);
        thisIs.plusOne();
        assertEquals(11, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldCountMiddleVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(5);
        thisIs.plusOne();
        assertEquals(6, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldCountOverVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(101);
        thisIs.plusOne();
        assertEquals(100, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldCountMinusVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(-1);
        thisIs.minusOne();
        assertEquals(0, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldCountAfterMinVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(1);
        thisIs.plusOne();
        assertEquals(2, thisIs.getCurrentVolume());
    }
}