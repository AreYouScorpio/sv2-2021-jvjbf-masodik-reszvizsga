package city;

public abstract class Building {
    int fullArea;
    int area;
    int levels;
    String address;

    public Building(int area, int floors, String address) {
        this.fullArea = area;
        this.levels = floors;
        this.address = address;
    }

    public Building(int area, String address) {
        this.fullArea = area;
        this.address = address;
    }

    public Building() {

    }

    public int getFullArea() {
        return fullArea* levels;
    }

    public int getLevels() {
        return levels;
    }

    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }




    public abstract int calculateNumberOfPeopleCanFit();

}
