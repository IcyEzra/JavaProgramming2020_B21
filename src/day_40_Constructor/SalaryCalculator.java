package day_40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public static int numberOfWorkingDays, numberOfWeeks;
    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static{
        numberOfWorkingDays = 5;
        numberOfWeeks = 52;
    }

    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {

        if(stateTaxRate > 1){
            stateTaxRate /= 100;
        }
        // data for both of these variables are percentages and are converted to decimal if whole percentage value is given
        // if decimal value is given (ex: 8% = .08) that that value is accepted
        if(federalTaxRate > 1){
            federalTaxRate /= 100;
        }

        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = weeklyHours * hourlyRate * numberOfWeeks;
        totalTax = (stateTaxRate + federalTaxRate) * salary;
        salaryAfterTax = salary - totalTax;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator{" +
                "weeklyHours= " + weeklyHours +
                ", hourlyRate= $" + hourlyRate +
                ", stateTaxRate= " + stateTaxRate +
                ", federalTaxRate= " + federalTaxRate +
                ", salary= $" + df.format(salary) +
                ", salaryAfterTax= $" + df.format(salaryAfterTax) +
                ", totalTax= $" + df.format(totalTax) +
                '}';
    }
}
