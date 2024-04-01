package repository;
import repository.Property;

import java.util.HashSet;

public class FilterByPropertyType {
    public static HashSet<property> filterByType(HashSet<property> properties, String type) {
        HashSet<property> filteredProperties = new HashSet<>();
        for (repository.property property : properties) {
            if (property.type.equals(type)) {
                filteredProperties.add(property);
            }
        }
        return filteredProperties;
    }

    public static void main(String[] args) {
        HashSet<property> propertySet = new HashSet<>();

        propertySet.add(new property("123 Main St", "Квартира"));
        propertySet.add(new property("456 Elm St", "Дом"));
        propertySet.add(new property("789 Oak St", "Коммерческая недвижимость"));
        propertySet.add(new property("321 Pine St", "Дом"));
        propertySet.add(new property("555 Maple St", "Квартира"));

        System.out.println("Все объекты недвижимости:");
        for (repository.property property : propertySet) {
            System.out.println(property);
        }

        String typeToFilter = "Дом";
        HashSet<property> filteredProperties = filterByType(propertySet, typeToFilter);
        System.out.println("\nОбъекты недвижимости типа \"" + typeToFilter + "\":");
        for (repository.property property : filteredProperties) {
            System.out.println(property);
        }
    }
}
