package exceptions;

public class Main {
    public static void main(String[] args) {
/*

        try{
            throwException();
        }catch(RuntimeException ex){
            System.out.println(ex.getCause());
            ex.printStackTrace();
        }
*/

    /*    int[] ints = new int[0];
        ints[1] = 1;*/


        throwException();

    }
    private static void throwException(){
        throw new RuntimeException("Błąd");
    }



}
