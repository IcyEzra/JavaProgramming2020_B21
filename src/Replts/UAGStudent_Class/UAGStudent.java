package Replts.UAGStudent_Class;

public class UAGStudent {

    public String name, studentID;
    public int grade;
    public static String principalName;
    public static int nextID;

    static{
        principalName = "Ms.McKoy";
        nextID = 100;
    }

    public UAGStudent(String name, int grade){
        this.name = name;
        String[] split = name.split("");
        this.studentID = split[0].toUpperCase() + nextID;
        nextID++;
    }

    public static String newPrincipal(String newPrincipal){
        return principalName = newPrincipal;
    }

    public static int resetID(){
        return nextID = 100;
    }

    public String toString(){
        return name+" "+studentID;
    }



}
