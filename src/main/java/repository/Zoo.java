package repository;

public class Zoo {

    public static void main(String[] args) {
        String[] animalSpecies = {"Лев", "Слон", "Обезьяна"};
        String[] animalSounds = {"Рррр", "Трууу", "Уа-уа"};

        printAnimalSounds(animalSpecies, animalSounds);

        String animalName = "Слон";
        findAnimalSound(animalName, animalSpecies, animalSounds);
    }

    public static void printAnimalSounds(String[] animalSpecies, String[] animalSounds) {
        System.out.println("Информация о животных в зоопарке:");
        for (int i = 0; i < animalSpecies.length; i++) {
            System.out.println(animalSpecies[i] + ": " + animalSounds[i]);
        }
    }

    public static void findAnimalSound(String animalName, String[] animalSpecies, String[] animalSounds) {
        boolean found = false;
        for (int i = 0; i < animalSpecies.length; i++) {
            if (animalSpecies[i].equals(animalName)) {
                System.out.println("Звук животного " + animalName + ": " + animalSounds[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Животное с названием " + animalName + " не найдено в зоопарке.");
        }
    }
}
