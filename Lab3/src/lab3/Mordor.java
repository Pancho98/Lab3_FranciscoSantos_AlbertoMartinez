
package lab3;


public class Mordor extends Pueblos{
    public int guardianes;

    public Mordor() {
        super();
    }

    public Mordor(int guardianes, String nombre) {
        super(nombre);
        this.guardianes = guardianes;
    }

    public Mordor(int guardianes) {
        this.guardianes = guardianes;
    }

    public int getGuardianes() {
        return guardianes;
    }

    public void setGuardianes(int guardianes) {
        this.guardianes = guardianes;
    }

    @Override
    public String toString() {
        return "Mordor{" + "guardianes=" + guardianes + '}';
    }
    
    
}
