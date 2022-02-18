package Nivell1_ex2;

public class App {
    public static void main(String[] args) {
        try{
            var obj = new Object();
            obj = null;
            obj.toString();
        }catch(Exception ex){
            //ex.printStackTrace();
            System.err.println("Bock Exception: " + ex);
        }finally{
            System.out.println("Block Finally!");
        }
    }
}
