import java.util.Arrays;

public class MetRefApp {

  public void operar(){
    Operacion op = MetRefApp::referenciarMetodoEstatico;
    op.promedio(2,5);

  }



  private static double referenciarMetodoEstatico(double d, double r) {
    System.out.println("en el metodo estatico");
    return d+r;
  }

  public double referenciarMetodoInstanciaObjetoArbitrario(double w, double t){
    String[] nombres = {"Jun", "Lore", "C"};
    //Arrays.sort(nombres, (s1, s2) -> s1.compareTo(s2));
    Arrays.sort(nombres, String::compareTo);
    System.out.println(Arrays.toString(nombres));
    return 4.3;
  }

  public double referenciaMetodoParticular(double s, double w){
    return 4.5;
  }

  public void referenciarContsructor(){
    /*
    IPersona iper = new IPersona() {
      @Override
      public Persona crear(int id, String nombre) {
        return new Persona(id, nombre);
      }

    };
    */

    //IPersona ipe2 = (w, f)->(new Persona(w, f));
    IPersona ipe2 = Persona::new;
    Persona per = ipe2.crear(2, "Juan");
    System.out.println("per.getNombre() = " + per.getNombre());

  }


  public static void main(String[] args) {
    MetRefApp m = new MetRefApp();
   // m.operar();
    m.referenciarContsructor();
    //m.referenciarMetodoInstanciaObjetoArbitrario();
   // Operacion op = m::referenciaMetodoParticular;
    //op.promedio(3.4,6.5);
  }

}
