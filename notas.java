/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:promedio
*FECHA:
*****************************************/
public class notas {
   float nota1 , nota2 , notaex;

    public notas(float nota1, float nota2, float notaex) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaex = notaex;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaex() {
        return notaex;
    }

    public void setNotaex(float notaex) {
        this.notaex = notaex;
    }
public void promedio(float nota1 ,float nota2 , float notaex ){
         
    float suma=0 , promedio;
        suma=nota1+nota2+notaex;
        promedio=suma/3;
    
 System.out.println("el promedio es :"+promedio);
    
}

}