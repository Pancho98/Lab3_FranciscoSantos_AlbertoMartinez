
package lab3;


public class Balrogs extends Bestias{
    public boolean latigo;

    public Balrogs() {
        super();
    }

    public Balrogs(boolean latigo) {
        this.latigo = latigo;
    }

    public Balrogs(boolean latigo, int Atck, int Defensa, int curacion, int vida, String veneno, int garras) {
        super(Atck, Defensa, curacion, vida, veneno, garras);
        this.latigo = latigo;
    }

    public boolean isLatigo() {
        return latigo;
    }

    public void setLatigo(boolean latigo) {
        this.latigo = latigo;
    }

    @Override
    public String toString() {
        return "Balrogs{" + "latigo=" + latigo + '}';
    }
    
    
    
}
