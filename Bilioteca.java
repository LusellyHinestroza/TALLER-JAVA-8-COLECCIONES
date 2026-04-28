package coleccionesTaller;

import java.util.HashSet;
import java.util.Set;

public class Bilioteca {
   public static void main(String[] args) {
       Set<String> libros = new HashSet<>();
       libros.add("Cien años de soledad");
       libros.add("Don Quijote de la Mancha ");
       libros.add("Orgullo y prejuicio");
       libros.add("Crimen y castigo");

       for (String libro :libros){
           System.out.println("Libros disponibles: " + libro);
       }

       String buscarLibro = "Orgullo y prejuicio";

       boolean buscar  = libros.contains(buscarLibro);
       System.out.println(buscar);

       System.out.println(libros.size());


    }
}
