/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Francisco Santos
 */
public class Bestias {
    public int Atck;
    public int Defensa;
    public int curacion;

    public Bestias() {
    }

    public Bestias(int Atck, int Defensa, int curacion) {
        this.Atck = Atck;
        this.Defensa = Defensa;
        this.curacion = curacion;
    }

    public int getAtck() {
        return Atck;
    }

    public void setAtck(int Atck) {
        this.Atck = Atck;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }
    
    
}
