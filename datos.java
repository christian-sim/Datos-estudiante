/****************************************
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM. PROFESOR:FERNANDO SOLIS
*TEMA:datos estudiante
*FECHA:
*****************************************/
public class Datos {   
    String nombre;
    String apellido;
    String direccion;
    String especialidad;
    String email;
    String celular;
    int edad;
public Datos(String nombre,String apellido,String direccion,String especialidad,String email,String celular,int edad ){
this.nombre=nombre;
this.apellido=apellido;
this.direccion=direccion;
this.especialidad=especialidad;
this.email=email;
this.celular=celular;
this.edad=edad;}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
public void imprimirDatos(){
System.out.println("su Nombre es:");
System.out.println(getNombre());
System.out.println("su Apellido es:");
System.out.println(getApellido());
System.out.println("su Direccion es:");
System.out.println(getDireccion());
System.out.println("su Especialidad es:");
System.out.println(getEspecialidad());
System.out.println("su Email es:");
System.out.println(getEmail());
System.out.println("su Celular es:");
System.out.println(getCelular());
System.out.println("su Edad es:");
System.out.println(getEdad());
}
}
