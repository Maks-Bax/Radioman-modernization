package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio thisIs = new Radio();

    @Test
    public void shouldTotalStation() {
        Radio thisIs = new Radio(5);
        assertEquals(5, 5);
    }

    @Test
    public void shouldNextStation() {
        thisIs.next();
        assertEquals(1, thisIs.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        thisIs.setCurrentStation(3);
        thisIs.prev();
        assertEquals(2, thisIs.getCurrentStation());
    }

    @Test
    public void shouldMaxStation() {
        thisIs.setCurrentStation(9);
        thisIs.next();
        assertEquals(0, thisIs.getCurrentStation());
    }

    //
    @Test
    public void shouldMinStation() {
        thisIs.setCurrentStation(0);
        thisIs.prev();
        assertEquals(9, thisIs.getCurrentStation());
    }

    @Test
    public void shouldMindMinStation() {
        thisIs.setCurrentStation(0);
        thisIs.next();
        assertEquals(1, thisIs.getCurrentStation());
    }

    @Test
    public void shouldTurnPrevMaxStation() {
        thisIs.setCurrentStation(9);
        thisIs.prev();
        assertEquals(8, thisIs.getCurrentStation());
    }

    @Test
    public void shouldFartherMaxStation() {
        thisIs.setCurrentStation(8);
        thisIs.next();
        assertEquals(9, thisIs.getCurrentStation());
    }

    @Test
    public void shouldOneStation() {
        thisIs.setCurrentStation(1);
        thisIs.next();
        assertEquals(2, thisIs.getCurrentStation());
    }

    @Test
    public void shouldFartherOneStation() {
        thisIs.setCurrentStation(1);
        thisIs.prev();
        assertEquals(0, thisIs.getCurrentStation());
    }

    //volume
    @Test
    public void shouldLogicMinVolume() {
        thisIs.setCurrentVolume(0);
        thisIs.plusOne();
        assertEquals(1, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicMaxVolume() {
        thisIs.setCurrentVolume(9);
        thisIs.plusOne();
        assertEquals(10, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogic1MaxVolume() {
        thisIs.setCurrentVolume(10);
        thisIs.plusOne();
        assertEquals(11, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicMindVolume() {
        thisIs.setCurrentVolume(5);
        thisIs.plusOne();
        assertEquals(6, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLastVolume() {
        thisIs.setCurrentVolume(101);
        thisIs.plusOne();
        assertEquals(100, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicVolume() {
        thisIs.setCurrentVolume(-1);
        thisIs.minusOne();
        assertEquals(0, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicalMinVolume() {
        thisIs.setCurrentVolume(1);
        thisIs.plusOne();
        assertEquals(2, thisIs.getCurrentVolume());
    }
}