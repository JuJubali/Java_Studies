public public class Pokemon{
    private String nome;
    private int energia;
    private int sono;
    private int fome;
    //redefinir um construtor com todas as informações
    public Pokemon (String nome, int energia, int sono, int fome) {
        this.nome=nome;
        this.energia=energia;
        this.sono=sono;
        this.fome=fome;

        //sobrecarga de construtor - padrão
    }
    public Pokemon() {
        this.nome=""; //tbm pode ser this.nome=null;
        this.sono=0;
        this.energia=0;
        this.fome=0;
    }
    //metodo de acesso
    public String getNome () {
        return this.nome ;
    }
    public int getSono () {
    return this.sono;
    }
    public int getEnergia () {
        return this.energia;
    }
    public int getFome () {
        return this.fome;
    }
    //metodos modificadores - setters
    public void setNome (String nome) {
        this.nome=nome;
    }
    public void setEnergia (int energia) {
        this.energia=energia;
    }
    public void setSono(int sono) {
        this.sono=sono;
    }
    public void setFome (int fome) {
        this.fome=fome;
    }
    public void  cacar () {
      if (this.energia>=2) {
        System.out.println(this.getNome()+ "está caçando");
        //this.energia = this.energia -2/
        this.energia-=2;
        this.sono=Math.min(this.sono+1,10);
        this.fome=Math.min(this.fome+1,10);
      }
    else {
      System.out.println(this.nome+" esta exaurido...");
      this.sono=Math.min(this.sono+1,10);
      this.fome=Math.min(this.sono+1,10);
      }
     
    }
    public void comer () {
        this.fome--;      
    }
    public void dormir () {
        this.sono--;
        this.energia++;
    }

} Pokemon {
    
}
