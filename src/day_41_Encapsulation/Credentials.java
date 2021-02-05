package day_41_Encapsulation;

public class Credentials {

    private String userName = "cybertek";
    private double passWord = 1234;

    public String getUserName(){ //getter method, passes no argument, returns value
        return userName;
    }

    public double getPassWord(){ // only allows the data to be read, not set
        return passWord;
    }

    public void setUserName(String userName){ // setter has void returnType, argument passed changes value of obj
        /*
        if(userName.length() < 8){
            return;
        }  we can also do security check in setter of Encapsulation
         */

        this.userName = userName;
    }

    public void setPassWord(double passWord){
        this.passWord = passWord;
    }
}
