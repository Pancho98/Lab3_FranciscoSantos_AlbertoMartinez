
package lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        ArrayList <Integrantes> integrantes=new ArrayList();
        ArrayList <Pueblos> pueblos=new ArrayList();
        String op="";
        while ( !op.equals("s") ) { 
            String op2="";
            System.out.println(
                      "a-agregar\n"
                    + "b-barajar\n"
                    + "c-repartir\n"
                    + "d-imprimir ganadores\n"
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
                    
                    }
                    
                if (op2.equals("b")){
                    String nombre, apellido, anio, mes, dia;
                    double altura;
                    Date fecha;
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

                    integrantes.add(new Integrantes(nombre, apellido, altura, fecha));
                }
            }
            if (op.equals("b")) {
                             
            }
            if (op.equals("c")) {
                       
            }
            if (op.equals("d")) {
                
            }
            if (op.equals("e")) {
                for (int i = 0; i < integrantes.size(); i++) {
                    System.out.println(integrantes.get(i));
                }
         
            }
        }
    } 
}
