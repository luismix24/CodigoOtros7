/*
 * Programa para conocer las capitales de 10 ciudades del continente Americano
 * Este programa te ayuda a conocer las cápitales de 10 ciudades
 * de ki contrario sino la encuentra en la lista te pregunta cual es su cápital
 * te dice si la puedes capturar y esta se almacena para posteriormente 
 * tener la respuesta.
 * Además de contener un boton para salir (dejar de ejecutar) del programa
 * */

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 { // no puede llevar caracteres especiales código

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // se agrega System.in
        HashMap<String, String> capitales = new HashMap<String, String>(); // se cambian por tipo de dato String

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "CDMX"); // Ya es CDMX xD
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador","San Salvador");// faltaba su capital
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = ""; // String
	    do {
	      System.out.println("Escribe el nombre de un país y te diré su capital: "); //ln
	      System.out.println("o escribe 'salir' para salir");
	      c = s.nextLine().trim(); // se cambia el input porque ahora es String
	      
	      if (!c.equalsIgnoreCase("salir")) { // se corrije la palabra
	        if (capitales.containsKey(c)) { // se cambia por Key
	          System.out.print("La capital de " + c + " es " + capitales.get(c) + " "); // se agrega out y un get, solo con un print queda todo
	        } else {
	          System.out.print("No conozco la respuesta."+ "¿cuál es la capital de " + c + "?: "); // todo puede quedar en un println
	          String capital = s.nextLine().trim(); // se cambia por el nombre completo y se agrega un trim() para almancenar la respuesta
	          capitales.put(c, capital);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equalsIgnoreCase("salir")); // se corrije while y se completa la palabra	  }
         s.close(); //se cierra Scanner
	}
}