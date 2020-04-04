package Clases;

/**
 *
 * @author jse
 */
import Interfaz.*;

public class ClaseA implements InterfazC, Comparable<ClaseA> {

    public ClaseA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x, y;

    public int suma() {
        return x + y;
    }

    @Override
    public int mayor() {
        int mayor = 0;
        if (getX() > getY()) {
            mayor = getX();
        } else {
            mayor = getY();
        }

        return mayor;
    }

    @Override
    public int compareTo(ClaseA a) {
        if (this.mayor() == a.mayor()) {
            return 0;
        } else if (this.mayor() < a.mayor()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
