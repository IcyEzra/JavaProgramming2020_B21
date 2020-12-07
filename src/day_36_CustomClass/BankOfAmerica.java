package day_36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class BankOfAmerica {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee(),
        };

        employees[0].setInfo("Angelina Jolie",'F',"999999999",1234567,"Actress", "Hollywood", 999999999, LocalDate.of(2020,1,1));
        employees[1].setInfo("Brad Pitt",'M',"899999999",1234589,"Actor", "Hollywood", 999999999, LocalDate.of(2020,2,1));
        employees[2].setInfo("Jon Snow",'M',"799999999",1234444,"Bastard", "The North", 99999, LocalDate.of(2020,3,1));
        employees[3].setInfo("Zero",'M',"699999999",1234333,"Maverick Hunter", "Heroes", 999999999, LocalDate.of(2020,4,1));
        employees[4].setInfo("X",'M',"599999999",1111111,"Maverick Hunter", "Heroes", 999999999, LocalDate.of(2020,5,1));

        for( Employee each : employees){
            each.getInfo();
        }
        System.out.println("========================================");
        ArrayList<Employee> HeroesAndHollywood = new ArrayList<>( Arrays.asList(employees) );

        //removes the employee if company does not match condition
        HeroesAndHollywood.removeIf(p -> !(p.companyName.equalsIgnoreCase("heroes") || p.companyName.equalsIgnoreCase("hollywood")));

        //prints out each element in ArrayList
        for(Employee each : HeroesAndHollywood){
            System.out.println(each.name);
        }

        System.out.println("===========================================");
        ArrayList<Employee> richPeople = new ArrayList<>();
        richPeople.addAll(Arrays.asList(employees));
        //for each loop way of adding array elements into ArrayList, above way is preferred way of doing it
        //for(Employee each : employees) richPeople.add(each);

        richPeople.removeIf(p -> p.salary < 200000); // removes the employee if salary is < 200000

        System.out.println("==============================================");

        double maxSalary = employees[0].salary; //assumes the first employee has max

        for(Employee each : employees){
            maxSalary = Math.max(maxSalary, each.salary);
        }
        System.out.println(maxSalary);
    }
}
