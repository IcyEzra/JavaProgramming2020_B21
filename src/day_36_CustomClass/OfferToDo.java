package day_36_CustomClass;

public class OfferToDo {

    public String Location, jobTitle;
    public boolean hasBenefit, WFH, hasPTO, isFullTime;
    public double salary;

    public void setInfo(String Location, String jobTitle, boolean hasBenefit, boolean hasPTO, boolean isFullTime){

        //in an instance where the object parameter shares the same name with the instance variable,
        // you can use this.instanceVariableName to call the instance variable manually
        //in this case every parameter has the same name as the instance variable
        // so (this) will be used each time
        this.Location = Location;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;

    }

    public void getInfo(){
        System.out.println("================================");
        System.out.println("Job Location: "+Location);
        System.out.println("Do they have benefits? "+hasBenefit);
        System.out.println("Do they offer paid time off? "+hasPTO);
        System.out.println("================================");
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