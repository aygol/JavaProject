package day42;

public class Movie {
    String name;
    String genre;
    double length;
    public Movie(String name,double length,String genre){
      this. name  =name;
      this. genre=genre;
      this. length=length;

    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }

    public void setName(String name) {
        this.name = name;}

    public Movie() {
        System.out.println("Empty Movie");//write a constuctor to set all the fields value
    }

        // write a constructor to set all the fields value	    // write a constructor to set all the fields value





            public double getLength() {
                return length;
            }







        }



