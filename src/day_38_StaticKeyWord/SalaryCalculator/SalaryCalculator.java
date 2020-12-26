package day_38_StaticKeyWord.SalaryCalculator;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;                                             // ex for stateTaxRate: if 8 is given, it will be converted to .008, if .009 is given, it will keep that value
        this.stateTaxRate = (stateTaxRate > 1) ? stateTaxRate / 100 : stateTaxRate; // if user gives whole number value for rate, then it will be converted to decimal by dividing it by 100, if decimal value is given, then that value is taken
        this.federalTaxRate = (federalTaxRate > 1) ? federalTaxRate / 100 : federalTaxRate; // same with this too, if whole value is given, it will be converted, otherwise, if less than one (meaning decimal value is given), it will take that value instead
        salary = calculateSalary();
        salaryAfterTax = calculateSalaryAfterTax();
    }

    public double calculateSalary(){

        return hourlyRate * weeklyHours * 52;
    }

    public double calculateStateTax(){

        return salary * stateTaxRate;
    }

    public double calculateFederalTax(){

        return salary * federalTaxRate;
    }

    public double calculateTotalTax(){

        return calculateStateTax() + calculateFederalTax();
    }

    public double calculateSalaryAfterTax(){

        return salary - calculateTotalTax();
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", salary= $" + salary +
                ", salaryAfterTax= $" + salaryAfterTax +
                '}';
    }

    public boolean equals(SalaryCalculator s1){
        return this.salary == s1.salary;
    }
}
/*
2. Create a custom class called SalaryCalculator
					Attributes:
						hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax
					Methods:
						calculateSalary: returns the annual salary
						calculateStateTax: returns the total state tax
						calculateFederalTax: returns the total federal tax
						calculateTotalTax: returns the total tax
						calculateSalaryAfterTax: returns the salary after calculator
						setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and iitializes all instances
						toString() method
 */