public class FuncInterApp {

  public double promedio(double n1, double n2){
    Operacion op = (x, y )-> x+y;
    return op.promedio(n1, n2);
    }

  public static void main(String[] args) {
    FuncInterApp fun = new FuncInterApp();
    fun.promedio(2.5, 7.9);
  }


}
