package repository;

class Property {
    String address;
    String type;

    public Property(String address, String type) {
        this.address = address;
        this.type = type;
    }

    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
