package Run;

import java.util.ArrayList;

import Animais.Cachorro;
import Animais.Gato;
import Local.Canil;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Cachorro> cachorros = new ArrayList<>();

        gatos.add(new Gato("Persa", 2022, "Médio", "Preto", false, "Geraldo", 1));
        gatos.add(new Gato("Siamês", 2020, "Grande", "Branco", false, "Luiz", 2));
        gatos.add(new Gato("Maine Coon", 2018, "Pequeno", "Laranja", false, "Garfield", 3));
        gatos.add(new Gato("Angorá", 2020, "Pequeno", "Rajado", false, "Malhado", 4));
        gatos.add(new Gato("Ragdoll", 2021, "Grande", "Cinza", false, "Simpson", 5));

        cachorros.add(new Cachorro("Poodle", 2022, "Médio", "Preto", false, "Rick", 1));
        cachorros.add(new Cachorro("Pincher", 2017, "Pequeno", "Marrom", false, "Jaspy", 2));
        cachorros.add(new Cachorro("Akita", 2020, "Grande", "Branco", false, "Kira", 3));
        cachorros.add(new Cachorro("Beagle", 2019, "Médio", "Branco", false, "Kripto", 4));
        cachorros.add(new Cachorro("Chow Chow", 2021, "Grande", "Marrom", false, "Sasha", 5));

        Canil canil = new Canil();
        canil.Iniciarlizar(gatos, cachorros);
    }
}
