package city;

public class Address {
    private String street;
    private int BuildingNumber;

    public Address(String street, int buildingNumber) {
        this.street = street;
        BuildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return BuildingNumber;
    }
}
