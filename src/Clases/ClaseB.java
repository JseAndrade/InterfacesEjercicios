
package Clases;

/**
 *
 * @author jse
 */
public class ClaseB extends ClaseA{

    public int getZ() {
        return z;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    
    int z;

    public ClaseB(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }
    
    @Override
    public int suma(){
        return x+y+z;
    }
    
    
}
