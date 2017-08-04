
package lab3;

import java.util.ArrayList;


public class Pueblos {
    public ArrayList<Lugares> lugar = new ArrayList();
    public String nombre;

    public Pueblos(String nombre) {
        this.nombre = nombre;
    }

    public Pueblos() {
    }

    public ArrayList<Lugares> getLugar() {
        return lugar;
    }

    public void setLugar(ArrayList<Lugares> lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
