/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:numero par o impar
*FECHA:
*****************************************/
import java.util.Scanner;

public class NUMEROSPAROIMPAR {

    
    public static void main(String[] args) {
        
     
    int numero;
    
    Scanner lee=new Scanner(System.in);
    System.out.println("ingrese un numero para ver si es par o impar:");
    numero =lee.nextInt();
     
   NUMEROS obj1 = new NUMEROS(numero);
   obj1.procesoNUMEROS(numero);   
    }
   }
