package repository;
public class HobbyRating {
    public static void main(String[] args) {
        String[] hobbies = {"спорт", "программирование", "шахматы"};

        int[] ratings = {8, 9, 7};

        System.out.println("Хобби и их рейтинги:");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i] + ": " + ratings[i]);
        }
    }
}

