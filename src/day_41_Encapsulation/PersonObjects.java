package day_41_Encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person("Jimmy",19,'M');
        // System.out.println(p1.name); won't print because private
        System.out.println( p1.getName() );

        p1.setName("Breanna");  // Setter
        p1.setGender('F');
        p1.setAge(23);

        System.out.println( p1.getName() ); // Getter
        System.out.println( p1.getAge() );
        System.out.println( p1.getGender() );
    }
}
