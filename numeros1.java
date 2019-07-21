/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:suma numeros pares
*FECHA:
*****************************************/
public class numeros1 {
    int numero;   
    public numeros(int numero){
        this.numero=numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    } 
public void sumaNumeros1(int numero){
    int suma=0;
        for(int i=1;i<=numero;i++){
        if(i%2==0){
            System.out.println("los numeros a suma son :"+i);
        suma=suma+i;}}
    System.out.println("la suma es :"+suma);
}
}