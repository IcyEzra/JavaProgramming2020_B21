package day_45_Exceptions;

public class LunchBreakExceptions  extends RuntimeException{

    public LunchBreakExceptions(){
        super("It's time for lunch");
    }

    public LunchBreakExceptions(String msg){
        super(msg);
    }

}
