package Nivell1_ex1;
public class App {
    public static void main(String[] args) {
        try{
            Integer.parseInt("de string a int");
        }catch(Exception ex){
            //ex.printStackTrace();
            System.err.println("Bock Exception: " + ex);
        }finally{
            System.out.println("Block Finally!");
        }
    }
}
