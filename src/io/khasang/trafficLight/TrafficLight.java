package io.khasang.trafficLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс принимает введенные в консоли минуты, и в соответствии с условием
 * выводит требующийся цвет в зависимости от введенной минуты.
 */

class TrafficLight {
    private String resultColor;

    /**
     * Метод считывает введенные минуты с консоли.
     * Так же обрабатывает исключения не верно введенной информации в консоль.
     */
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

    /**
     * Метод принимает на вход введенные минуты, и передает остаток от деления
     * на 10 в метод trafficLightColor.
     */
    private void resultTrafficLight(double minute) {
        double minuteRemainder = minute % 10;
        resultColor = trafficLightColor(minuteRemainder);
    }

    /**
     * Метод принимает на вход остаток от деления введенных пользователем минут на 10,
     * считает цвет который должен показать светофор в соответствии с введенными минутами
     * и возвращает строку с требующимся цветом.
     */
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

    /**
     * Метод toString переопределен для корректного вывода цвета светофора в консоль.
     */
    @Override
    public String toString() {
        return resultColor;
    }
}