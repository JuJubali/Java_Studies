public import java.util.scanner;

public class LivroDeNotas {
  private String nomeDoCurso{

    //Método de acesso -> getter
    public String getNomeDoCurso () {
      return nomeDoCurso;
    }
    //Método modificador -> Setter
    public void setNomeDoAtributo (String nomeNovo) {
      this.nomeDoCurso = nomeNovo;
    }
  }

  public void exibirMensagem (String nomeDoCurso) {
    
    /*public void exibirMensagem () {
      System.out.println ("Bem-vindo ao livro de nota!");*/

        //Declarar um livro
    LivroDeNotas livro1;
    //Instanciar o livro 1
    livro1 = new LivroDeNotas();

    //Declarar e instanciar um livro

    LivroDeNotas livro2 = new LivroDeNotas(); //objeto
      //Main sempre é publico porq JVE precisa ver ele
      //Privado - só a classe vê
      Livro1.exibirMensagem("Ciencia da computação"); //Args dentro do ()
      Livro2.exibirMensagem("Sistemas de informação");

    //Livro1.nome = "Matematica";
    //Não reconhece nome porq é private
      Livro1.setNomeDoCurso("Matematica");
      System.out.println(this.getNomeDoCurso()); //Não sabe o que é, está encapsulado e não pode acessar

      LivroDeNotas livro2= new LivroDeNotas();
      //Instanciar
      Scanner.scanner = new Scanner(System.in);
      System.out.pritnln("Qual é a matéria do livro 1?");
      Strig.nome = scanner.next();
      livro1.setNomeDoCurso(nome);
      System.out.println(livro1.getNomeDoCurso());
      livro1.exibirMensagem(); //Não tem parametro, recebe o atributo

      LivroDeNotas livr2 = new LivroDeNotas();
      Scanner.scanner = new Scanner(System.in);
      System.out.println("Qual é a matériado livro 2");
      String.nome = scanner.next();
      Sysyrm.out.println(getNomeDoCurso);
      livro2.exibirMensagem();

      scanner.close();
  
      Livro2.setNomeDoCurso("Física");
      System.out.println(Livro2.getNomeCurso());
    //Null é o zero da string. Boolean seria false 
    }
  }
} LivroDeNotas {
    
}
