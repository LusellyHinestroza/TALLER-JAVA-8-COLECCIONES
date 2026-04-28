package coleccionesTaller;

import java.util.HashMap;
import java.util.Map;

public class Directorio {
   public static void main(String[] args) {
       Map<String, Double> directorio = new HashMap<>();
       directorio.put("Marcos", 200000.0);
       directorio.put("Marta", 500000.0);
       directorio.put("Maria", 700000.0);
       for (Map.Entry<String, Double> detrect : directorio.entrySet()){
           System.out.println("Trabajador: "+ detrect.getKey() + " | Salario: " + detrect.getValue() );
       }

       String nombre = "Marcos";
       if (directorio.containsKey(nombre)){
           directorio.put(nombre, 900.000);
           System.out.println("Salario actualizado: " + nombre);
       };

       for (Map.Entry<String, Double> detrect : directorio.entrySet()){
           if (detrect.getKey() == nombre){
               System.out.println("Trabajador: "+ detrect.getKey() + " | Salario: " + detrect.getValue() );

           }
       }

       double sumar = 0;
       for (double salario : directorio.values()){
           sumar += salario;
       }

       double promedio = sumar / directorio.size();
       System.out.println("Salario promedio: " + promedio);




    }
}
