
package lab3;


public class Gondor extends Pueblos{
    public int pasajes;

    public Gondor() {
        super();
    }

    public Gondor(int pasajes, String nombre) {
        super(nombre);
        this.pasajes = pasajes;
    }

    public Gondor(int pasajes) {
        this.pasajes = pasajes;
    }

    public int getPasajes() {
        return pasajes;
    }

    public void setPasajes(int pasajes) {
        this.pasajes = pasajes;
    }

    @Override
    public String toString() {
        return "Gondor{" + "pasajes=" + pasajes + '}';
    }
   
    
}
