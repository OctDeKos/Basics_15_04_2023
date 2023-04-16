package org.example;
/*
public class Main {
    public static void main(String[] args) {

        Car car = new Car(); //1 - объект этого класса. 2 - любое имя которое мы даем. 3 - создаем сам объект на основании чертежа
        car.build(); //вызываем метод по новому имени

        Car newCar = new Car();
        newCar.build();

    }
}
*/

/**
 * Main class of the Java program.
 */
public class Main {

    public static void main(String[] args) {
        int value = add(3, 4);
        int result = add(value, 10);
        System.out.println(result);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}


