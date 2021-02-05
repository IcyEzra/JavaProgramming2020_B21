package Replts.replt_232_Overriding_1_Education;

public class EducationalInstitution {

    private int years;
    public int duration;

    public EducationalInstitution(int duration){
        this.duration = duration;
    }

    public String graduationRequirements(){
        return duration+" years of study";
    }



}
