package Nivell1_ex3;

public class App {
    public static void main(String[] args) {
        try{
            String[] sArray = new String[2];
            sArray[0] = "dos";
            sArray[1] = "valors";
            sArray[2] = "mes no ;)";
        }catch(ArrayIndexOutOfBoundsException ex){
            //ex.printStackTrace();
            System.err.println("Bock ArrayIndexOutOfBoundsException: " + ex);
        }finally{
            System.out.println("Block Finally!");
        }
    }
}
