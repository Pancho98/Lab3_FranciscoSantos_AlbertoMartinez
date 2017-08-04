
package lab3;



public class Dragones extends Bestias {
    public int AlasL;

    public Dragones() {
        super();
    }

    public Dragones(int AlasL) {
        this.AlasL = AlasL;
    }

    public Dragones(int AlasL, int Atck, int Defensa, int curacion, int vida, String veneno, int garras) {
        super(Atck, Defensa, curacion, vida, veneno, garras);
        this.AlasL = AlasL;
    }

    public int getAlasL() {
        return AlasL;
    }

    public void setAlasL(int AlasL) {
        this.AlasL = AlasL;
    }

    @Override
    public String toString() {
        return "Dragones{" + "AlasL=" + AlasL + '}';
    }
    
    
    
}
