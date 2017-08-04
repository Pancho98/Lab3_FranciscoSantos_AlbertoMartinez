
package lab3;


public class Bestias {
   
    public int vida;
    public String veneno;
    public int garras;

    public Bestias() {
    }

    public Bestias(int vida, String veneno, int garras) {
        
        this.vida = vida;
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
