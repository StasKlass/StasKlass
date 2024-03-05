package repository;

import java.util.Scanner;

public class FavoriteHobby {
    public static void main(String[] args) {
        String[] hobbies = {"спорт", "программирование", "шахматы"};

        System.out.println("Два хобби");

        System.out.println("Введите номер вашего любимого хобби из списка>>");

        for (int i = 0; i < hobbies.length; i++) {
            System.out.println((i + 1) + ". " + hobbies[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= hobbies.length) {
            System.out.println("Ваше любимое хобби>> " + hobbies[choice - 1]);
        } else {
            System.out.println("Некорректный ввод.");
        }
    }
}
