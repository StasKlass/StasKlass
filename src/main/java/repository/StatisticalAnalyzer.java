package repository;

public class StatisticalAnalyzer{

    public static void statistics(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("Нет данных для анализа.");
            return;
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        for (double num : numbers) {
            if (num < 0) {
                throw new IllegalArgumentException("Отрицательные числа не допускаются");
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = sum / numbers.length;

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }

    public static void main(String[] args) {
        try {
            statistics(1.5, 2.7, 3.9, 4.1, 5.3);
            statistics(10.0, 20.0, 30.0);
            statistics(2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0);
            statistics(3.0, 5.0, 7.0);
            statistics(3.0, -5.0, 7.0);
            statistics();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
