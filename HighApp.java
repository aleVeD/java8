import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {
  private Function<String, String> convertirMayusculas = x-> x.toUpperCase();
  private Function<String, String> convertirMinusculas = x-> x.toLowerCase();

  public void imprimir(Function<String, String> function, String valor){
    System.out.println(function.apply(valor));
  }

  public Function<String, String> mostrar(String mensaje){
    return (String x)-> mensaje + x;
  }

  public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena){
    lista.stream().filter(this.retornaPredicado(cadena)).forEach(consumidor);
  }

  public Predicate<String> retornaPredicado(int longitud){
    return texto-> texto.length() < longitud;
  }

  public Predicate<String> retornaPredicado(String cadena){
    return texto-> texto.contains(cadena);
  }

  public static void main(String[] args) {
    HighApp app = new HighApp();
    app.imprimir(app.convertirMayusculas, "ytyt");
    app.imprimir(app.convertirMinusculas, "jYSmk");
    String respuesta = app.mostrar("hola").apply(" mundo");
    System.out.println("respuesta = " + respuesta);
    List<String> lista = new ArrayList<>();
    lista.add("pera");
    lista.add("naranja");
    lista.add("pomelo");
    app.filtrar(lista, System.out::println, 0, "nar");
  }
}