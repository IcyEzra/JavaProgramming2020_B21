package day12_NestedIf;

public class EqualityOfNumbers {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        int n3 = 100;
        String result = " ";
        if (n1 == n2 && n1 == n3){
            result = "all equal";
        }else if (n1 == n2){
            result = "n1 and n2 are equal";
        }else if (n1==n3){
            result = "n1 and n3 are equal";
        }else if (n2==n3){
            result = "n2 and n3 are equal";
        }else {
            result = "none of them are equal";
        }
        System.out.println(result);

        String result2 = (n1 == n2 && n1 == n3) ? "all are equal" : (n1==n2) ? "n1 and n2 are equal" : (n1==n3) ? "n1 and n3 are equal" :
                (n2==n3) ? "n2 and n3 are equal" : "none of them are equal";
        System.out.println(result2);
        }

        }


