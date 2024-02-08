import javax.swing.JOptionPane;

public class IdadeOutput {

    public static void main(String[] args) {
        int anoNascimento, anoAtual, idadePessoa;
        int aniversarioAnual;
        // Ver ano de nascimento
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento aqui: "));
        // Ver a idade atual da pessoa
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o ano atual: "));
        // Ver se a pessoa já fez aniversário
        int i = JOptionPane.showConfirmDialog(null ,"Você já aniversário nesse ano?",
          "Pergunta",JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION ) {
                aniverarioAnual = 0;
            }
            else{
                aniverarioAnual = 1;
            }
    }
}