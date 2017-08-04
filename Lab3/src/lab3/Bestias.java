
package lab3;


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

    @Override
    public String toString() {
        return "Bestias{" + "Atck=" + Atck + ", Defensa=" + Defensa + ", curacion=" + curacion + '}';
    }
    
    
}
