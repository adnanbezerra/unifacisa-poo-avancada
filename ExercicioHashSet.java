import java.util.HashSet;

public class ExercicioHashSet {
  public static void main(String[] args) {
    int[] conjuntoUm = {1, 2, 3, 4, 5};
    int[] conjuntoDois = {7, 9, 1, 2, 3, 4, 5, 6};

    HashSet<Integer> intercessao = new HashSet<>();
    for (int i = 0; i < conjuntoDois.length; i++) {
      intercessao.add(conjuntoDois[i]);
    }
    for (int i = 0; i < conjuntoUm.length; i++) {
      intercessao.add(conjuntoUm[i]);
    }

    System.out.println(intercessao.toString());
  }
}
