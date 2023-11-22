package individual;

public class Despesa {
  private String nome;
  private double valor;
  private int recorrencia;
  
  public Despesa(String nome, double valor, int recorrencia) {
    this.nome = nome.toLowerCase();
    this.valor = valor;
    this.recorrencia = recorrencia;
  }

  public String getNome() {
    return nome;
  }

  public double getValor() {
    return valor;
  }

  public int getRecorrencia() {
    return recorrencia;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void setRecorrencia(int recorrencia) {
    this.recorrencia = recorrencia;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + ", valor: R$" + this.valor + ", recorrência: " + this.recorrencia;
  }

}
