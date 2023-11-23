package individualdois;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Grupo:
 * - Adnan Medeiros
 * - Caio Henrique Medeiros 
 */

public class Main {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Scanner sc = new Scanner(System.in);
    agenda.adicionarContato(81991617, "Adnan");
    agenda.adicionarContato(81869199, "Caio");
    agenda.adicionarContato(18293811, "Adnan");

    while (true) {
      imprimeComandos();
      int comando = Integer.parseInt(sc.nextLine());

      if (comando == 6) {
        break;
      } else if (comando == 1) {
        // Adicionar contato
        System.out.println("Digite o nome do contato:");
        String nome = sc.nextLine();
        System.out.println("Insira o número: ");
        int numero = Integer.parseInt(sc.nextLine());

        agenda.adicionarContato(numero, nome);
        System.out.println("Caso o número ainda não exista, o contato foi adicionado");

      } else if (comando == 2) {
        // Remover contato
        System.out.println("Insira o nome do número a ser removido:");
        int numero = Integer.parseInt(sc.nextLine());

        agenda.removerContato(numero);
        System.out.println("Caso o número exista, o contato foi removido.");

      } else if (comando == 3) {
        // Apresentar números
        System.out.println("Digite o nome de quem você quer pesquisar:");
        String nome = sc.nextLine();
        
        HashSet<Integer> numeros = agenda.apresentarNumeros(nome);

        System.out.println("Números:");
        System.out.println(numeros.toString());

      } else if (comando == 4) {
        // Listar contatos
        System.out.println("Lista de contatos:");
        String lista = agenda.listarContatos();

        if(!lista.equals("")) {
          System.out.println(agenda.listarContatos());
        } else {
          System.out.println("Nenhum contato cadastrado.");
        }
        

      } else if (comando == 5) {
        // Limpar agenda
        System.out.println("Confirma limpar agenda? (y/N)");
        String confirma = sc.nextLine();

        if (confirma.equals("y") || confirma.equals("Y")) {
          agenda.limparAgenda();
          System.out.println("Agenda foi limpa.");
        } else {
          System.out.println("Operação abortada.");
        }

      } else {
        System.out.println("Insira algum comando válido!");
      }

      System.out.println("Aperte enter para continuar");
      sc.nextLine();
    }

    System.out.println("Até mais ver!");
    sc.close();
  }

  public static void imprimeComandos() {
    System.out.println("Bem-vindo à agenda :D");
    System.out.println("Digite o código do comando:");
    System.out.println("1. Adicionar contato");
    System.out.println("2. Remover contato");
    System.out.println("3. Apresentar números");
    System.out.println("4. Listar contatos");
    System.out.println("5. Limpar agenda");
    System.out.println("6. Sair");
  }

}
