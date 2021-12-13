package filemanipulation;

public class Human {

    String name;
    String identityNumber;

    public Human(String name,String identityNumber) {
        this.name = name;
        this.identityNumber = identityNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getName() {
        return name;
    }

}
