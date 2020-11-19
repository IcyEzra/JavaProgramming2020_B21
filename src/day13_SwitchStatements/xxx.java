package day13_SwitchStatements;

public class xxx {
    public static void main(String[] args) {
        System.out.println("Enter month number");
        int monthNum = 2;

        //WRITE YOUR CODE HERE:
        String month = " ";
        switch(monthNum){
            case 1: month = ("January");
                break;
            case 2: month = ("February");
                break;
            case 3: month = ("March");
                break;
            case 4: month = ("April");
                break;
            case 5: month = ("May");
                break;
            case 6: month = ("June");
                break;
            case 7: month = ("July");
                break;
            case 8: month = ("August");
                break;
            case 9: month = ("September");
                break;
            case 10: month = ("October");
                break;
            case 11: month = ("November");
                break;
            case 12: month = ("December");
                break;
            default:

        }System.out.println(month);

    }
}
 /*if (vehicleYear>=1995 && vehicleYear<=1998){
         result = recall;
         }else if (vehicleYear>=2001 && vehicleYear<=2002){
         result = recall;
         }else if (vehicleYear>=2004 && vehicleYear<=2006){
         result = recall;
         }else if (vehicleYear>=2015 && vehicleYear<=2017){
         result = recall;
         }else {
         result = "Your vehicle is fine, enjoy!";
         }
         System.out.println(result);
*/