package Replts.Person_Class;

public class Person {

    private String firstname, lastname, ssn;
    private int birthmonth, birthday, birthyear;

    public Person(String firstname, String lastname, String ssn, int birthmonth, int birthday, int birthyear){
        this. firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getBirthday(){
        return birthmonth+"/"+birthday+"/"+birthyear;
    }

    public boolean verifySSN(String parameter){
        if(parameter.equals(ssn)){
            return true;
        }else{
            return false;
        }
    }

}
