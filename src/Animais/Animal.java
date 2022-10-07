package Animais;

abstract public class Animal {
    private String raca;
    private int anoNasc;
    private String porte;

    public Animal(String raca, int anoNasc, String porte) {
        this.raca = raca;
        this.anoNasc = anoNasc;
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    abstract public int idade();

}
