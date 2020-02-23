package day61;
//POJO plain old Java Object Usally used to repsent data
public class Job implements Comparable <Job>{

    private String location;
    private int salary;
    private String companyName;


    @Override
    public int compareTo(Job other) {
        if(this.salary>other.salary){
            return 1;}
            else if(this .salary<other.salary){
                return -1;
        }
        return 0;
    }

    public Job(String location, int salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
