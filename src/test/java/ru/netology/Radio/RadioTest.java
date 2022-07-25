package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldLastFirstMaxMinStationVolume() {
        Radio thisIs = new Radio(5, 3, 30, 25);
        thisIs.setCurrentStation(6);
        thisIs.setCurrentVolume(55);
        thisIs.plusOne();
        assertEquals(4, 4);
    }

    @Test
    public void shouldNextStation() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(5);
        thisIs.next();
        assertEquals(6, thisIs.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(3);
        thisIs.prev();
        assertEquals(2, thisIs.getCurrentStation());
    }

    @Test
    public void shouldMaxStation() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(9);
        thisIs.next();
        assertEquals(0, thisIs.getCurrentStation());
    }

    @Test
    public void shouldMinStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(0);
        thisIs.prev();
        assertEquals(9, thisIs.getCurrentStation());
    }

    @Test
    public void shouldMindMinStation() {
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
    public void shouldFartherMaxStation() {
        Radio thisIs = new Radio(10);
        thisIs.setCurrentStation(8);
        thisIs.next();
        assertEquals(9, thisIs.getCurrentStation());
    }

    @Test
    public void shouldOneStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(1);
        thisIs.next();
        assertEquals(2, thisIs.getCurrentStation());
    }

    @Test
    public void shouldFartherOneStation() {
        Radio thisIs = new Radio();
        thisIs.setCurrentStation(1);
        thisIs.prev();
        assertEquals(0, thisIs.getCurrentStation());
    }

    //volume
    @Test
    public void shouldLogicMinVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(0);
        thisIs.plusOne();
        assertEquals(1, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicMaxVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(9);
        thisIs.plusOne();
        assertEquals(10, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogic1MaxVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(10);
        thisIs.plusOne();
        assertEquals(11, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicMindVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(5);
        thisIs.plusOne();
        assertEquals(6, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLastVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(101);
        thisIs.plusOne();
        assertEquals(100, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(-1);
        thisIs.minusOne();
        assertEquals(0, thisIs.getCurrentVolume());
    }

    @Test
    public void shouldLogicalMinVolume() {
        Radio thisIs = new Radio();
        thisIs.setCurrentVolume(1);
        thisIs.plusOne();
        assertEquals(2, thisIs.getCurrentVolume());
    }
}