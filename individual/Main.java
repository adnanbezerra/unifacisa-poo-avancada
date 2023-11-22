package individual;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    GerenciadorDespesas gerenciadorDespesas = new GerenciadorDespesas();
    System.out.println("Bem-vindo ao gerenciador de despesas! :D");
    Scanner sc = new Scanner(System.in);
    final String SEM_CADASTROS = "Não há despesas cadastradas.";

    Despesa despitador = new Despesa("Despitador", 220.10, 1);
    gerenciadorDespesas.adicionarDespesa(despitador);

    while (true) {
      System.out.println("Diga o código do comando que você quer: ");
      imprimeComandos();
      int comando = Integer.parseInt(sc.nextLine());

      if (comando == 7) {
        break;
      } else if (comando == 1) {
        // Adiciona uma despesa
        System.out.println("Digite o nome da despesa: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor da despesa (Double positivo): ");
        double valor = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a recorrência da despesa (int positivo): ");
        int recorrencia = Integer.parseInt(sc.nextLine());

        Despesa novaDespesa = new Despesa(nome.toLowerCase(), valor, recorrencia);
        gerenciadorDespesas.adicionarDespesa(novaDespesa);

        System.out.println("Despesa adicionada");

      } else if (comando == 2) {
        // Remove uma despesa
        System.out.println("Digite o nome da despesa: ");
        String nome = sc.nextLine();
        System.out.println("Confirma deletar esta despesa? (y/N)");
        String confirmacao = sc.nextLine();

        if (confirmacao.equals("y") || confirmacao.equals("Y")) {
          gerenciadorDespesas.removerDespesa(nome);
        }

        System.out.println("Se a despesa com esse nome existir, ela foi deletada.");

      } else if (comando == 3) {
        // Limpar as despesas
        System.out.println("Confirma deletar todas as despesas? (y/N)");
        String confirmacao = sc.nextLine();

        if (confirmacao.equals("y") || confirmacao.equals("Y")) {
          gerenciadorDespesas.limparDespesas();
        }
        System.out.println("Despesas limpas.");

      } else if (comando == 4) {
        // Calcula custo mensal
        double gastoMensal = gerenciadorDespesas.calcularCustoMensal();

        if (gastoMensal != 0) {
          System.out.printf("O gasto mensal total é igual a: R$ %.2f\n", gerenciadorDespesas.calcularCustoMensal());
        } else {
          System.out.println(SEM_CADASTROS);
        }

      } else if (comando == 5) {
        // Imprime a maior despesa
        Despesa maiorDespesa = gerenciadorDespesas.getMaiorDespesa();

        if (!maiorDespesa.toString().equals(new Despesa("", 0, 0).toString())) {
          System.out.println("A maior despesa é:\n" + gerenciadorDespesas.getMaiorDespesa().toString());
        } else {
          System.out.println(SEM_CADASTROS);
        }

      } else if (comando == 6) {
        // Imprimir despesas
        System.out.println("Despesas mensais:");
        String despesas = gerenciadorDespesas.descreveDespesas();

        if (!despesas.equals("")) {
          System.out.println(despesas);
        } else {
          System.out.println(SEM_CADASTROS);
        }
      }

      System.out.println("Aperte Enter para prosseguir");
      sc.nextLine();
    }

    System.out.println("Até mais ver!");
    sc.close();
  }

  public static void imprimeComandos() {
    System.out.println("1. Adicionar despesa");
    System.out.println("2. Remover despesa");
    System.out.println("3. Limpar despesas");
    System.out.println("4. Calcular custo mensal");
    System.out.println("5. Imprimir a maior despesa");
    System.out.println("6. Imprimir todas as despesas");
    System.out.println("7. Sair");
  }
}
