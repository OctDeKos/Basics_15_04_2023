package org.example;

import java.util.Scanner;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создание объекта Scanner для чтения ввода пользователя
        double result = 0.0; // переменная для хранения текущего результата
        boolean isReset = true; // флаг, указывающий, была ли произведена операция сброса
        System.out.println("================================");
        System.out.println("= Старт программы 'Калькулятор'=");
        System.out.println("================================");

        while (true) { // бесконечный цикл, пока пользователь не завершит программу
            if (isReset) { // если не была произведена операция сброса, запрашиваем у пользователя первое число
                System.out.print("Введите число: ");
                result = scanner.nextDouble();
            } else { // если была произведена операция сброса, запрашиваем у пользователя следующее число
                isReset = false;
                System.out.print("Введите следующее число: ");
                result = scanner.nextDouble();
            }

            while (true) { // бесконечный цикл для возможности продолжить вычисления с большим количеством чисел
                System.out.print("Введите операцию (+, -, *, /, = или C для сброса): ");
                String operation = scanner.next(); // запрашиваем у пользователя операцию

                if (operation.equals("C")) { // если пользователь ввел "C", сбрасываем калькулятор
                    isReset = true;
                    result = 0.0;
                    System.out.println("Результат сброшен.");
                    break; // переходим к следующей итерации внешнего цикла
                }

                if (operation.equals("=")) { // если пользователь ввел "=", выводим текущий результат и переходим к следующей итерации внешнего цикла
                    System.out.println("Результат: " + result);
                    break;
                }

                System.out.print("Введите следующее число: ");
                double operand = scanner.nextDouble(); // запрашиваем у пользователя следующее число

                if (operation.equals("+")) { // если операция - сложение, выполняем соответствующую операцию
                    result += operand;
                } else if (operation.equals("-")) { // если операция - вычитание, выполняем соответствующую операцию
                    result -= operand;
                } else if (operation.equals("*")) { // если операция - умножение, выполняем соответствующую операцию
                    result *= operand;
                } else if (operation.equals("/")) { // если операция - деление, выполняем соответствующую операцию
                    if (operand == 0) { // проверяем, что делитель не равен нулю
                        System.out.println("Деление на ноль невозможно!");
                        continue; // переходим к следующей итерации внутреннего цикла
                    }
                    result /= operand;
                } else { // если пользователь ввел неподдерживаемую операцию, сообщаем об ошибке и переходим к следующей
                    System.out.println("Неподдерживаемая операция!");
                    continue;
                }
            }
        }
    }
}
