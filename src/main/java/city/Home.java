package city;

public class Home extends Building{

    public static final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(int fullArea, int levels, Address address) {
        super(fullArea, levels, address);
        if (levels>3) throw new IllegalArgumentException("Too big house");

    }


    public Home(int fullArea, Address address) {
        this(fullArea,1, address);

    }




    @Override
    public int calculateNumberOfPeopleCanFit() {
        return (int)(Math.floor(this.getFullArea()/SQUARE_METERS_NEED_PER_PERSON));
    }
}
