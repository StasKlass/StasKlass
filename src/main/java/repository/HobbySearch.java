package repository;

public class HobbySearch {
    public static void main(String[] args) {

        String[] searchHobbies = {"спорт", "шахматы"};

        String[] hobbies = {"спорт", "программирование", "шахматы"};

        for (String hobby : searchHobbies) {
            boolean found = false;
            for (String h : hobbies) {
                if (h.equals(hobby)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Хобби '" + hobby + "' есть в списке.");
            } else {
                System.out.println("Хобби '" + hobby + "' отсутствует в списке.");
            }
        }
    }
}
