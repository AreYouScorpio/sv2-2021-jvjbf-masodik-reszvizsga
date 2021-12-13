package city;

public class Office extends Building {

    public Office(int area, int levels, Address address, String company, int numberOfTablesPerLevel) {
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return 0;
    }
}
