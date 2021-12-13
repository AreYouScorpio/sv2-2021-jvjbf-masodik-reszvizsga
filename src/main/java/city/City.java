package city;

import java.util.List;

public class City {
    private String cityName;
    private long fullArea;
    private List<Building> buildings;

    public City(String cityName, long q) {
        this.cityName = cityName;
        this.fullArea = q;
    }

    public String getName() {
        return cityName;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building b) throws  IllegalArgumentException{
       if(b.getArea()<=this.fullArea) {buildings.add(b);}
       else
       {throw new IllegalArgumentException("City can't be larger than "+this.fullArea);}

    }

    public Building findHighestBuilding(){
        int max=0;
        Building maxBuilding;
        for (int i=0; i<buildings.size();i++){
            if (buildings.get(i).getLevels()>max) {
                max=buildings.get(i).getLevels();
                maxBuilding=buildings.get(i);
            }
        }
        return maxBuilding;
    }

}
