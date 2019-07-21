/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:suma de numeros pares
*FECHA:
*****************************************/
public class SumaNumerosPares1 {

       public static void main(String[] args) {
        
        int num;
        Scanner lee =new Scanner(System.in);
        System.out.println("ingrese numero");
        num=lee.nextInt();
        
    numeros1 obj1 = new numeros1(num);
    obj1.sumaNumeros1(num);     
    }
    
}
