public class NumeroPrimo {  
    public static void main(String[] args) {
        System.out.println("Até o número 1000 terá os seguintes números primos: ");
            for(int n = 2; n <= 1000; n++) { 
                boolean primo = true; 
                for(int p = 2; p < n; p++) { 
                if(n % p == 0) { primo = false;
                }         
            } 
            if(primo) {
            System.out.println(n);       
            }     
        }          
    } 
}