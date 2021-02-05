package Day_50_Polymorphisim;

import day_47_Abstraction.PersonTask.Developer;
import day_47_Abstraction.PersonTask.Employee;
import day_47_Abstraction.PersonTask.Tester;
import day_47_Abstraction.PersonTask.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000)

        };


        int countTesters = 0;
        int countDeveloper = 0;
        for(Employee each : employees){
            if(each instanceof Tester){
                countTesters++;
            }
            if(each instanceof  Developer){
                countDeveloper++;
            }
        }
        System.out.println("Number of Testers: "+countTesters);
        System.out.println("Number of Developers: "+countDeveloper);

        System.out.println("=======================================================================================");

        ArrayList<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(employees));

        System.out.println(scrumMembers.size());

        // Removing UberDrivers from list using instanceof
        scrumMembers.removeIf( p -> p instanceof UberDriver );
        System.out.println(scrumMembers.size());

        System.out.println("==================================================");

        ArrayList<Employee> testers = new ArrayList<>();
        ArrayList<Employee> developers = new ArrayList<>();
        // New Concept forEach
        scrumMembers.forEach( each -> { if(each instanceof Tester) testers.add(each); else developers.add(each); } );
        /* either way works forEach ^ is similar to using for each loop
        for(Employee each : scrumMembers){
            if(each instanceof Tester){
                testers.add(each);
            }else{
                developers.add(each);
            }
        }  */
    }

}
