package Local;

import java.util.Scanner;

public class Canil {
    Scanner leia = new Scanner(System.in);

    public void atendimento() {

        System.out.println("Seja bem vindo ao Canil OO \n");
        System.out.println("Adotando para ser mais feliz. \n");

        menuBasic();

    }

    private void menuBasic() {
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("Escolha uma das opçãoes abaixo");
            System.out.println("|1| Sessão de gatos");
            System.out.println("|2| Sessão de cachorros");
            System.out.println("|3| Fechar programa");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    menuCat(escolha);
                    break;
                case 2:
                    menuDog(escolha);
                    break;
                case 3:
                    System.out.println("Até mais");
                    break;
            }
        }

    }

    private void menuCat(int escolha) {
        System.out.println("|1| Listar todos os gatos disponiveis para adoção");
        System.out.println("|2| Listar todos os gatos adotados");
        System.out.println("|3| Adicionar um novo gato ao Canil OO");
        switch (escolha) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;

        }

    }

    private void menuDog(int escolha) {
        System.out.println("|1| Listar todos os cachorros disponiveis para adoção");
        System.out.println("|2| Listar todos os cachorros adotados");
        System.out.println("|3| Adicionar um novo cachorro ao Canil OO");
        switch (escolha) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;

        }

    }
}
