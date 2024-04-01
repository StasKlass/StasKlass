package repository;

import java.util.HashSet;

public class ComparisonOfPropertySets {
    public static HashSet<property> compareSets(HashSet<property> set1, HashSet<property> set2) {
        HashSet<property> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

    public static void main(String[] args) {
        HashSet<property> set1 = new HashSet<>();
        set1.add(new property(" 123 Main St", " Квартира"));
        set1.add(new property(" 456 Elm St", " Дом"));
        set1.add(new property(" 789 Oak St", " Коммерческая недвижимость"));

        HashSet<property> set2 = new HashSet<>();
        set2.add(new property(" 123 Main St", " Квартира"));
        set2.add(new property(" 456 Elm St", " Дом"));

        // Сравнение наборов и вывод результата
        HashSet<property> differenceSet = compareSets(set1, set2);
        System.out.println("Объекты недвижимости, присутствующие в первом наборе, но отсутствующие во втором:");
        for (ComparisonOfPropertySets.property property : differenceSet) {
            System.out.println(property);
        }
    }

    static class property {
        String address;
        String type;

        public property(String address, String type) {
            this.address = address;
            this.type = type;
        }

        public int hashCode() {
            return address.hashCode() + type.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            property property = (ComparisonOfPropertySets.property) obj;
            return address.equals(property.address) && type.equals(property.type);
        }

        public String toString() {
            return "Property{" +
                    "address='" + address + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
