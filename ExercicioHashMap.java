import java.util.Scanner;
import java.util.HashMap;

class ExercicioHashMap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    System.out.println("Conta a boa");
    String entrada = sc.nextLine();
    String[] palavras = entrada.split(" ");

    for (String palavra : palavras) {
      if(map.containsKey(palavra)) {
        int valorAntigo = map.get(palavra);
        int valorNovo = valorAntigo+1;
        map.put(palavra, valorNovo);
      } else {
        map.put(palavra, 0);
      }
    }

    var entrySet = map.entrySet();
    String palavraMaisRepetida = "";
    int contador = Integer.MIN_VALUE;

    for (var each : entrySet) {
      if (each.getValue() > contador) {
        contador = each.getValue();
        palavraMaisRepetida = each.getKey();
      }
      if(each.getValue() > 3) {
        System.out.println("A palavra " + each.getKey() + " foi impressa " + each.getValue() + " vezes");
      }
    }

    System.out.println("E a mais repetida foi " + palavraMaisRepetida + ", " + contador + " vezes.");

    sc.close();
  }
}