
package lab3;


public class Bestias {
    public int Atck;
    public int Defensa;
    public int curacion;
    public int vida;
    public String veneno;
    public int garras;

    public Bestias() {
    }

    public Bestias(int Atck, int Defensa, int curacion,int vida, String veneno, int garras) {
        this.Atck = Atck;
        this.Defensa = Defensa;
        this.curacion = curacion;
        this.vida = vida;
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


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getVeneno() {
        return veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        this.garras = garras;
    }
    
    


    public String toString() {
        return "Bestias{" + "Atck=" + Atck + ", Defensa=" + Defensa + ", curacion=" + curacion + ", vida=" + vida + '}';
    }
    

    
    
}
