
package lab3;


public class Raza {
    public int Attack;
    public int Defense;
    public int Curacion;

    public Raza() {
    }

    public Raza(int Attack, int Defense, int Curacion) {
        this.Attack = Attack;
        this.Defense = Defense;
        this.Curacion = Curacion;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int Attack) {
        this.Attack = Attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    public int getCuracion() {
        return Curacion;
    }

    public void setCuracion(int Curacion) {
        this.Curacion = Curacion;
    }

    @Override
    public String toString() {
        return "Raza{" + "Attack=" + Attack + ", Defense=" + Defense + ", Curacion=" + Curacion + '}';
    }
    
    
    
}
