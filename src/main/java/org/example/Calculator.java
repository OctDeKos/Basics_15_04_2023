package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание объекта Scanner для чтения ввода пользователя
        double result = 0.0; // переменная для хранения текущего результата
        boolean isReset = false; // флаг, указывающий, была ли произведена операция сброса

        while (true) { // бесконечный цикл, пока пользователь не завершит программу
            if (!isReset) { // если не была произведена операция сброса, запрашиваем у пользователя первое число
                System.out.print("Введите первое число: ");
                result = scanner.nextDouble();
            }
            System.out.print("Введите операцию (+, -, *, / или C для сброса): ");
            String operation = scanner.next(); // запрашиваем у пользователя операцию

            if (operation.equals("C")) { // если пользователь ввел "C", сбрасываем калькулятор
                isReset = true;
                result = 0.0;
                System.out.println("Результат сброшен.");
                continue; // переходим к следующей итерации цикла
            }

            System.out.print("Введите второе число: ");
            double operand = scanner.nextDouble(); // запрашиваем у пользователя второе число

            if (operation.equals("+")) { // если операция - сложение, выполняем соответствующую операцию
                result += operand;
            } else if (operation.equals("-")) { // если операция - вычитание, выполняем соответствующую операцию
                result -= operand;
            } else if (operation.equals("*")) { // если операция - умножение, выполняем соответствующую операцию
                result *= operand;
            } else if (operation.equals("/")) { // если операция - деление, выполняем соответствующую операцию
                if (operand == 0) { // проверяем, что делитель не равен нулю
                    System.out.println("Деление на ноль невозможно!");
                    continue; // переходим к следующей итерации цикла
                }
                result /= operand;
            } else { // если пользователь ввел неподдерживаемую операцию, сообщаем об ошибке и переходим к следующей итерации цикла
                System.out.println("Неподдерживаемая операция!");
                continue;
            }

            System.out.println("Результат: " + result); // выводим текущий результат
            isReset = false; // сбрасываем флаг операции сброса
        }
    }
}
