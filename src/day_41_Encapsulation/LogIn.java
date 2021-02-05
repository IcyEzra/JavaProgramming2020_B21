package day_41_Encapsulation;

public class LogIn {

    public static void main(String[] args) {


        Credentials obj = new Credentials(); // if no constructor is declared, then compiler will automatically generate one for you

        //System.out.println(obj.userName); since access modifier is sett to private
        //obj.userName = "ABC";             we can't change or access the data
        //System.out.println(obj.userName); in this case we need a getter

        System.out.println( obj.getUserName() );
        System.out.println( obj.getPassWord() );

        // setter
        obj.setUserName("Uzair");
        obj.setPassWord(5678);

        System.out.println( obj.getUserName() );
        System.out.println( obj.getPassWord() );
    }

}
