
class TooYoungException extends RuntimeException{
    
    public  TooYoungException(String msg){
        
        super(msg);
    }
}


class TooOldException extends RuntimeException{
    
    public  TooOldException(String msg){
        
        super(msg);
    }
}




class Test{

    public static void main(String[]arr){

        int age =99;

        if(age>60){
            System.out.println("first block");
                throw new TooYoungException("please wait ");
        }
        if(age<=10){
                System.out.println("Second block");
                throw new TooOldException("to old Exception");
        }
       
    }

}
