package day_32_LocalDate_WrapperClass;

public class ParseMethods {

    public static void main(String[] args) {

        String data1 = "123";

        System.out.println(data1+3); // 1233

        int num1 = Integer.parseInt(data1); // neither autoboxing or unboxing
            //        primitive <==== primitive int

        Integer num2 = Integer.parseInt(data1); //Autoboxing
            // wrapper class <==== primitive

        System.out.println(num1+3); // 126

        String s2 = "2.5";
        double d1 = Double.parseDouble(s2); //neither auto or unboxing because you are assigning a primitive to a primitive

        Double d2 = Double.parseDouble(s2); // autoboxing
        // wrapper class <==== primitive

        System.out.println(d1+1); //3.5

        String s3 = "maybe";
        boolean r1 = Boolean.parseBoolean(s3); // neither auto or unboxing
        Boolean r2 = Boolean.parseBoolean(s3); // auto boxing

        System.out.println(r1);
        System.out.println(!r1);

        String s4 = "FaLse";

        boolean r3 = Boolean.parseBoolean(s4);

        System.out.println(r3); // not case sensitive


    }

}
