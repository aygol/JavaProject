package officeHour;

public class Array_Cars {
    public static void main(String[] args) {
        String[] cars = {"bmw", "wv", "audi"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
//for each rule  it will assign  and print left to right
        //temperary variable :array name
        for (String carModel : cars) {

            System.out.println(carModel);

        }    System.out.println("*************");
                    int[] ages = {23, 43, 5, 7, 87};


                    System.out.println(ages[2]);
                    System.out.println(ages[3] - ages[2]);//result =2
                    for (int ageOfStudent : ages) {
                        System.out.println("Student age " + ageOfStudent);


                    }
                }
            }