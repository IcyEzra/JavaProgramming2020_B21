package Office_Hours.Practice_11_25_2020_Methods_BranchingStatements;

public class MethodPractice2 {

    public static void main(String[] args) {

        max(100,200);

        System.out.println(max(100,200) * 2); // works because method returns int

        max(100, 600,300);

    }

    // create a method that finds the maximum between 2 numbers
    public static int max(int a, int b){
        int maximum = (a >= b) ? a : b; // ternary: if a is greater or equal to b the maximum equals a else maximum equals b
        //System.out.println(maximum);
        return maximum; // return can be used to exit the method but also can be used to return data (as long as it matches the return type)
    }

    // method overloading
    public static int max(int a, int b, int c){
        //int n = max(a,b); one way to make the method but there is a way to do it one line
        //return max(n,c);
        return max( max(a,b),c );
    }
    // more overloading, checks for max among 4 ints
    public static int max(int a, int b, int c, int d){
       // int n = max(a,b,c);
        return max( max(a,b,c) , d );
    }

}
