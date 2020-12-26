package day_40_Constructor;

import Personal.Data; // imports entire Data class
import static Personal.Data.method1; // imports only method1 from Data class
import static Personal.Data.method2;


public class StaticImport {

    public static void main(String[] args) {

        //since these methods are imported via static import, there is no need to call the class name to initialize them
        method1();
        method2();


    }

}
