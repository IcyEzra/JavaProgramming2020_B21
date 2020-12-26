package day_39_ConstructorIntro;

// import Personal.Data; // imports everything that is static or non static

import static Personal.Data.*;
import static library.ArraysUtility.*;

public class Test {
    public static void main(String[] args) {

        System.out.println( StaticBlocks.company );
        System.out.println( StaticBlocks.employee1 );
        System.out.println( StaticBlocks.b );
        System.out.println( StaticBlocks.isEmployed );

        StaticBlocks.company = "Bank Of America";
        // mutable meaning it can be changed
        System.out.println( StaticBlocks.company );

        System.out.println("============================================");
        // static imports

        System.out.println( data1 );

        // these methods can be initialized because the class is imported
        method1();
        method2();

        int[] arr = {1,2,3,4,5,6};
        System.out.println(max(arr));
        System.out.println(min(arr));



    }
}
