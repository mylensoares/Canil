package Animais;

import java.time.LocalDate;

public class Gato extends Animal {
    private String cor_do_pelo;

    public Gato(String raca, int anoNasc, String porte, String cor_do_pelo, boolean adotado, String nome, int codigo) {
        super(raca, anoNasc, porte, adotado, nome, codigo, "Gato");
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
        return (getAnoNasc() - ano_at) * 2;
    }
}
