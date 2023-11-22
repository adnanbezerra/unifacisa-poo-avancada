package individual;

import java.util.ArrayList;

public class GerenciadorDespesas {
  private ArrayList<Despesa> despesas;

  public GerenciadorDespesas() {
    this.despesas = new ArrayList<>();
  }

  public void adicionarDespesa(Despesa novaDespesa) {
    this.despesas.add(novaDespesa);
  }

  public void removerDespesa(String despesaARemover) {
    int index = -1;

    for (Despesa iterating : despesas) {
      if (iterating.getNome().equals(despesaARemover.toLowerCase())) {
        index = despesas.indexOf(iterating);
      }
    }

    if (index > -1) {
      this.despesas.remove(index);
    }
  }

  public void limparDespesas() {
    this.despesas = new ArrayList<>();
  }

  public double calcularCustoMensal() {
    double resultado = 0;

    for (Despesa despesa : despesas) {
      resultado += despesa.getValor() * despesa.getRecorrencia();
    }

    return resultado;
  }

  public Despesa getMaiorDespesa() {
    Despesa maiorDespesa = new Despesa("", 0, 0);
    double maiorValor = Integer.MIN_VALUE;

    for (Despesa despesa : despesas) {
      double valorAtual = despesa.getValor() * despesa.getRecorrencia();
      if (valorAtual > maiorValor) {
        maiorValor = valorAtual;
        maiorDespesa = despesa;
      }
    }

    return maiorDespesa;
  }

  public String descreveDespesas() {
    StringBuilder builder = new StringBuilder();

    for (Despesa despesa : despesas) {
      if (despesas.indexOf(despesa) == despesas.size() - 1) {
        builder.append(despesa.toString());
      } else {
        builder.append(despesa.toString() + ";\n");
      }
    }

    return builder.toString();
  }
}
