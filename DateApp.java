import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateApp {

  public void verificar(int version){
    if(version==7){
      Calendar fecha1 = Calendar.getInstance();
      Calendar fecha2 = Calendar.getInstance();
      fecha1.set(2020,0,21);
      System.out.println(fecha1.after(fecha2));
    }else if(version==8){
      LocalDate fecha1 = LocalDate.of(2020, 9,12);
      LocalDate fecha2 = LocalDate.now();
      System.out.println(fecha1.isAfter(fecha2));
      System.out.println(fecha1.isBefore(fecha2));
      LocalTime hora1 = LocalTime.of(21,23,9);
      LocalTime hora2 = LocalTime.now();
      System.out.println(hora1.isAfter(hora2));
      System.out.println(hora1.isBefore(hora2));
      LocalDateTime fechahora1 = LocalDateTime.of(2020, 12, 3,21,23,9);
      LocalDateTime fechahora2 = LocalDateTime.now();
      System.out.println(fechahora1.isAfter(fechahora2));
      System.out.println(fechahora1.isBefore(fechahora2));
    }
  }

  public void medirTiempo(int version) throws InterruptedException {
    if(version == 7){
      Long ini = System.currentTimeMillis();
      Thread.sleep(1000);
      Long fin = System.currentTimeMillis();
      System.out.println(fin-ini);
    }else{
      Instant ini = Instant.now();
      Thread.sleep(1000);
      Instant fin = Instant.now();
      System.out.println(Duration.between(ini, fin));
    }
  }

  public  void periodoEntreFechas(int version){
    if(version==7){
      Calendar nacimiento = Calendar.getInstance();
      Calendar actual = Calendar.getInstance();
      nacimiento.set(1997, 7, 24);
      actual.set(2020, 4, 1);
      int anios = 0;
      while(nacimiento.before(actual)){
        nacimiento.add(Calendar.YEAR, 1);
        if(nacimiento.before(actual)){
          anios++;
        }
      }
      System.out.println(anios);
    }else if(version==8){
      LocalDate nacimiento = LocalDate.of(1978,2,5);
      LocalDate actual = LocalDate.of(2020,4,1);
      Period periodo = Period.between(nacimiento, actual);
      System.out.println("dias: "+periodo.getDays()+" años:  "+ periodo.getYears()+ " meses: "+periodo.getMonths());
    }
  }

  public void convertir(int version) throws ParseException {
    if(version==7){
      String fecha = "21/3/1989";
      DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
      Date fechaConvertida = formateador.parse(fecha);
      System.out.println(fechaConvertida);
      Date fechaActual = Calendar.getInstance().getTime();
      formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
      String fechaCadena = formateador.format(fechaActual);
      System.out.println(fechaCadena);
    }else if(version == 8){
      String fecha = "21/03/1989";
      DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
      System.out.println(fechaLocal);
      System.out.println(formateador.format(fechaLocal));
    }
  }

  public static void main(String[] args) throws InterruptedException, ParseException {
    DateApp da = new DateApp();
    da.medirTiempo(8);
    da.periodoEntreFechas(8);
    da.convertir(8);
  }
}
