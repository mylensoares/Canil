package Pessoas;
import java.util.ArrayList;
import Animais.Animal;

public class Adotante extends Pessoa {
	private ArrayList<Animal> animais = new ArrayList<>();

	public Adotante(String nome, String cpf, String endereco) {
		super(nome, cpf, endereco);
	}

	
	

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void adicionarAnimais(Animal animal) {
		this.animais.add(animal);
	}
	
	public void removerAnimais(Animal animal) {
		this.animais.remove(animal);
	}
	
	public void editarAnimais(Animal animal) {
			for (int i = 0; i < this.animais.size(); i++) {
				
			}
	}
}
			