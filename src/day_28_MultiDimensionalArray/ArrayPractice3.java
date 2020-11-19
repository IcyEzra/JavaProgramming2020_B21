package day_28_MultiDimensionalArray;

public class ArrayPractice3 {
    public static void main(String[] args) {

        double[] salary = {10000.5, 35000.0, 760000.5, 54000.5, 98000.5};

        double sum = 0;
        double max = salary[0];
        double min = salary[0];

        for(double each : salary ){
            sum += each;

            if(each > max ){
                max = each;
            }
            if(each < min){
                min = each;
            }

        }
        System.out.println("Total: $"+sum);
        System.out.println("Average: $"+(sum/ salary.length));
        System.out.println("Max Salary: $"+max);
        System.out.println("Min Salary: $"+min);





    }
}
