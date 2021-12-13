package city;

public abstract class Building {
    int area;
    int levels;
    Address address;

    public Building(int area, int levels, Address address) {
        this.area = area;
        this.levels = levels;
        this.address = address;
    }

    public Building(int area, Address address) {
        this.area = area;
        this.address = address;
        this.levels=1;
    }

    public Building() {

    }

    public int getFullArea() {
        return area* levels;
    }

    public int getLevels() {
        return levels;
    }

    public int getArea() {
        return area;
    }

    public Address getAddress() {
        return address;
    }




    public abstract int calculateNumberOfPeopleCanFit();

}
