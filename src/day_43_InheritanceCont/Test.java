package day_43_InheritanceCont;

public class Test extends AccessModifiers{

    public static void main(String[] args) {

        // inherited methods from AccessModifier class,
        Test.publicMethod(); // always accessible
        Test.defaultMethod(); // visible because it is in same package, not reachable outside of package
        Test.protectedMethod(); // accessible outside of package only if it is imported

    }

}
