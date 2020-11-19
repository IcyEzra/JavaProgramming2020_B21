package day_28_MultiDimensionalArray;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String[] employeeNames = { "SpiderMan","SuperMan","Batman", "WonderWoman", "GreenLantern" };
                    //index number     0           1          2         3               4
        int[] employeeSalary = { 10000, 100000, 10000000, 999999, 5 };
                  // index number  0       1        2        3    4

        int max = employeeSalary[0];
        String nameOfMax = employeeNames[0]; // temp value holders for both variables

        int min = employeeSalary[0];
        String nameOfMin = employeeNames[0];

        for(int i = 0; i <= employeeNames.length-1; i++){
            System.out.println(employeeNames[i] + " : $" + employeeSalary[i]); // prints employee name : $salary

            if(employeeSalary[i] > max){
                max = employeeSalary[i];
                nameOfMax = employeeNames[i];
            }
            if(employeeSalary[i] < min){
                min = employeeSalary[i];
                nameOfMin = employeeNames[i];
            }
        }
        System.out.println(nameOfMax + " has maximum salary of: " + max);
        System.out.println(nameOfMin + " has minimum salary of: " + min);



    }
}
