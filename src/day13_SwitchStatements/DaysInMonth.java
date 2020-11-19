package day13_SwitchStatements;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2020;
        int month = 2; //1 ~ 12

        String result = " ";
        boolean has28DaysOr29Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        if (month > 0 && month < 13) {
            if (has28DaysOr29Days) {
                if (year % 4 == 0) {
                    result = "29 Days";
                } else {
                    result = "28 Days";
                }
            } else if (has30Days) {
                result = "30 Days";
            } else {
                result = "31 Days";
            }

        } else {
            result = "Invalid Month";
        }
        System.out.println(result);



    }
}
/* this is muhatars version with notes included
        int year = 2021;
        int month = 25; // 1 ~ 12

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        //   boolean has31Days = !has28Or29Days || !has30Days;

        String result = "";

        if (month > 0 && month < 13) { // 1 ~ 12, if the mopnth is valid

        if (month == 2) { // for Feb

        if (year % 4 == 0) { // leap year
        result = "29 days";
        } else { // not leap year
        result = "28 days";
        }

        } else if (has30Days) { // for April, June, September, November
        result = "30 days";
        } else { // for Jan, Mar, May, Jul, Aug, Oct, Dec
        result = "31 days";
        }

        } else { // if the month is invalid
        result = "Invalid Month";
        }


        System.out.println(result);
*/