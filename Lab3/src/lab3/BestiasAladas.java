
package lab3;


public class BestiasAladas extends Bestias {
    public int velocidad;

    public BestiasAladas() {
        super();
    }

    public BestiasAladas(int velocidad) {
        this.velocidad = velocidad;
    }

    public BestiasAladas(int velocidad, int Atck, int Defensa, int curacion, int vida, String veneno, int garras) {
        super(Atck, Defensa, curacion, vida, veneno, garras);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "BestiasAladas{" + "velocidad=" + velocidad + '}';
    }
    
    
}
