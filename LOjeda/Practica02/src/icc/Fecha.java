/**
 * Clase para crear y manejar fechas.
 * @author Ojeda Cruz Luis Ángel.
 * @version 1a versión.
 */
public class Fecha{  //Todo lo que se necesita es seguir el capítulo punto, todo lo necesario está ahí, hasta el capítulo 4.

  //Atributos
  private int dia;
  private int mes;
  private int anio;
  private String mestex;

  /**
  * Metodo para crear una fecha incial sin parametros.
  */
  public Fecha(){
    this(8,8,2007);
  }
  
  /**
  * Metodo para crear una fecha incial con 3 enteros.
  * @param d día del mes
  * @param m número de mes (1 a 12)
  * @param a año
  */
  public Fecha(int d, int m, int a){
   asignarFecha(d,m,a);
  }
  
  /**
  * Metodo para crear una fecha incial con 2 enteros y un String.
  * @param d día del mes
  * @param m nombre del mes
  * @param a año
  */
  public Fecha(int d, String m, int a){
    asignarFecha(d,m,a);
  }
  //Métodos Inspectores
  
  /**
  * Método para obtener el día de la fecha.
  * @return int del dia
  */
  public int obtenerDia(){
    return dia;
  }
  /**
  * Método para obtener el mes de la fecha.
  * @return int del mes
  */
  public int obtenerMes(){
    return mes;
  }
  /**
  * Método para obtener el año de la fecha.
  * @return int el año
  */
  public int obtenerAnio(){
    return anio;
  }
  /**
  * Método para obtener el nombre del mes de la fecha.
  * @return String el nombe del mes.
  */
  public String obtenerMestex(){
    return mestex;
  }
  
  //Metodos para Asignar valor a los campos de una fecha.
  
  /**
  * Método para asignar un valor a un día.
  * @param d nuevo dia
  */
  public void asignarDia(int d){
    dia = d;
  }
  /**
  * Método para asignar un nombre a un mes en base a su número.
  * @param m nuevo número de mes
  */
  public void asignarMes(int m){
    mes = m;
    mestex = nombreDeMes(m);
  }
  /**
  * Método para asignar un valor a un mes en base a su nombre.
  * m nombre del mes
  */
  public void asignarMes(String m){
    mestex = m.toLowerCase().trim();
    mes = numeroDeMes(mestex);
  }
  /**
  * Método para asignar un valor a al año.
  * @param a nuevo año
  */
  public void asignarAnio(int a){
    anio = a;
  }
  /**
  * Método para asignar todos los valores de una fecha con 3 enteros.
  * @param d día
  * @param m número de mes
  * @param a año
  */
  public void asignarFecha(int d, int m, int a){
    dia = d;
    mes = m;
    anio = a;
    mestex = nombreDeMes(m);
  }
  /**
  * Método para asignar todos los valores de una fecha con 2 enteros (dia y anio) y un String (mes).
  * @param d día
  * @param m nombre del mes
  * @param a año
  */
  public void asignarFecha(int d, String m, int a){
    dia = d;
    mestex = m.toLowerCase().trim();
    mes = numeroDeMes(mestex);
    anio = a;
  }
  //Métodos de conversión
  
  /**
  * Método que devuelve el número correspondiente al nombre del mes.
  * @param nombresMes cadena con el nombre del mes
  * @return int número del mes (1 a 12, en caso de ser inválido 0)
  */
  public int numeroDeMes(String nombreMes){
    String m = nombreMes.toLowerCase().trim();
    if(m.equals("enero")) {
      return 1;
    } else if (m.equals("febrero")){
      return 2;
    } else if (m.equals("marzo")){
      return 3;
    } else if (m.equals("abril")){
      return 4;
    } else if (m.equals("mayo")){
      return 5;
    } else if (m.equals("junio")){
      return 6;
    } else if (m.equals("julio")){
      return 7;
    } else if (m.equals("agosto")){
      return 8;
    } else if (m.equals("septiembre")){
      return 9;
    } else if (m.equals("octubre")){
      return 10;
    } else if (m.equals("noviembre")){
      return 11;
    } else if (m.equals("diciembre")){
      return 12;
    } else {
      return 0;
    }
  }
  
  /**
  * Método para devolver el String correspondiente al número de mes;
  * @param numMes número del mes (1 a 12)
  * @return String nombre del mes
  */
  public String nombreDeMes(int numMes) { 
    if (numMes == 1) {
      return "enero";
    } else if (numMes == 2) {
        return "febrero";
    } else if (numMes == 3) {
        return "marzo";
    } else if (numMes == 4) {
        return "abril";
    } else if (numMes == 5) {
        return "mayo";
    } else if (numMes == 6) {
        return "junio";
    } else if (numMes == 7) {
        return "julio";
    } else if (numMes == 8) {
        return "agosto";
    } else if (numMes == 9) {
        return "septiembre";
    } else if (numMes == 10) {
        return "octubre";
    } else if (numMes == 11) {
        return "noviembre";
    } else if (numMes == 12) {
        return "diciembre";
    } else{
        return "invalido";
    }
  }
  // Método para saber si es bisiesto el año;
  private boolean esBisiesto(int a){
    return (a % 4 == 0 && a %100 !=0) || (a % 400 == 0);
  }
  
