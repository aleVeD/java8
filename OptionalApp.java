import java.util.Optional;

public class OptionalApp {
  public void probar(String valor){
    System.out.println(" valor: "+valor.contains("mito"));
    try {

      Optional op = Optional.empty();
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }

  public void orElse(String valor){
    Optional<String> op = Optional.ofNullable(valor);
    String x = op.orElse("predeterminado");
    System.out.println("x = " + x);
  }

  public void orElseThrow(String valor){
    Optional<String> op = Optional.ofNullable(valor);
    op.orElseThrow(NumberFormatException::new);
  }

  public void isPresent(String valor){
    Optional<String> op = Optional.ofNullable(valor);
    System.out.println(op.isPresent());
  }

  public static void main(String[] args) {
    OptionalApp app = new OptionalApp();
    //app.probar(null);
    app.orElse(null);
    //app.orElseThrow(null);
    app.isPresent(null);
  }
}
