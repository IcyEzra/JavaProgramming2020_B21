package Replts;
import java.util.Scanner;

public class replt_80_buildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        if(start.equals(end)){
            System.out.println(start + " found");
        }else if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("b")){
            System.out.println("right: " + end + " found");
        }else if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("c")){
            System.out.println("right > down: " + end + " found");
        }else if(start.equalsIgnoreCase("a") && end.equalsIgnoreCase("d")){
            System.out.println("right > down > left: " + end + " found");
        }else if(start.equalsIgnoreCase("b") && end.equalsIgnoreCase("a")){
            System.out.println("down > left > up: " + end + " found");
        }else if(start.equalsIgnoreCase("b") && end.equalsIgnoreCase("c")){
            System.out.println("down: " + end + " found");
        }else if(start.equalsIgnoreCase("b") && end.equalsIgnoreCase("d")){
            System.out.println("down > left: " + end + " found");
        }else if(start.equalsIgnoreCase("c") && end.equalsIgnoreCase("a")){
            System.out.println("left > up: " + end + " found" );
        }else if(start.equalsIgnoreCase("c") && end.equalsIgnoreCase("b")){
            System.out.println("left > up > right: " + end + " found");
        }else if(start.equalsIgnoreCase("c") && end.equalsIgnoreCase("d")){
            System.out.println("left: " + end + " found");
        }else if(start.equalsIgnoreCase("d") && end.equalsIgnoreCase("a")){
            System.out.println("up: " + end + " found");
        }else if(start.equalsIgnoreCase("d") && end.equalsIgnoreCase("b")){
            System.out.println("up > right: " + end + " found");
        }else{
            System.out.println("up > right > down: " + end + " found");
        }
    }
}