package Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Animais.Cachorro;
import Animais.Gato;
import Pessoas.Adotante;
import Processos.Adocao;

public class Canil {
    Scanner leia = new Scanner(System.in);
    int escolha = 0;
    private ArrayList<Gato> gatos = new ArrayList<>();
    private ArrayList<Cachorro> cachorros = new ArrayList<>();
    private ArrayList<Adocao> Adocoes = new ArrayList<>();

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
        escolha = 0;
        while (escolha != 9) {
            System.out.println("\nEscolha uma das opções abaixo");
            System.out.println("|1| Sessão de gatos");
            System.out.println("|2| Sessão de cachorros");
            System.out.println("|3| Sessão de adoção");
            System.out.println("|9| Fechar programa");
            System.out.print("Sua opção: ");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    menuCat();
                    break;
                case 2:
                    menuDog();
                    break;
                case 3:
                    menuAdocao();
                    break;
                case 9:
                    System.out.println("Até mais");
                    break;
            }
        }

    }

    // sessão do gato
    private void menuCat() {
        escolha = 0;
        while (escolha != 4) {
            System.out.println("");
            System.out.println("|1| Listar todos os gatos disponiveis para adoção");
            System.out.println("|2| Listar todos os gatos adotados");
            System.out.println("|3| Cadastrar um novo gato no Canil OO");
            System.out.println("|4| Retornar");
            System.out.print("Sua opção: ");
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
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida");

            }
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
        int anoNasc = 0, codigo = 0;
        boolean adotado = false;

        System.out.println("Cadastro: \n ");

        System.out.print("Nome do gat(o): ");
        nome = cadastros().nextLine();
        System.out.print("Raça do gat(o): ");
        raca = cadastros().nextLine();
        System.out.print("Porte do gat(o): ");
        porte = cadastros().nextLine();
        System.out.print("Cor do pelo do gat(o): ");
        cor_do_pelo = cadastros().nextLine();
        System.out.print("Ano de nascimento do gat(o): ");
        anoNasc = cadastros().nextInt();
        System.out.print("Codigo do gat(o): ");
        codigo = cadastros().nextInt();

        if (nome.isEmpty() || raca.isEmpty() || porte.isEmpty() || cor_do_pelo.isEmpty() || anoNasc == 0
                || codigo == 0) {
            System.out.println("Erro ao cadastrar o gato, por favor verifique os dados inseridos e tente novamente.");
        } else {
            gatos.add(new Gato(raca, anoNasc, porte, cor_do_pelo, adotado, nome, codigo));
            System.out.println("Gato cadastrado com sucesso");
        }

    }

    private Gato pesquisarGato() {

        while (true) {
            System.out.print("Digite o codigo do Gato desejado: ");
            int codigo = leia.nextInt();
            for (Gato gato : gatos) {
                if (gato.getCodigo() == codigo && !gato.getAdotado()) {
                    gato.setAdotado(true);
                    return gato;
                }

                // return;
            }
            System.out.println("nenhum dado encontrado");
        }
    }

    // sessão do cachorro

    private void menuDog() {
        escolha = 0;
        while (escolha != 4) {
            System.out.println("");
            System.out.println("|1| Listar todos os cachorros disponiveis para adoção");
            System.out.println("|2| Listar todos os cachorros adotados");
            System.out.println("|3| Cadastar um novo cachorro no Canil OO");
            System.out.println("|4| Retornar");
            System.out.print("Sua opção: ");
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
                    cadastrarCachorro();

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opção Inválida");

            }
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

    private void cadastrarCachorro() {
        String raca, porte, cor_do_pelo, nome;
        int anoNasc = 0, codigo = 0;
        boolean adotado = false;

        System.out.println("Cadastro: \n ");

        System.out.print("Nome do cachorro:");
        nome = cadastros().nextLine();
        System.out.print("Raça do cachorro: ");
        raca = cadastros().nextLine();
        System.out.print("Porte do cachorro: ");
        porte = cadastros().nextLine();
        System.out.print("Cor do pelo do cachorro: ");
        cor_do_pelo = cadastros().nextLine();
        System.out.print("Ano de nascimento do cachorro: ");
        anoNasc = cadastros().nextInt();
        System.out.print("Codigo do cachorro: ");
        codigo = cadastros().nextInt();

        if (nome.isEmpty() || raca.isEmpty() || porte.isEmpty() || cor_do_pelo.isEmpty() || anoNasc == 0
                || codigo == 0) {
            System.out
                    .println("Erro ao cadastrar o cachorro, por favor verifique os dados inseridos e tente novamente.");
        } else {
            cachorros.add(new Cachorro(raca, anoNasc, porte, cor_do_pelo, adotado, nome, codigo));
            System.out.println("Cachorro cadastrado com sucesso");
        }

    }

    private Cachorro pesquisarCachorro() {
        System.out.print("Digite o codigo do Cachorro desejado: ");
        while (true) {

            int codigo = leia.nextInt();
            for (Cachorro cachorro : cachorros) {
                if (cachorro.getCodigo() == codigo && !cachorro.getAdotado()) {
                    cachorro.setAdotado(true);
                    return cachorro;
                }

            }
            System.out.println("nenhum dado encontrado");
        }
    }

    private void menuAdocao() {
        escolha = 0;
        while (escolha != 3) {
            System.out.println("");
            System.out.println("|1| Historico de adoções");
            System.out.println("|2| Adotar um companheiro");
            System.out.println("|3| Retornar");
            System.out.print("Sua opção: ");
            escolha = leia.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nLista de adoções: \n");
                    listarAdocoes();
                    break;
                case 2:
                    System.out.println("\nAdoção: ");
                    adotar();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção Inválida");

            }
        }
    }

    private void listarAdocoes() {

        if (!Adocoes.isEmpty()) {
            for (Adocao adocao : Adocoes) {
                System.out.println("|Data :" + adocao.getData() + " |Adotante : "
                        + adocao.getAdotante().getNome() + " |Tipo do animal: " + adocao.getAnimal().getTipo()
                        + " |Nome do animal: " + adocao.getAnimal().getNome());

            }
        } else {
            System.out.println("Nenhum registro foi encontrado");
        }
    }

    private void adotar() {
        escolha = 0;
        while (escolha != 3) {
            Adotante adotante = cadastroAdotante();
            String data = String.valueOf(LocalDate.now().getDayOfMonth()) + "/"
                    + String.valueOf(LocalDate.now().getMonthValue() + "/" + String.valueOf(LocalDate.now().getYear()));
            System.out.println("Preencha os dados a seguir do adotante, para finalizar a adoção");
            if (adotante != null) {
                System.out.println("");
                System.out.println("Como seu companheiro, o que deseja ?");
                System.out.println("|1| Gato");
                System.out.println("|2| Cachorro");
                System.out.println("|3| Retornar");
                System.out.print("Sua opção: ");
                escolha = leia.nextInt();
                switch (escolha) {
                    case 1:
                        Gato gatoAdotado = pesquisarGato();

                        Adocoes.add(new Adocao(gatoAdotado, adotante, data));

                        return;
                    case 2:
                        Cachorro cachorroAdotado = pesquisarCachorro();
                        Adocoes.add(new Adocao(cachorroAdotado, adotante, data));
                        System.out.println("Adoção bem sucedida");

                        return;
                    case 3:
                        menuAdocao();
                    default:
                        System.out.println("Opção Inválida");

                }

            } else {

                return;
            }
        }

    }

    private Scanner cadastros() {
        return new Scanner(System.in);
    }

    private Adotante cadastroAdotante() {

        String endereco, nome, cpf;

        System.out.print("Nome do cliente: ");
        nome = cadastros().nextLine();

        System.out.print("CPF do cliente: ");
        cpf = cadastros().nextLine();

        System.out.print("endereco do cliente: ");
        endereco = cadastros().nextLine();

        if (nome.isEmpty() || cpf.isEmpty() || endereco.isEmpty()) {
            System.out
                    .println("Erro ao cadastrar o cliente, por favor verifique os dados inseridos e tente novamente.");
            return null;
        } else {
            System.out.println("Cliente cadastrado com sucesso");
            return new Adotante(nome, cpf, endereco);

        }

    }
}