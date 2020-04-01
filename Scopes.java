public class Scopes {
  private static double prueba1;
  public double probarLocalVariable(){
    double n3 = 2;

    Operacion operacion = (x, y) -> {
      return x+y+n3;
    };
    return operacion.promedio(2,6);
  }

  public double probarStaticVariables(){
    Operacion operacion = (w, f) -> {
       prueba1 = w + f;
       return prueba1;
    };
    return operacion.promedio(2, 5);
  }
  public static void main(String[] args) {
    Scopes scopes = new Scopes();
    System.out.println(scopes.probarLocalVariable());
    System.out.println(scopes.probarStaticVariables());
  }
}
