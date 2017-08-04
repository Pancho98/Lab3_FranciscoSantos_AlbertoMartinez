
package lab3;

import java.util.Date;


public class Hombres extends Integrantes{
    public int Attk = 150;
    public int Def = 140;
    public int Heal = 50;

    public Hombres() {
        super();
    }

    public Hombres(String Nombre, String Apellido, double Altura, Date fecha, Bestias bestia) {
        super(Nombre, Apellido, Altura, fecha, bestia);
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
        return Nombre +"-Hombre{" + "Attk=" + Attk + ", Def=" + Def + ", Heal=" + Heal + '}';
    }
    
}
