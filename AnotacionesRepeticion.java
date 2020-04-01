import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnotacionesRepeticion {
@Retention(RetentionPolicy.RUNTIME)
  public @interface Lenguajes{
    Lenguaje[] value() default{};
  }
@Repeatable(value = Lenguajes.class)
public @interface Lenguaje{
    String value();
}
/*
@Lenguajes({
        @Lenguaje("Java"),
        @Lenguaje(("Phyton"))
})*/
@Lenguaje("Java")
  @Lenguaje(("Phyton"))
public interface LenguajeProgramacion{

  }

  public static void main(String[] args) {
    Lenguaje[] lengArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
    System.out.println(lengArray.length);
  }
}
