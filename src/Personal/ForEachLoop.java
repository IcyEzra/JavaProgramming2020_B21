package Personal;

public class ForEachLoop {
    public static void main(String[] args) {
        String [] names = {"Ezra", "Uzair", "Zero", "Riazu", "Sol"};

        for(int i = 0; i<=names.length-1; i++){
            System.out.println( names[i]);

        }
        System.out.println("==========================================");

        for(String each : names){
            System.out.println(each);
        }
        System.out.println("===============================================");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};

        int countEvens = 0;
        int countOdds = 0;

        for(int each : numbers){
            if(each % 2 == 0 ){
                countEvens++;
            }else{
                countOdds++;
            }
        }
        System.out.println("count even: " + countEvens);
        System.out.println("count odd: " + countOdds);
        System.out.println("==================================");

        int[] scores = {10,2,3,25,5,100,-5,-2,1000,30,40,56};
        int max = scores[0];
        int min = scores[0];

        for(int each : scores){
            if(each > max){
                max = each;
            }
            if(each < max){
                min = each;
            }
        }
        System.out.println("max: "+ max);
        System.out.println("min: " + min);
    }
}
