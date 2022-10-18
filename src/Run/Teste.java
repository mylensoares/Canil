package Run;

import java.util.ArrayList;

import Animais.Cachorro;
import Animais.Gato;
import Local.Canil;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Cachorro> cachorros = new ArrayList<>();
        // tem que cria a lista de gatos e cachorros com add
        gatos.add(new Gato("Persa", 2022, "Médio", "Preto", false, "Geraldo"));
        gatos.add(new Gato("Siamês", 2020, "Grande", "Branco", false, "Luiz"));
        gatos.add(new Gato("Maine Coon", 2018, "Pequeno", "Laranja", true, "Garfield"));
        gatos.add(new Gato("Angorá", 2020, "Pequeno", "Rajado", false, "Malhado"));
        gatos.add(new Gato("Ragdoll", 2021, "Grande", "Cinza", false, "Simpson"));

        cachorros.add(new Cachorro("Poodle", 2022, "Médio", "Preto", false, "Rick"));
        cachorros.add(new Cachorro("Pincher", 2017, "Pequeno", "Marrom", false, "Jaspy"));
        cachorros.add(new Cachorro("Akita", 2020, "Grande", "Branco", false, "Kira"));
        cachorros.add(new Cachorro("Beagle", 2019, "Médio", "Branco", false, "Kripto"));
        cachorros.add(new Cachorro("Chow Chow", 2021, "Grande", "Marrom", false, "Sasha"));

        Canil canil = new Canil();
        canil.Iniciarlizar(gatos, cachorros);
    }
}
