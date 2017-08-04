
package lab3;

//Por pueblo, en el que se elegirán 2 integrantes del total creados y se proseguirá a ponerlos a pelear.

import java.util.ArrayList;

public class Simulacion {

    public Simulacion() {
    }
    
    public void  BatallaPueblo(ArrayList pueblos){
        for (int i = 0; i < pueblos.size(); i++) {
                        System.out.println((i+1)+".- " + pueblos.get(i).toString());
                    }
        System.out.println("Ingresar la posiciones que desea que batallen");
    }
}
