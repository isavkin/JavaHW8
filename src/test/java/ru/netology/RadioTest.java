package ru.netology;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

        @Test
        public void shouldNextRadioStation() { //включение следующей станции
            Radio radio = new Radio();
            radio.setCurrentNumber(1);
            radio.next();
            int expected = 2;
            int actual = radio.getCurrentNumber();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPrevStation() { //включение предыдущей станции
            Radio radio = new Radio();
            radio.setCurrentNumber(5);
            radio.prev();
            int expected = 4;
            int actual = radio.getCurrentNumber();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldResetStation() { // возврат на первоначальную станцию
            Radio radio = new Radio();
            radio.setCurrentNumber(9);
            radio.next();
            int expected = 0;
            int actual = radio.getCurrentNumber();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSwitchToLastStation() { // переключение на последнюю станцию
            Radio radio = new Radio();
            radio.setCurrentNumber(0);
            radio.prev();
            int expected = 9;
            int actual = radio.getCurrentNumber();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSwitchStartingStation() { //переключение на начальную станцию
            Radio radio = new Radio();
            radio.setCurrentNumber(10);
            int expected = 0;
            int actual = radio.getCurrentNumber();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPrintNumberEqualZeroStation() {  //должен вернуть станцию равную 0
            Radio radio = new Radio();
            radio.setCurrentNumber(-1);
            int expected = 0;
            int actual = radio.getCurrentNumber();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldAddVolumeUp() { //прибавление громкости
            Radio radio = new Radio();
            radio.setSoundVolume(80);
            radio.volumeUp();
            int expected = 81;
            int actual = radio.getSoundVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldVolumeDown() {   //уменьшение громкости;
            Radio radio = new Radio();
            radio.setSoundVolume(30);
            radio.volumeDown();
            int expected = 29;
            int actual = radio.getSoundVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotAddSound() { //громкость с максимума не изменяется
            Radio radio = new Radio();
            radio.setSoundVolume(100);
            radio.volumeUp();
            int expected = 100;
            int actual = radio.getSoundVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotChangeSound() {    //громкость с минимума не меняется
            Radio radio = new Radio();
            radio.setSoundVolume(0);
            radio.volumeDown();
            int expected = 0;
            int actual = radio.getSoundVolume();

            Assertions.assertEquals(expected, actual);
        }
}
