package Animais;

abstract public class Animal {
    private String nome;

    private Boolean adotado;
    private String raca;
    private int anoNasc;
    private String porte;
    private int codigo;
    private String tipo;

    public Animal(String raca, int anoNasc, String porte, Boolean adotado, String nome, int codigo, String tipo) {
        this.raca = raca;
        this.anoNasc = anoNasc;
        this.adotado = adotado;
        this.porte = porte;
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAdotado() {
        return adotado;
    }

    public void setAdotado(Boolean adotado) {
        this.adotado = adotado;
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
