package exceptions;

public class Conta {
  private double saldo;
  private double limite;
  
  public Conta(double saldo, double limite) {
    this.saldo = saldo;
    this.limite = limite;
  }

  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    if(this.saldo > valor) {
      this.saldo -= valor;

    } else {
      throw new IllegalArgumentException("Saldo indisponível!");
      
    }

  }

  public void transferirPara(Conta destino, double valor) {
    if(this.saldo > valor) {
      destino.depositar(valor);
      this.sacar(valor);

    } else {
      throw new IllegalArgumentException("Saldo indisponível!");

    }

  }

  public double getLimite() {
    return limite;
  }
  
}
