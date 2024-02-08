import java.util.Scanner;


public class Indice {

    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de UCs");
		while (leitor.hasNext()) {
            //Declarando o valor da nota
			int M = leitor.nextInt();
            //Declarando o valor da Carga Horária
			int totalC = 0;
			int totalNC = 0;
			for (int i = 0; i < M; i++){
            System.out.println("Digite sua Nota da UC: "+(i+1));
            double N = leitor.nextInt();
            System.out.println("Digite sua Carga Horaria da UC: "+(i+1));
            double C = leitor.nextInt();
            totalNC += N * C;
            totalC += C;
			}
			double resultado = totalNC / (totalC * 100.0);
			System.out.println(String.format("%.4f",resultado));
		}
	}
    
}
