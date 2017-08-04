package lab3;

import java.util.Date;

public class Enanos extends Integrantes {

    public int Attk = 300;
    public int Def = 200;
    public int Heal = 50;

    public Enanos() {
        super();
    }

    public Enanos(String Nombre, String Apellido, double Altura, Date fecha) {
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
        return "Enanos{" + "Attk=" + Attk + ", Def=" + Def + ", Heal=" + Heal + '}';
    }
}
