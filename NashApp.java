import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashApp {
private ScriptEngineManager m;
private ScriptEngine e;
private Invocable invocable;

  public NashApp() {
    m = new ScriptEngineManager();
    e = m.getEngineByName("nashorn");
    invocable = (Invocable) e;
  }

  public void llamarFunciones() throws ScriptException, FileNotFoundException, NoSuchMethodException {
    e.eval("print('desde java')");
    e.eval(new FileReader("src/main/java/archivo.js"));
    double rta= (double) invocable.invokeFunction("calcular", 6,7 );
    System.out.println("rta = " + rta);

  }
  public void implementarInterfaz() throws FileNotFoundException, ScriptException {
    e.eval(new FileReader("src/main/java/archivo.js"));
    Object implementacion = e.get("hilo");
    Runnable r = invocable.getInterface(implementacion, Runnable.class);
    Thread th1 = new Thread(r);
    th1.start();
    Thread th2 = new Thread(r);
    th2.start();
  }

  public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
    NashApp na = new NashApp();
    na.llamarFunciones();
    na.implementarInterfaz();
  }
}
