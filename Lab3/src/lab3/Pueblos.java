
package lab3;

import java.util.ArrayList;


public class Pueblos {
    public ArrayList<Integrantes> integrantes = new ArrayList();
    public String nombre;

    public Pueblos(String nombre) {
        this.nombre = nombre;
    }

    public Pueblos() {
    }

    public ArrayList<Integrantes> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrantes> integrantes) {
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
