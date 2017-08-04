
package lab3;

import java.util.ArrayList;


public class Pueblos {
    public ArrayList<Integrantes> raza = new ArrayList();

    public Pueblos() {
        
    }

    public ArrayList<Integrantes> getRaza() {
        return raza;
    }

    public void setRaza(ArrayList<Integrantes> raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Pueblos{" + "raza=" + raza + '}';
    }

        
    
}
