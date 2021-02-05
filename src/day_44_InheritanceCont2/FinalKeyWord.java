package day_44_InheritanceCont2;

class Q{

    public void method(){
        System.out.println("Method A");
    }

}

public class FinalKeyWord extends Q{

    @Override // used to check if method is overloaded
    // error is given if class is not extended
    public void method(){
        System.out.println("Method B");
    }

    public final static int z = 100; // must initialize at this point, cannot be changed once set, only instance methods or variables can be changed

    public static void main(String[] args) {

        System.out.println(z);
        // z = 100; cannot change because of final keyword
        System.out.println(z);

    }

}
