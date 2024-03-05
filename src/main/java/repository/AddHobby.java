package repository;

import java.util.Arrays;
import java.util.Scanner;
public class AddHobby {
    public static void main(String[] args) {
        String[] hobbies = {"cпорт", "программирование", "шахматы"};

        hobbies = addHobby(hobbies, "путешествия");

        System.out.println(Arrays.toString(hobbies));
    }

    public static String[] addHobby(String[] array, String newHobby) {
        String[] newArray = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = newHobby;

        return newArray;
    }
}
