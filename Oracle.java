public class Oracle {
    public static void main (String args []) {
                int[] array = {10, 20, 30};
        int b = 0;
        try{
        System.out.println("1");
        int c = (array[3] / b);
        System.out.println("2");
        }
        catch(ArithmeticException ex){
        System.out.println("Excecao Aritmetica");
        }
        catch(ArrayIndexOutOfBoundsException ex){
        System.out.println(!"Indice de matriz fora dos limites");
        }
    }
}
