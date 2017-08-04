
package lab3;

import java.awt.Color;


public class Aguilas extends Bestias {
    public Color color;

    public Aguilas() {
        super();
    }

    public Aguilas(Color color) {
        this.color = color;
    }

    public Aguilas(Color color, int Atck, int Defensa, int curacion, int vida, String veneno,int garras) {
        super(Atck, Defensa, curacion, vida, veneno, garras);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Aguilas{" + "color=" + color + '}';
    }
    
}
