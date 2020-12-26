package Replts;

public class replt_175_Methods_ValidateTask {
    public static void main(String[] args) {

        validateTask(false,3,1);

    }

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {
        boolean result = false;
        if(notEmpty == true){

            if(taskId == currentId+1){
                result = true;
            }else{
                result = false;
            }



        }else{
            result = false;
        }

        System.out.println(result);
        return result;
    }

}
