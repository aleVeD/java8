
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

  public void ordenar(){
    List<String> lista = new ArrayList<>();
    lista.add("nuevo");
    lista.add("test");
    lista.add("trabajo");

    /*Collections.sort(lista, new Comparator<String>() {
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }


    });*/
    Collections.sort(lista, (String p1, String p2) -> {return p1.compareTo(p2);});
         for(String e : lista) {
           System.out.println("e = " + e);
         }
  }

  public void calcular(){
    Operacion operacion = (double x, double y)-> (x + y)/2;
    System.out.println(operacion.promedio(2,3));
  }

  public static void main(String[] args) {
    LambdaApp l = new LambdaApp();
    l.ordenar();
    l.calcular();
  }
}
