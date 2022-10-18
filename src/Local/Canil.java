package Local;

import java.util.ArrayList;
import java.util.Scanner;

import Animais.Cachorro;
import Animais.Gato;

public class Canil {
    Scanner leia = new Scanner(System.in);
    int escolha = 0;
    private ArrayList<Gato> gatos = new ArrayList<>();
    private ArrayList<Cachorro> cachorros = new ArrayList<>();

    public void Iniciarlizar(ArrayList<Gato> gatos, ArrayList<Cachorro> cachorros) {
        this.gatos = gatos;
        this.cachorros = cachorros;
        atendimento();
    }

    public void atendimento() {

        System.out.println("Seja bem vindo ao Canil OO \n");
        System.out.println("Adotando para ser mais feliz.");

        menuBasic();

    }

    private void menuBasic() {

        while (escolha != 9) {
            System.out.println("\nEscolha uma das opções abaixo");
            System.out.println("|1| Sessão de gatos");
            System.out.println("|2| Sessão de cachorros");
            System.out.println("|9| Fechar programa");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    menuCat();
                    break;
                case 2:
                    menuDog();
                    break;
                case 9:
                    System.out.println("Até mais");
                    break;
            }
        }

    }

    // sessão do gato
    private void menuCat() {
        System.out.println("|1| Listar todos os gatos disponiveis para adoção");
        System.out.println("|2| Listar todos os gatos adotados");
        System.out.println("|3| Cadastrar um novo gato no Canil OO");
        escolha = leia.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("\nGatos disponiveis para adoção: ");
                listarGatos(filtrarGato(false, gatos));
                break;
            case 2:
                System.out.println("\nGatos que já possuem um lar: ");

                listarGatos(filtrarGato(true, gatos));

                break;
            case 3:
                cadastrarGato();
                break;

        }

    }

    private ArrayList<Gato> filtrarGato(boolean adotado, ArrayList<Gato> gatos) {
        final ArrayList<Gato> gatosFiltrado = new ArrayList<>();
        if (adotado) {
            for (Gato gato : gatos) {
                if (gato.getAdotado()) {
                    gatosFiltrado.add(gato);
                }

            }

        } else {
            for (Gato gato : gatos) {
                if (!gato.getAdotado()) {
                    gatosFiltrado.add(gato);
                }

            }
        }
        return gatosFiltrado;

    }

    private void listarGatos(ArrayList<Gato> gatos) {
        int cont = 1;
        if (!gatos.isEmpty()) {
            for (Gato gato : gatos) {
                System.out.println("[" + cont + "] " + gato.getNome());
                cont++;
            }
        } else {
            System.out.println("Nenhum registro foi encontrado");
        }
    }

    private void cadastrarGato() {
        String raca, porte, cor_do_pelo, nome;
        int anoNasc = 0;
        boolean adotado = false;

        System.out.println("Cadastro: \n ");

        System.out.println("Nome do gat(o)");
        nome = leia.next();
        System.out.println("Raça do gat(o)");
        raca = leia.next();
        System.out.println("Porte do gat(o)");
        porte = leia.next();
        System.out.println("Cor do pelo do gat(o)");
        cor_do_pelo = leia.next();
        System.out.println("Ano de nascimento do gat(o)");
        anoNasc = leia.nextInt();

        if (nome.isEmpty() || raca.isEmpty() || porte.isEmpty() || cor_do_pelo.isEmpty() || anoNasc == 0) {
            System.out.println("Erro ao cadastrar o gato, por favor verifique os dados inseridos e tente novamente.");
        } else {
            gatos.add(new Gato(raca, anoNasc, porte, cor_do_pelo, adotado, nome));
            System.out.println("Gato cadastrado com sucesso");
        }

    }
    // sessão do cachorro

    private void menuDog() {
        System.out.println("|1| Listar todos os cachorros disponiveis para adoção");
        System.out.println("|2| Listar todos os cachorros adotados");
        System.out.println("|3| Cadastar um novo cachorro no Canil OO");
        escolha = leia.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("\nCachorros disponiveis para adoção: ");

                listarCachorro(filtrarCachorro(false, cachorros));
                break;
            case 2:
                System.out.println("\nCachorros que já possuem um lar: ");

                listarCachorro(filtrarCachorro(true, cachorros));

                break;
            case 3:

                break;

        }

    }

    private ArrayList<Cachorro> filtrarCachorro(boolean adotado, ArrayList<Cachorro> cachorros) {
        final ArrayList<Cachorro> cachorrosFitrado = new ArrayList<>();
        if (adotado) {
            for (Cachorro cachorro : cachorros) {
                if (cachorro.getAdotado()) {
                    cachorrosFitrado.add(cachorro);
                }

            }

        } else {
            for (Cachorro cachorro : cachorros) {
                if (!cachorro.getAdotado()) {
                    cachorrosFitrado.add(cachorro);
                }

            }
        }
        return cachorrosFitrado;
    }

    private void listarCachorro(ArrayList<Cachorro> cachorros) {
        int cont = 1;
        if (!cachorros.isEmpty()) {
            for (Cachorro cachorro : cachorros) {
                System.out.println("[" + cont + "] " + cachorro.getNome());
                cont++;
            }
        } else {
            System.out.println("Nenhum registro foi encontrado");
        }
    }
}
