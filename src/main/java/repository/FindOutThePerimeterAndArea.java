package repository;

import java.util.Scanner;
public class FindOutThePerimeterAndArea { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите длину прямоугольника>> ");
    double length = scanner.nextDouble();

    System.out.print("Введите ширину прямоугольника>> ");
    double width = scanner.nextDouble();

    double area = calculateArea(length, width);
    double perimeter = calculatePerimeter(length, width);

    System.out.println("Площадь прямоугольника>> " + area);
    System.out.println("Периметр прямоугольника>> " + perimeter);

    scanner.close();
}

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
