public class DefaultMethod implements PersonaA, PersonaB{
  public static void main(String[] args) {
    DefaultMethod dm = new DefaultMethod();
    dm.caminar();
    dm.hablar();
  }

  @Override
  public void caminar() {
    System.out.println("caminando");
  }

  @Override
  public void hablar() {

  }
}
