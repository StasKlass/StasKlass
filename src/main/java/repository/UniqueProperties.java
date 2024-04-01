package repository;

import java.util.HashSet;

class property {
    String address;
    String type;

    public property(String address, String type) {
        this.address = address;
        this.type = type;
    }

    // Переопределение методов hashCode и equals для обеспечения уникальности объектов Property
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + address.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        property property = (repository.property) obj;
        return address.equals(property.address) && type.equals(property.type);
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

public class UniqueProperties {
    public static void main(String[] args) {
        HashSet<property> propertySet = new HashSet<>();

        // Добавление объектов недвижимости, включая дубликаты
        propertySet.add(new property("123 Main St", "Квартира"));
        propertySet.add(new property("456 Elm St", "Дом"));
        propertySet.add(new property("789 Oak St", "Коммерческая недвижимость"));
        propertySet.add(new property("321 Pine St", "Дом"));
        propertySet.add(new property("555 Maple St", "Квартира"));
        propertySet.add(new property("123 Main St", "Квартира")); // Дубликат
        propertySet.add(new property("456 Elm St", "Дом")); // Дубликат

        // Вывод содержимого HashSet на экран
        System.out.println("Уникальные объекты недвижимости:");
        for (repository.property property : propertySet) {
            System.out.println(property);
        }
    }
}
