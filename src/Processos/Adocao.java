package Processos;
import Pessoas.Adotante;
import Animais.Animal;

public class Adocao{
    private Animal animal;
    private Adotante adotante;
    private String data;
    
    public Adocao(Animal animal, Adotante adotante, String data) {
        this.animal = animal;
        this.adotante = adotante;
        this.data = data;
    }
    
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public void adotar(){
        
    }
}
