import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

  private List<String> lista;
  private List<String> numeros;

  public StreamsApp(){
    lista = new ArrayList<>();
    lista.add("naramja");
    lista.add("peras");
    lista.add("melones");
    lista.add("frutillas");
    lista.add("cerezas");
    lista.add("frambuesas");
    numeros = new ArrayList<>();
    numeros.add("1");
    numeros.add("2");
    numeros.add("3");
  }

  public void filtrar(){
    lista.stream().filter((x)-> x.startsWith("f")).forEach(System.out::println);
  }

  public void ordenar(){
    lista.stream().sorted().forEach(System.out::print);
    System.out.println();
    // al reves
    lista.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::print);
  }

  public void transformar(){
    System.out.println();
    lista.stream().map(String::toUpperCase).forEach(System.out::println);
    System.out.println();
    numeros.stream().map((x)-> Integer.parseInt(x) +1).forEach(System.out::println);
  }
  public void limitar(){
    lista.stream().limit(2).forEach(System.out::println);
  }

  public void contar(){
    long x = lista.stream().count();
    System.out.println("x = " + x);
  }

  public static void main(String[] args) {
    StreamsApp sa = new StreamsApp();
    sa.filtrar();
    sa.ordenar();
    sa.transformar();
    sa.limitar();
    sa.contar();
  }
}
