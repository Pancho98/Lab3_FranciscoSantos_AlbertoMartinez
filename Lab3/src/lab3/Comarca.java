
package lab3;


public class Comarca extends Pueblos {
    public int Casas;

    public Comarca() {
        super();
    }

    public Comarca(int Casas, String nombre) {
        super(nombre);
        this.Casas = Casas;
    }

    public Comarca(int Casas) {
        this.Casas = Casas;
    }

    public int getCasas() {
        return Casas;
    }

    public void setCasas(int Casas) {
        this.Casas = Casas;
    }

    @Override
    public String toString() {
        return "Comarca{" + "Casas=" + Casas + '}';
    }
    
    
}
