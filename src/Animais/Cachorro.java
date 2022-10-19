package Animais;

import java.time.LocalDate;

public class Cachorro extends Animal {
  private String cor_do_pelo;

  public Cachorro(String raca, int anoNasc, String porte, String cor_do_pelo, boolean adotado, String name,
      int codigo) {
    super(raca, anoNasc, porte, adotado, name, codigo, "Cachorro");
    this.cor_do_pelo = cor_do_pelo;
  }

  public String getCorDoPelo() {
    return cor_do_pelo;
  }

  public void setCorDoPelo(String cor) {
    this.cor_do_pelo = cor;
  }

  @Override
  public int idade() {
    int ano_at = LocalDate.now().getYear();
    return (getAnoNasc() - ano_at) * 3;
  }
}
