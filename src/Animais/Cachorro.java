package Animais;

import java.time.LocalDate;

public class Cachorro extends Animal {
  private String cor_do_pelo;

  public Cachorro(String raca, int anoNasc, String porte, String cor_do_pelo, boolean adotado) {
    super(raca, anoNasc, porte, adotado);
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
    return (ano_at - getAnoNasc()) * 3;
  }
}
