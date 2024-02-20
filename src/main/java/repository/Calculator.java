package repository;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Выберите операцию: ");
            System.out.println("1. Сложение (+)");
            System.out.println("2. Вычитание (-)");
            System.out.println("3. Умножение (*)");
            System.out.println("4. Деление (/)");
            System.out.print("Ваш выбор: ");
            choice = scanner.next().charAt(0);

            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case '1':
                    System.out.println("Результат: " + (num1 + num2));
                    break;
                case '2':
                    System.out.println("Результат: " + (num1 - num2));
                    break;
                case '3':
                    System.out.println("Результат: " + (num1 * num2));
                    break;
                case '4':
                    if (num2 != 0) {
                        System.out.println("Результат: " + (num1 / num2));
                    } else {
                        System.out.println("Ошибка: Деление на ноль!");
                    }
                    break;
                default:
                    System.out.println("Неверный выбор операции.");
            }

            System.out.print("Хотите продолжить? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Программа завершена.");
        scanner.close();
    }
}
