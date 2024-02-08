import java.util.Scanner;
import java.util.ArrayList;

class Ira {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a quantidade de UCs");
    int M = scan.nextInt();

    ArrayList<Double> arrayNotas = new ArrayList<>();
    ArrayList<Integer> arrayCargaHoraria = new ArrayList<>();

    for(int i = 0; i < M; i++) {
        System.out.println("Digite sua nota na Uc de numero: "+(i+1));
        var nota = scan.nextDouble();
        arrayNotas.add(nota);

        System.out.println("Digite sua carga horaria na Uc: "+(i+1));
        var cargaHoraria = scan.nextInt();
        arrayCargaHoraria.add(cargaHoraria);

    }

    int cargaHorariaTotal = 0;
    for (Integer horarios : arrayCargaHoraria) {
        cargaHorariaTotal += horarios.intValue();
    }

    double notasTotal = 0;
    for (double notas : arrayNotas) {
        notasTotal += notas;
    }

    System.out.println("Final IRA: "+ cargaHorariaTotal * notasTotal / (cargaHorariaTotal) * 100);
}
}