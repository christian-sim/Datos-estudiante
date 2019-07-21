/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:numero par o impar
*FECHA:
*****************************************/
public class NUMEROS {
    int numero;
    public NUMEROS(int numero){
    this.numero=numero;}
    
    
public void setNumero(int numero){
this.numero=numero;}

public int getNumero(){
    return numero;
}
public void procesoNUMEROS(int numero){
       if (numero%2==0){
        System.out.println("el numero es par");}
    else{
        System.out.println("el numero es impar");}
}}
