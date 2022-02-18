package Nivell1_ex5;

public class App {
    public static int count=0;
    public static void main(String[] args) {
        try{
            loop();
        }catch(Error e){
            System.err.println("Block Error: " +e);
        }
    }
    public static void loop(){
        System.out.println(count++);
        loop();
    }
}
