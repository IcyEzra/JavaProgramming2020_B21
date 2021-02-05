package Replts.replt_232_Overriding_1_Education;

public class LawSchool extends EducationalInstitution{

    public LawSchool(){
        super(3);
    }

    @Override
    public String graduationRequirements(){
        return duration+" years of study and passing the bar";
    }



}
