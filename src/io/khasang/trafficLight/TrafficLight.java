package io.khasang.trafficLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TrafficLight {
    private String resultColor;

    void startTrafficLight() {
        System.out.print("Введите минуты: ");
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            try {
                double inputMinute = Double.parseDouble(consoleReader.readLine());
                resultTrafficLight(inputMinute);
            } catch (IllegalArgumentException e) {
                System.out.println("Что-то было не верно введено.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void resultTrafficLight(double minute) {
        double minuteRemainder = minute % 10;
        resultColor = trafficLightColor(minuteRemainder);
    }

    private String trafficLightColor(double minuteRemainder) {
        if (minuteRemainder <= 2 && minuteRemainder >= 0) {
            return "Зеленый";
        } else if (minuteRemainder <= 5 && minuteRemainder >= 0) {
            return "Желтый";
        } else if (minuteRemainder <= 10 && minuteRemainder >= 0) {
            return "Красный";
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return resultColor;
    }
}