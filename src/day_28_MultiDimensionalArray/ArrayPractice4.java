package day_28_MultiDimensionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {

        String[] employeeNames = { "SpiderMan","SuperMan","Batman", "WonderWoman", "GreenLantern", "MartianManHunter", "HawkWomen", "HawkMan" };

        int[] employeeSalary = { 10000, 100000, 10000000, 999999, 10000, 10000000, 10000000, 10000};
        int min = employeeSalary[0];
        int max = employeeSalary[0];
        for(int each : employeeSalary){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }
        System.out.println("Max: " + max);

        for(int i = 0; i<=employeeNames.length-1; i++){
            if(max == employeeSalary[i]){
                System.out.println(employeeNames[i]);
            }
        }
        System.out.println("Min: " + min);

        for(int i = 0; i<=employeeNames.length-1; i++){
            if(min == employeeSalary[i]){
                System.out.println(employeeNames[i]);
            }
        }



    }
}