  /**
  * Metodo para Dada una fecha, especificar los dias transcurridos en el año.
  * @return int número de dñias transcurridos en el año
  */
  public int diasTranscurridos() {
        int dias = 0;
        if (mes == 1) {
            dias = 0;
        } else if (mes == 2) {
            dias = 31;
        } else if (mes == 3) {
            dias = 59;
        } else if (mes == 4) {
            dias = 90;
        } else if (mes == 5) {
            dias = 120;
        } else if (mes == 6) {
            dias = 151;
        } else if (mes == 7) {
            dias = 181;
        } else if (mes == 8) {
            dias = 212;
        } else if (mes == 9) {
            dias = 243;
        } else if (mes == 10) {
            dias = 273;
        } else if (mes == 11) {
            dias = 304;
        } else if (mes == 12) {
            dias = 334;
        }

        if (mes > 2 && esBisiesto(anio)) {
            dias = dias + 1;
        }
        return dias + dia;
    }

  // Método que convierte la fecha completa a días totales desde el año 1
  private int totalDias() {
        int y = anio - 1;
        return 365 * y + y / 4 - y / 100 + y / 400 + diasTranscurridos();
    }

  /**
  * Metodo para obtener la diferencia, en dias, entre dos fechas.
  * @param otra fecha contra la cual se calcula la diferencia
  */
  public int diferenciaDias(Fecha otra) {
      int d1 = this.totalDias();
      int d2 = otra.totalDias();
      if (d1 >= d2) {
          return d1 - d2;
      } else {
          return d2 - d1;
      }
  }

  /**
  * Metodo para Dada una fecha inicial y un numero entero que representa una cantidad de dias, obtener la fecha que corresponde.
  * @param cantidadDias número de días a sumar o restar
  * @return Fecha la nueva fecha resultante
  */
  public Fecha obtenerFecha(int cantidadDias) {
      int n = this.totalDias() + cantidadDias - 1;

      int c400 = n / 146097;
      int rem400 = n % 146097;

      int c100 = rem400 / 36524;
      if (c100 == 4) {
          c100 = 3;
      }
      int rem100 = rem400 - c100 * 36524;

      int c4 = rem100 / 1461;
      int rem4 = rem100 - c4 * 1461;

      int c1 = rem4 / 365;
      if (c1 == 4) {
          c1 = 3;
      }

      int diaDelAnio = rem4 - c1 * 365 + 1;
      int nuevoAnio = c400 * 400 + c100 * 100 + c4 * 4 + c1 + 1;

      int b = 0;
      if (esBisiesto(nuevoAnio)) {
          b = 1;
      }

      int nuevoMes;
      int nuevoDia;
      if (diaDelAnio <= 31) {
          nuevoMes = 1;
          nuevoDia = diaDelAnio;
      } else if (diaDelAnio <= 59 + b) {
          nuevoMes = 2;
          nuevoDia = diaDelAnio - 31;
      } else if (diaDelAnio <= 90 + b) {
          nuevoMes = 3;
          nuevoDia = diaDelAnio - (59 + b);
      } else if (diaDelAnio <= 120 + b) {
          nuevoMes = 4;
          nuevoDia = diaDelAnio - (90 + b);
      } else if (diaDelAnio <= 151 + b) {
          nuevoMes = 5;
          nuevoDia = diaDelAnio - (120 + b);
      } else if (diaDelAnio <= 181 + b) {
          nuevoMes = 6;
          nuevoDia = diaDelAnio - (151 + b);
      } else if (diaDelAnio <= 212 + b) {
          nuevoMes = 7;
          nuevoDia = diaDelAnio - (181 + b);
      } else if (diaDelAnio <= 243 + b) {
          nuevoMes = 8;
          nuevoDia = diaDelAnio - (212 + b);
      } else if (diaDelAnio <= 273 + b) {
          nuevoMes = 9;
          nuevoDia = diaDelAnio - (243 + b);
      } else if (diaDelAnio <= 304 + b) {
          nuevoMes = 10;
          nuevoDia = diaDelAnio - (273 + b);
      } else if (diaDelAnio <= 334 + b) {
          nuevoMes = 11;
          nuevoDia = diaDelAnio - (304 + b);
      } else {
          nuevoMes = 12;
          nuevoDia = diaDelAnio - (334 + b);
      }

      return new Fecha(nuevoDia, nuevoMes, nuevoAnio);
  }

  /**
  * Metodo para determinar si dos fechas son iguales
  * @param otra fecha contra la cual se compara
  * @return boolean true si son iguales y falseen otro caso
  */
  
  public boolean esIgual(Fecha otra) {
      return dia == otra.obtenerDia() &&
             mes == otra.obtenerMes() &&
             anio == otra.obtenerAnio();
  }

  // Métodos especiales (Secciones 4.3.6 y 4.3.7)

  /**
   * Método para determina si dos objetos de la clase Fecha son iguales.
   * @param obj objeto contra el cual se compara
   * @return boolean true si son iguales y false en otro caso
   */
  public boolean equals(Object obj) {
      Fecha f = (Fecha) obj;
      return dia == f.obtenerDia() &&
             mes == f.obtenerMes() &&
             anio == f.obtenerAnio();
  }

  /**
  * Metodo para Representar una fecha en el formato dd/mes/aaaa , donde dd es el dia, mes es el nombre del mes. y aaaa son cuatro digitos que representan el año.
  * @return String la fecha en formato String
  */

  public String toString() {
      String diaTexto = "" + dia;
      if (dia < 10) {
          diaTexto = "0" + dia;
      }

      String anioTexto = "" + anio;
      if (anio < 10) {
          anioTexto = "000" + anio;
      } else if (anio < 100) {
          anioTexto = "00" + anio;
      } else if (anio < 1000) {
          anioTexto = "0" + anio;
      }

      return diaTexto + "/" + mestex + "/" + anioTexto;
  }

}




 
