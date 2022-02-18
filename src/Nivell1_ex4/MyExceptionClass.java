package Nivell1_ex4;

public class MyExceptionClass extends Exception {
    
    private String customMessage;
    public MyExceptionClass(String message){
        this.customMessage = message;
    }

    @Override
    public String getMessage(){
        return customMessage;
    }
    
}
