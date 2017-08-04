
package lab3;

import java.util.Date;


public class Maiar extends Integrantes {
    public int Attk = 0;
    public int Def = 0;
    public int Heal = 0;

    public Maiar() {
        super();
    }

    public Maiar(String Nombre, String Apellido, double Altura, Date fecha) {
        super(Nombre, Apellido, Altura, fecha);
    }

    public int getAttk() {
        return Attk;
    }

    public void setAttk(int Attk) {
        this.Attk = Attk;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int Def) {
        this.Def = Def;
    }

    public int getHeal() {
        return Heal;
    }

    public void setHeal(int Heal) {
        this.Heal = Heal;
    }

    @Override
    public String toString() {
        return "Maiar{" + "Attk=" + Attk + ", Def=" + Def + ", Heal=" + Heal + '}';
    }
    
}
