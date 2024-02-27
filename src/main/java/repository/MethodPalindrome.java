package repository;

import java.util.Scanner;

public class MethodPalindrome {
    public static boolean isEven(int num ) {
        return num % 2 == 0;
    }
    public static boolean isGrade(int year ) {
        return year % 4 == 0;
    }
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < (length / 2 ); i++ ) {
            if (word.charAt(i)!=word.charAt(length - i - 1))return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово которое вы хотите проверить на палиндром>>");
        String word = scanner.nextLine().toLowerCase().trim();
        System.out.println(isPalindrome(word));
        scanner.close();


    }
}