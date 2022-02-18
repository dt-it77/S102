package Nivell1_ex4;

public class App {
    public static void main(String[] args) throws MyExceptionClass {
        try{
            throw new MyExceptionClass("Opppssss un error!");
        }catch(MyExceptionClass e){
            System.err.println("Missatge: "  +  e.getMessage());
            System.err.println("Class: " + e.getClass());
        }
    }
}
