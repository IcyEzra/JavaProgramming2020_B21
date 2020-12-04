package Personal;

import java.util.Scanner;

public class replt_153_SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        //your code here
        String[] split = info.split(",");
        String name = split[0];
        String lastName = split[1];
        String age = split[2];
        System.out.println("person name: " + name + " last name: " + lastName + " age: " + age);

    }//end person

}
