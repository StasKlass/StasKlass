package repository;

import java.util.Scanner;

public class AutoInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку автомобиля>>");
        String brand = scanner.nextLine().trim().toLowerCase();

        System.out.println("Введите год выпуска автомобиля>>");
        int year;
        try {
            year = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Год выпуска должен быть числом. Перезапустите программу и попробуйте снова.");
            return;
        }

        switch (brand) {
            case "ford":
                System.out.println("Ford - американская марка автомобилей.");
                if (year < 2000) {
                    System.out.println("В 90-х популярными были модели как Mustang.");
                } else {
                    System.out.println("В новом тысячелетии на пике популярности Focus и Fusion.");
                }
                break;
            case "toyota":
                System.out.println("Toyota - японская марка автомобилей.");
                if (year < 2000) {
                    System.out.println("Королла и Камри были на пике в 90-х.");
                } else {
                    System.out.println("После 2000 года RAV4 и Prius завоевали популярность.");
                }
                break;
            case "lada":
                System.out.println("Lada (ВАЗ) - российская марка автомобилей.");
                if (year < 2000) {
                    System.out.println("Классические модели ВАЗ-2107 и Нива были очень популярны.");
                } else {
                    System.out.println("После 2000 года начались продажи моделей Lada Vesta и XRay.");
                }
                break;

            default:
                System.out.println("Информация о данной марке автомобилей отсутствует или марка введена некорректно.");
                break;
        }
    }
}
