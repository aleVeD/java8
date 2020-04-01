import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AppMap {
  private Map<Integer, String> map;
  public void poblar(){
    map = new HashMap<>();
    map.put(1, "rucula");
    map.put(2, "tomate");
    map.put(3, "lechuga");
    map.put(4, "rabanitos");
  }

  public void imprimir(){
    map.forEach((k,v)-> System.out.println("k = " + k+" v = "+v));
    map.entrySet().stream().forEach(System.out::println);
  }

  public void recolectar(){
    Map<Integer, String> mapaRecolectado = map.entrySet().stream()
            .filter(e->e.getValue().contains("lech"))
            .collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
    mapaRecolectado.forEach((k,v)-> System.out.println("k = "+k+" v= "+v));
  }

  public void insertarSiPresente(){
    map.putIfAbsent(5, "coliflor");
  }

  public void operarSiPresente(){
    map.computeIfPresent(2, (k, v)->k+v);
    System.out.println(map.get(3));
  }

  public void obtenerOrPredeterminado(){
    String valor = map.getOrDefault(5, "defecto");
    System.out.println(valor);
  }

  public static void main(String[] args) {
    AppMap a = new AppMap();
    a.poblar();
    a.insertarSiPresente();
    a.imprimir();
    a.operarSiPresente();
    a.obtenerOrPredeterminado();
    a.recolectar();
  }
}
