package Personal;

public class replt_123_UtopianTree {
    public static void main(String[] args) {

            for(int i = 1; i <= 10; i++){
                int year = i;
                int growth = 1;
                int treeSize = 1;
                int treeGrowth = growth + treeSize;
            if (year <= 3){
                growth = 1;
                treeSize = year * growth;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize + "cm");
            }
            if(year>=4 && year<=10){
                growth = 2;
                treeSize = (year * growth)-3;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize + "cm");
            }


                }
            }

        }


/*
int year = 0;
        int treeSize = 0;
        int growth = 0;

        for(int i = 1; i <= 10; i++){
            if(year == 1 || year == 2 || year == 3){
                growth++;
                treeSize++;
                System.out.println("year " + year + " - growth " + growth + " cm");
                System.out.println("tree size: " + treeSize+ "cm");
            }else{
                for(year = 10; year <= 4; year--){
                    growth += 2;
                    treeSize += 2;
                    System.out.println("year " + year + " - growth " + growth + " cm");
                    System.out.println("tree size: " + treeSize+ "cm");

                }
            }
        }



 */


/*
Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10
 */