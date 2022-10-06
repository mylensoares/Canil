package Animais;

public class Cachorro extends Animal{
    // private String cor_do_pelo;
  
      public Cachorro(String raca, int idade, String porte) {
        super(raca, idade, porte);
    }

    public int cul_idade(int data){
          int ano_at = 2022;
          return ano_at - (data*3);
      }
}
