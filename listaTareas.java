package coleccionesTaller;

import java.util.ArrayList;
import java.util.List;

public class listaTareas {
    public static void main(String[] args){
        List<String> tareas = new ArrayList<>();
        tareas.add("comer");
        tareas.add("bañarse");
        tareas.add("sepillarce");

        System.out.println(tareas);

        tareas.remove("comer");
        System.out.println(tareas.size());
    }

}
