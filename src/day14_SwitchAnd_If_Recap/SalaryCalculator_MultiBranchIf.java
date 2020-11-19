package day14_SwitchAnd_If_Recap;

public class SalaryCalculator_MultiBranchIf {
    public static void main(String[] args) {
        double hourlyRate = 18.32;
        int weeklyHours = 35;
        int numberOfWeeks = 52;

        int salary = 0;

        if (hourlyRate > 0) {

            if (weeklyHours > 1 && weeklyHours <= 65) {

                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {

                    salary = (int) (hourlyRate * weeklyHours * numberOfWeeks);

                } else {
                    System.err.println("Number of weeks cannot be less than 1 or greater than 52");
                }

            } else {
                System.err.println("Weekly Hours cannot be less than 1 or greater than 65");
            }

        } else {
            System.err.println("Hourly Rate cannot be negative or zero");
        }
        System.out.println("Your salary is: " + salary);



    }
}
/*
task:
	1. write a program for the salary calculator
			given info:
					hourlyRate  40$
					weeklyHours  45 hours
					numberofWeeks 48 weeks

			pre conditions: hourlyRate cannot be negative
							weekly hours cannot be negative or more than 65
							numberOfWeeks cannot be more than 52 weeks or less than 1


			salary  =  hourlyRate *  weeklyHours * numberofWeeks


 */