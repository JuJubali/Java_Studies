import javax.swing.JOptionPane;

public class Salario {

  public static void main(String args[]) {
    // Declarar as variáveis
    Double salarioAtual;
    salarioAtual = Double.Parsedouble(JOptionPane.showInputDialog("Digite o valor atual"));
    // salarioVelho = Double.parsedouble(JOptionPane.showInputDialog("Digite aqui o
    // seu saláriio atual: "));
    salarioReajuste = Double.parsedouble(JOptionPane.showInputDialog("Digite aqui a porcentagem do reajuste do seu salário: "));
    double salarioNovo = 15 / 1000 + salarioAtual;

    JOptionPane.showMessageDialog(null, "O novo salário é igual a: " + salarioNovo);

  }

}