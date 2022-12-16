package ru.netology.domine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldGetCurrentStation() {
        int expected = 6;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
        void shouldCheckSumStations() {
            int summStations = 50;
            Radio radio = new Radio(summStations);
            int expected = 10;
            radio.setCurrentStation(10);
            assertEquals(expected, radio.getCurrentStation());
        }

    @Test
    void shouldCountStations() {
        int expected = 0;
        radio.setCurrentStation(10);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldNext() {
        int station = 8;
        int expected = 9;
        radio.setCurrentStation(station);
        radio.nextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldPrev() {
        int station = 2;
        int expected = 1;
        radio.setCurrentStation(station);
        radio.previousStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchDown() {
        int station = 9;
        int expected = 0;
        radio.setCurrentStation(station);
        radio.nextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchUp() {
        int station = 0;
        int expected = 9;
        radio.setCurrentStation(station);
        radio.previousStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSwitch() {
        int station = -1;
        int expected = 0;
        radio.setCurrentStation(station);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldPlusVolume() {
        int volume = 86;
        int expected = 87;
        radio.setCurrentVolume(volume);
        radio.volumeUp();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldMinusVolume() {
        int volume = 25;
        int expected = 24;
        radio.setCurrentVolume(volume);
        radio.volumeDown();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUp() {
        int volume = 100;
        int expected = 100;
        radio.setCurrentVolume(volume);
        radio.volumeUp();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        int volume = 0;
        int expected = 0;
        radio.setCurrentVolume(volume);
        radio.volumeDown();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDownTwo() {
        int volume = -1;
        int expected = 0;
        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeTree() {
        int volume = 101;
        int expected = 0;
        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }
}