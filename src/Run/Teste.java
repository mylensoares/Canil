package Run;

import java.util.ArrayList;

import Animais.Cachorro;
import Animais.Gato;
import Local.Canil;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Cachorro> cachorros = new ArrayList<>();
        // tem que cria a lista de gatoas e cachorros com add
        Canil canil = new Canil();
        canil.Iniciarlizar(gatos, cachorros);
    }
}
