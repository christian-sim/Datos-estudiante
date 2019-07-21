/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:promedio
*FECHA:
*****************************************/
import java.util.Scanner;

public class Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          float nota1, nota2, notaex;
        Scanner lee =new Scanner(System.in);
        System.out.println("ingrese nota 1");
        nota1=lee.nextFloat();
        System.out.println("ingrese nota 2");
        nota2=lee.nextFloat();
        System.out.println("ingrese nota del examen para promediar");
        notaex=lee.nextFloat();
        
    notas obj1 = new notas(nota1,nota2,notaex);
    obj1.promedio(nota1,nota2,notaex);  
    
    }
    
}
