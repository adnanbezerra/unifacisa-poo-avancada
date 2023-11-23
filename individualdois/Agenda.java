package individualdois;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Grupo:
 * - Adnan Medeiros
 * - Caio Medeiros
 */

public class Agenda {
  private HashMap<Integer, String> contatos;

  public Agenda() {
    this.contatos = new HashMap<>();
  }

  public void adicionarContato(int numero, String nome) {
    if (!this.contatos.containsKey(numero)) {
      this.contatos.put(numero, nome);
    }
  }

  public void removerContato(int numero) {
    this.contatos.remove(numero);
  }

  public String listarContatos() {
    StringBuilder resultado = new StringBuilder();

    for (String value : contatos.values()) {
      resultado.append(value + ";\n");
    }

    return resultado.toString();
  }

  public void limparAgenda() {
    this.contatos = new HashMap<>();
  }

  public HashSet<Integer> apresentarNumeros(String nome) {
    HashSet<Integer> resultado = new HashSet<>();

    for (var each : contatos.entrySet()) {
      if (each.getValue().equals(nome)) {
        resultado.add(each.getKey());
      }
    }

    return resultado;
  } 
}
