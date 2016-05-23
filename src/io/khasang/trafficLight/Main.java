package io.khasang.trafficLight;

/**
 * Программа считает цвет светофора в зависимости от количества прошедших минут.
 *
 * Условие:
 * Написать светофор с ООП.
 * Первые две минуты горит зеленый свет,
 * потом три минуты желтый,
 * пять минут красный.
 */

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.startTrafficLight();
        System.out.println(trafficLight.toString());
    }
}