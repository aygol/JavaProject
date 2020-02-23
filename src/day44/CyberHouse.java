package day44;

public class CyberHouse {
    int houseNum;
    String design;
   static   String neighbourhoodName="Cybertek Ave";

    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }
public static void neighbourhoodName(){
    System.out.println("neighbourhoodName "+neighbourhoodName);
}
    public int getHouseNum() {
        return houseNum;
    }public void showAllInfo(){
        System.out.println("house "+this.houseNum+" design: "+design+" neighbourhoodName "+neighbourhoodName);
    }

    @Override
    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +
                '}';
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public static String getNeighbourhoodName() {
        return neighbourhoodName;
    }

    public static void setNeighbourhoodName(String neighbourhoodName) {
        CyberHouse.neighbourhoodName = neighbourhoodName;
    }
}
