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
        
        while (escolha != 3) {
            System.out.println("\nEscolha uma das opções abaixo");
            System.out.println("|1| Sessão de gatos");
            System.out.println("|2| Sessão de cachorros");
            System.out.println("|3| Fechar programa");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    menuCat();
                    break;
                case 2:
                    menuDog();
                    break;
                case 3:
                    System.out.println("Até mais");
                    break;
            }
        }

    }

    private void menuCat() {
        System.out.println("|1| Listar todos os gatos disponiveis para adoção");
        System.out.println("|2| Listar todos os gatos adotados");
        System.out.println("|3| Adicionar um novo gato ao Canil OO");
        escolha = leia.nextInt();
       
        switch (escolha) {
            case 1:
                
                listarGatos(filtrarGato(false,gatos));
                break;
            case 2:
                
                listarGatos(filtrarGato(true, gatos));

                break;
            case 3:
                // adicioanr novo metodo para adotar um gato
                break;

        }

    }

    private ArrayList<Gato>filtrarGato(boolean adotado, ArrayList<Gato> gatos ){
        final  ArrayList<Gato> gatosFiltrado =  new ArrayList<>();
        if(adotado){
            for (Gato gato : gatos) {
                if(gato.getAdotado()){
                    gatosFiltrado.add(gato);
                }
                
            }

        }
        else{
            for (Gato gato : gatos) {
                if(!gato.getAdotado()){
                    gatosFiltrado.add(gato);
                }
                
            }
        }
        return gatosFiltrado;
       
    }
    private void listarGatos(ArrayList<Gato> gatos ){
        System.out.println("Gatos disponiveis: \n");
        int cont = 1;
        if (!gatos.isEmpty()){
            for (Gato gato : gatos) {
                    System.out.println("[" + cont + "] " + gato.getNome());
                    cont++;
                }
            }
            else{
                System.out.println("Nenhum gato disponível no momento");
            }
    }

    private void menuDog() {
        System.out.println("|1| Listar todos os cachorros disponiveis para adoção");
        System.out.println("|2| Listar todos os cachorros adotados");
        System.out.println("|3| Adicionar um novo cachorro ao Canil OO");
        escolha = leia.nextInt();
        switch (escolha) {
            case 1:
            
                break;
            case 2:

                break;
            case 3:

                break;

        }

    }
    private ArrayList<Cachorro>filtrarCachorro(boolean adotado, ArrayList<Cachorro> cachorros ){
        final  ArrayList<Cachorro> cachorrosFitrado =  new ArrayList<>();
        if(adotado){
            for (Cachorro cachorro : cachorros) {
                if(cachorro.getAdotado()){
                    cachorrosFitrado.add(cachorro);
                }
                
            }

        }
        else{
            for (Cachorro cachorro : cachorros) {
                if(!cachorro.getAdotado()){
                    cachorrosFitrado.add(cachorro);
                }
                
            }
        }
        return cachorrosFitrado;
    }


 private void listarCachorro(ArrayList<Cachorro> cachorros ){
        System.out.println("C: \n");
        int cont = 1;
        if (!gatos.isEmpty()){
            for (Gato gato : gatos) {
                    System.out.println("[" + cont + "] " + gato.getNome());
                    cont++;
                }
            }
            else{
                System.out.println("Nenhum gato disponível no momento");
            }
    }
}
