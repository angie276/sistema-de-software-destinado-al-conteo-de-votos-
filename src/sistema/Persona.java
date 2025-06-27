
package sistema;
import java.util.Scanner;
public class Persona {
    protected int DNI; 
    protected String nombres;
    protected String apellidos;


    public Persona(int DNI, String nombres, String apellidos) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    public String nombreCompleto(){  // preguntar 
        return "Nombres: "+nombres+"\t"+
                "Apellidos: "+apellidos;
    }
    
    
    
      
    
    
    
}
