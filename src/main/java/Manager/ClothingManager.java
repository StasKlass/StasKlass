package Manager;

import java.util.*;

public class ClothingManager {
    private Set<ClothingItem> clothingItems;
    private List<ClothingItem> sortedList;

    public ClothingManager() {
        this.clothingItems = new HashSet<>();
        this.sortedList = new ArrayList<>();
    }

    public void addClothingItem(ClothingItem item) {
        clothingItems.add(item);
        sortedList.add(item);
        Collections.sort(sortedList, Comparator.comparing(ClothingItem::getName));
    }

    public void removeClothingItem(ClothingItem item) {
        clothingItems.remove(item);
        sortedList.remove(item);
    }

    public boolean searchClothingItem(ClothingItem item) {
        return clothingItems.contains(item);
    }

    public void printClothingItems() {
        for (ClothingItem item : sortedList) {
            System.out.println(item.getName() + " - " + item.getSize() + " - " + item.getColor() + " - " + item.getCategory());
        }
    }

    public void printUniqueCategories() {
        Set<String> categories = new HashSet<>();
        for (ClothingItem item : clothingItems) {
            categories.add(item.getCategory());
        }
        System.out.println("Уникальные категории в коллекции>> " + categories);
    }

    public static void main(String[] args) {
        ClothingManager manager = new ClothingManager();

        ClothingItem item1 = new ClothingItem("футболка", "M", "черная", "верхняя одежда");
        ClothingItem item2 = new ClothingItem("джинсы", "L", "голубые", "нижняя одежда ");
        ClothingItem item3 = new ClothingItem("платье", "S", "красное", "платье");
        ClothingItem item4 = new ClothingItem("футболка", "M", "черная", "верхняя одежда");

        manager.addClothingItem(item1);
        manager.addClothingItem(item2);
        manager.addClothingItem(item3);
        manager.addClothingItem(item4); // дубликат

        System.out.println("Присутствует ли элемент item1 в коллекции? " + manager.searchClothingItem(item1));
        System.out.println("Присутствует ли элемент item2 в коллекции? " + manager.searchClothingItem(item2));
        System.out.println("Присутствует ли элемент item3 в коллекции? " + manager.searchClothingItem(item3));
        System.out.println("Присутствует ли элемент item4 в коллекции? " + manager.searchClothingItem(item4));

        System.out.println("Одежда в коллекции>> ");
        manager.printClothingItems();
        manager.printUniqueCategories();

        manager.removeClothingItem(item1);
        System.out.println("Присутствует ли элемент item1 в коллекции после удаления? " + manager.searchClothingItem(item1));
    }
}

class ClothingItem {
    private String name;
    private String size;
    private String color;
    private String category;

    public ClothingItem(String name, String size, String color, String category) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ClothingItem other = (ClothingItem) obj;
        return size.equals(other.size) && color.equals(other.color) && category.equals(other.category);
    }

    @Override
    public int hashCode() {
        int result = size.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }
}

