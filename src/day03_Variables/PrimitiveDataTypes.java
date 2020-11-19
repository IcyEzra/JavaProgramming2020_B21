package day03_Variables;
/*
declare variables:
    DataType name = Data;

    double > float > long > int > short > byte

 */

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //Test score: 85
        int score = 85;

        System.out.println(score);
        System.out.println("score");
        //double quotes dictate what data is used, no quotes will declare variable you set, quotes will print what you type

       // long number0 = 9999999999; //int is preferred, compiler takes it as int, and the number 9999999999 is out of int range, if you try to run this variable you will get an error
        long number1 = 9999999999L; //when using long variable, put and L at then end of the number so the compiler reads it as long, This example will run, the first one will not

        double decimal1 = 0.5; //double is preferred for decimals, in order to force the compiler to read as float, put an f at the end of the value
      //  float flot1 = 0.5; //will run as double not float
        float float2 = 0.5f;
        System.out.println(float2);


    }


}




