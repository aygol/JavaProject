package day55;

public class Driver {
    String name;
    int iD;
    Driver dr;
    public Driver(String name, int iD) {
        this.name = name;
        this.iD = iD;

    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", iD=" + iD +
                ", dr=" + dr +
                '}';
    }
}
