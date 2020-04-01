import rx.Observable;
import rx.functions.Action1;

import java.util.ArrayList;
import java.util.List;


public class RxApp {
  private List<Integer> lista1;
  private List<Integer> lista2;


  public RxApp() {
    lista1 = new ArrayList<>();
    lista2 = new ArrayList<>();
    this.llenar();
  }

  public void llenar(){
    for (int i = 0; i < 10; i++) {
      lista1.add(i);
      lista2.add(i);
    }
  }
  public void buscar(){
    Observable<Integer> obs1 = Observable.from(lista1);
    Observable<Integer> obs2 = Observable.from(lista2);
    /*Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {
      @Override
      public void call(Integer numero) {
        if(numero == 1){
          System.out.println("numero = " + numero);
        }
      }
    });*/
    Observable.merge(obs1, obs2).filter(x->x==1).subscribe(System.out::println);
  }

  public static void main(String[] args) {
    List<String> lista = new ArrayList<>();
    lista.add("Juan");
    lista.add("Pedro");
    lista.add("Diego");
    Observable<String> obs = Observable.from(lista);
    obs.subscribe(new Action1<String>() {
      @Override
      public void call(String s) {
        System.out.println("s = " + s);
      }
    });
    RxApp rx = new RxApp();
    rx.buscar();
  }
}
