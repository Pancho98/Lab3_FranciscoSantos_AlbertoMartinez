
package lab3;

import java.util.Date;


public class Integrantes extends Pueblos {
    public String Nombre;
    public String Apellido;
    public double Altura;
    public Date Fecha;

    public Integrantes() {
        super();
    }

    public Integrantes(String Nombre, String Apellido, double Altura, Date Fecha) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Altura = Altura;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Integrantes{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Altura=" + Altura + ", Fecha=" + Fecha + '}';
    }
    
    
        
    
}
