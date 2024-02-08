import javax.swing.JOptionPane;

public class Main {
  
  public static void main(String args[]) {
    //Declarar as variáveis
    int idadeEmAnos, idadeEmDias;
    idadeEmAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade em anos: "));
    //Processamento 
    idadeEmDias = idadeEmAnos * 365;
    //Saída
    JOptionPane.showInputDialog(null, idadeEmAnos + " anos correspondem a " + idadeEmDias+ " dias");
      
  }
    
}