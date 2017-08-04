
package lab3;


public class Arañas extends Bestias{
    public String Sexo;

    public Arañas() {
        super();
    }

    public Arañas(String Sexo) {
        this.Sexo = Sexo;
    }

    public Arañas(String Sexo, int Atck, int Defensa, int curacion, int vida, String veneno, int garras) {
        super(Atck, Defensa, curacion, vida, veneno, garras);
        this.Sexo = Sexo;
        if (Sexo=="f".toLowerCase()) {
            this.vida+=50;
        }
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Arañas{" + "Sexo=" + Sexo + '}';
    }
    
    
    
}
