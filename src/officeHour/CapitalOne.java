package officeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalOne {
    public static void main(String[] args) {
        //create List of Testers, and store two objects of Testers class
        //			create List of Developers, and store two objects of Developers class
        //			create List of ScrumTeam, and store the list of Testers and Developers
        //			use for each loop to print out each of the scrum team member's EmployeeInfo
        Testers t1=new Testers("Ali","Senior tester",8000);
        Testers t2=new Testers("Alisa","Junior tester",7000);
        List<Testers> testerLst= Arrays.asList(t1,t2);
        Developers d1=new Developers("Olga","senior developer",9000);
        Developers d2=new Developers("Jone","junior developer",8000);

        List<Developers> developmentLst= Arrays.asList(d1,d2);

        List<ScrumTeam> teamLst= new ArrayList<>();
teamLst.addAll(developmentLst);
teamLst.addAll(testerLst);
        for(ScrumTeam each:teamLst){
            System.out.println( each.employeeInfo());  // each.employeeInfo();

        }
    }
}
