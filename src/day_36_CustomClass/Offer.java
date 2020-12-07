package day_36_CustomClass;

public class Offer {
// I COMMENTED EVERYTHING OUT CUZ IM FUCKING LAZY, so i copypastaed everything
    /*
    public String Location, jobTitle;
    public boolean hasBenefit, WFH, hasPTO, isFullTime;
    public double salary;

    /* This was my version of setInfo, commented out because of shortcut. Shortcut is right click anywhere on intellij,
    click Generate then select all (ctrl a) and then press enter and it will generate a method like below
    after, change the return type to void and change the name to setInfo

    public void setInfo(String Location, String jobTitle, boolean hasBenefit, boolean hasPTO, boolean isFullTime){

        //in an instance where the object parameter shares the same name with the instance variable,
        // you can use this.instanceVariableName to call the instance variable manually
        //in this case every parameter has the same name as the instance variable
        // so (this) will be used each time
        this.Location = Location;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;

    } */
/*
    public void setInfo(String location, String jobTitle, boolean hasBenefit, boolean WFH, boolean hasPTO, boolean isFullTime, double salary) {
        Location = location;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
        this.WFH = WFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    public void getInfo(){
        System.out.println("================================");
        System.out.println("Job Location: "+Location);
        System.out.println("Do they have benefits? "+hasBenefit);
        System.out.println("Do they offer paid time off? "+hasPTO);
        System.out.println("Is it full time? "+isFullTime);
        System.out.println("================================");
    }

    */


    public String location, jobTitle, companyName;
    public double salary;
    public boolean hasBenefit, isWFH, hasPTO, isFullTime;

    public void setInfo(String location, String jobTitle, String companyName, double salary, boolean hasBenefit, boolean isWFH, boolean hasPTO, boolean isFullTime) {
        this.location = location;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isWFH = isWFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
    }

    public void getInfo(){
        System.out.println("Company: " + companyName+ "\nLocation: " + location + "\nSalary: $" + salary +
                "\nJob Title: " + jobTitle + "\nHas Benefit: " + hasBenefit + "\nWork From Home: " + isWFH +
                "\nHas PTO: " + hasPTO + "\nis Full time: " + isFullTime);
        System.out.println("===========================================");
    }


}
/*
 Offer:
        Attributes
            Location, salary, jobTitle, hasBenifit(boolean), WFH(boolean), hasPTO(boolean), isFullTime
        Actions:
                setInfo
                getInfo
        MyOffers:
            create 7 objects of Offer class and store them into an ArrayList of Offer
            write a program that can only keep the offers from local area
            write a program that can remove all offers that are not for SDET or QA
            write a program that can remove all offers that are not work from home
            write a program that can remove all offers that does not have benefits
            write a program that can remove the offers that are not full Time

 */