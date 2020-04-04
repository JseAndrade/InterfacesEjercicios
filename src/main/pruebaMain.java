package main;

/**
 *
 * @author jse
 */
import Clases.*;
import java.util.*;
import java.util.Collections;

public class pruebaMain {

    public static void main(String[] args) {

        ArrayList<ClaseB> objetos = new ArrayList<ClaseB>();
        objetos.add(new ClaseB(1, 5, 3));
        objetos.add(new ClaseB(1, 2, 2));
        objetos.add(new ClaseB(23, 43, 34));

        System.out.println(" Herencia " + objetos.get(0).suma()+"\n");

        Collections.sort(objetos);

        objetos.forEach((st) -> {
            System.out.println(st.getX()+" "+st.getY()+" "+st.getZ());
        });

    }
}
