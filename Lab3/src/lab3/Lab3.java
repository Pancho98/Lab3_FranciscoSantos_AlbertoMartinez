
package lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab3 {
    static Random R=new Random();
    static Scanner sc=new Scanner(System.in);
    static Simulacion b = new Simulacion();
    public static void main(String[] args) throws ParseException {
        ArrayList <Integrantes> integrantes=new ArrayList();
        ArrayList <Pueblos> pueblos=new ArrayList();
        String op="";
        while ( !op.equals("s") ) { 
            String op2="";
            System.out.println(
                      "a-agregar\n"
                    + "b-modificar\n"
                    + "c-eliminar\n"
                    + "d-simulacion\n"
                    + "e-Listado de integrantes\n"
                    + "s-salir");
            op=sc.next();
            
            if (op.equals("a")) {
                System.out.println(
                      "a-agregar pueblo\n"
                    + "b-agregar integrante\n"
                    + "s-salir");
                op2=sc.next();
                if (op2.equals("a")){
                    String name="";
                    System.out.println("Escriba el nombre del nuevo pueblo");
                    name=sc.next();
                    Pueblos nuevoPueblo = new Pueblos(name);
                    pueblos.add(nuevoPueblo);
                    }
                    
                if (op2.equals("b")){
                    String nombre, apellido, anio, mes, dia, raza;
                    double altura;
                    Date fecha;
                    Bestias b=new Bestias();
                    System.out.print("nombre: ");
                    nombre=sc.next();
                    System.out.print("apellido: ");
                    apellido=sc.next();
                    System.out.print("altura: ");
                    altura=sc.nextDouble();
                    System.out.println("fecha de nacimiento (yyyy/MM/dd)");
                    System.out.print("año: ");
                    anio=sc.next();
                    System.out.print("mes: ");
                    mes=sc.next();
                    System.out.print("dia: ");
                    dia=sc.next();
                    DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
                    fecha=df.parse(anio+"/"+mes+"/"+dia);
                    System.out.println(fecha);

                    integrantes.add(new Integrantes(nombre, apellido, altura, fecha, b));
                    
                    System.out.println("Elegir pueblo: ");
                    int indice = 0;
                    for (int i = 0; i < pueblos.size(); i++) {
                        System.out.println((i+1)+".- " + pueblos.get(i).toString());
                    }
                    System.out.println("Elegir pueblo: ");
                    indice = sc.nextInt();
                    
                    Pueblos temporal = pueblos.get(indice-1);
                    System.out.println("que raza es?: ");
                    System.out.println("- elfo");
                    System.out.println("- enano");
                    System.out.println("- hobbit");
                    System.out.println("- humano");
                    System.out.println("- maiar");
                    raza=sc.next();
                    if(raza.equals("elfo")){
                    temporal.getIntegrantes().add(new Elfos(nombre, apellido, altura, fecha, b));
                    }
                    if(raza.equals("enano")){
                    temporal.getIntegrantes().add(new Enanos(nombre, apellido, altura, fecha, b));
                    }
                    if(raza.equals("hobbit")){
                    temporal.getIntegrantes().add(new Hobbit(nombre, apellido, altura, fecha, b));
                    }
                    if(raza.equals("humano")){
                    temporal.getIntegrantes().add(new Hombres(nombre, apellido, altura, fecha, b));
                    }
                    if(raza.equals("maiar")){
                    temporal.getIntegrantes().add(new Maiar(nombre, apellido, altura, fecha, b));
                    }
                }
            }
            if (op.equals("b")) {
                             
            }
            if (op.equals("c")) {
                       
            }
            if (op.equals("d")) {
                b.BatallaPueblo(pueblos);
            }
            if (op.equals("e")) {
                for (int i = 0; i < integrantes.size(); i++) {
                    System.out.println(integrantes.get(i));
                }
                
            }
            if (op.equals("f")) {
                for (int i = 0; i < pueblos.size(); i++) {
                        System.out.println((i+1)+".- " + pueblos.get(i).toString());
                    }
            }
        }  
    }
}
