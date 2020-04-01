import java.util.ArrayList;
import java.util.List;

public class CollectionsApp {
  private List<String> lista;

  public void llenarLista(){
    lista = new ArrayList<>();
    lista.add("naramja");
    lista.add("peras");
    lista.add("melones");
    lista.add("frutillas");
  }

  public void usarForeach(){
   /* for (String el: lista){
      System.out.println("el = " + el);
    }*/
    //lista.forEach((x)-> System.out.println("x = " + x));
    lista.forEach(System.out::println);
  }

  public void usarRemoveIf(){
    lista.removeIf(x-> x.equalsIgnoreCase("melones"));
    System.out.println("lista = " + lista);
  }

  public void usarSort(){
    lista.sort((x, y) -> x.compareTo(y));
    System.out.println("lista = " + lista);
  }

  public static void main(String[] args) {
CollectionsApp c = new CollectionsApp();
c.llenarLista();
c.usarForeach();
c.usarRemoveIf();
c.usarSort();
  }
}
