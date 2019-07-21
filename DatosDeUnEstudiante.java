/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:datos estudiante
*FECHA:
*****************************************/
import java.util.Scanner;
public class DatosDeUnEstudiante {
    public static void main(String[] args) {
String nombre,apellido,direccion,especialidad,email,celular;
int edad;
Scanner lee=new Scanner(System.in);
System.out.println("ingrese su NOMBRE:");
nombre=lee.next();
System.out.println("ingrese su APELLIDO:");
apellido=lee.next();
System.out.println("ingrese su DIRECCION:");
direccion=lee.next();
System.out.println("ingrese su ESPECIALIDAD:");
especialidad=lee.next();
System.out.println("ingrese su EMAIL:");
email=lee.next();
System.out.println("ingrese su NUMERO CELULAR:");
celular=lee.next();
System.out.println("ingrese su EDAD:");
edad=lee.nextInt();

Datos obj1=new Datos(nombre,apellido,direccion,especialidad,email,celular,edad);
obj1.imprimirDatos();
}   
}