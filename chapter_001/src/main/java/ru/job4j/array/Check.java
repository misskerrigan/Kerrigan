package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] != data[0]) {
                result = false;
            }
        }
        return result;
    }
}