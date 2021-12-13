package city;

public class Home extends Building{

    public final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(int fullArea, int floors, String address) {
        super(fullArea, floors, address);
        if (floors>3) throw new IllegalArgumentException("Too big house");

    }


    public Home(int fullArea, String address) {
        super(fullArea, address);

    }

    public Home(int area, int floors, Address main) {
        super();
    }

    public Home(int area, Address address) {

    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return 0;
    }
}
