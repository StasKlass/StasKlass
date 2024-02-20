package repository;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            int randomNumber = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            int guess;

            System.out.println("Угадайте число от 1 до 100.");

            do {
                System.out.print("Введите ваше предположение: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ошибка: Введите число!");
                    scanner.next();
                }
                guess = scanner.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("Слишком большое!");
                } else if (guess < randomNumber) {
                    System.out.println("Слишком маленькое!");
                } else {
                    System.out.println("Поздравляем! Вы угадали число " + randomNumber + " за " + attempts + " попыток.");
                }
            } while (guess != randomNumber);

            System.out.print("Хотите сыграть еще раз? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Спасибо за игру!");
        scanner.close();
    }
}
