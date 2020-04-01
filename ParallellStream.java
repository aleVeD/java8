import java.util.ArrayList;
import java.util.List;

public class ParallellStream {
  private List<Integer> numeros;

  public void llenar(){
    numeros = new ArrayList<>();
    for(int i = 0; i < 10; i++) {
      numeros.add(i);
    }
  }

  public void probarStream(){
    numeros.stream().forEach(System.out::println);
  }
  public void probarParalelo(){
    numeros.parallelStream().forEach(System.out::println);
  }

  public static void main(String[] args) {
ParallellStream p = new ParallellStream();
p.llenar();
p.probarStream();
p.probarParalelo();
  }
}
