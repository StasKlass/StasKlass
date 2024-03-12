package repository;

public class CreatingASummationFunction {

    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            if (num < 0) {
                throw new IllegalArgumentException("Отрицательные числа не допускаются");
            }
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Сумма чисел: " + sum(1, 2, 3, 4, 5));
            System.out.println("Сумма чисел: " + sum(10, 20, 30));
            System.out.println("Сумма чисел: " + sum(2, 4, 6, 8, 10, 12, 14));
            System.out.println("Сумма чисел: " + sum(3, 5, 7));
            System.out.println("Сумма чисел: " + sum(3, -5, 7));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
