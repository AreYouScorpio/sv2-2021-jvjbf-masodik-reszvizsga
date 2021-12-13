package city;

public class Office extends Building {

    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, int levels, Address address, String company, int numberOfTablesPerLevel) throws IllegalArgumentException {
        super(area,levels,address);
        this.company=company;
        this.numberOfTablesPerLevel=numberOfTablesPerLevel;
        double areaPerTable=area/numberOfTablesPerLevel;
        if(areaPerTable<2||areaPerTable>5)
          throw new IllegalArgumentException("Wrong table number.");
    }

    public String getCompany(){
        return this.company;
    };

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return 0;
    }
}
