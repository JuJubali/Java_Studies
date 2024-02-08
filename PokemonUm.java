public public static void main (String args[]){
    Pokemon p1 = new Pokemon ();
    Pokemon p2 = new Pokemon ("Pokemon X",5,5,5);
    System.out.println(p1.getNome())
    System.out.println(p2.getNome())
   
    p2.setNome("pikachu")
    p2.setEnergia(10)

    System.out.println(p2.getNome()+" tem "+ p2.getEnergia()+ " de energia "+ p2.getFome()+" fome");
}
