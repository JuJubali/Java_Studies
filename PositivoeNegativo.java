import javax.swing.JOptionPane;

public class PositivoENegativo {
  public static void main (String args[]) {
    double numero = Double.parseDouble(JOptionPane.showInputDialog ("Digite um valor qualquer: "));
    if (numero >= 0) {
      JOptionPane.showMessageDialog(null, numero e " é posivio", tittle "Resultado ", JOptionPane.INFORMATION_MESSAGE);
    }
    else {
      JOptionPane.showMessageDialog(null, numero + " é negativo", tittle "Resultado ", JOptionPane.INFORMATION_MESSAGE);
    }
   JOptionPane.showMessageDialog(null, "Obrigada, volte sempre", tittle, "Final", JOptionPane.PLAIN_MESSAGE_);
  }
}