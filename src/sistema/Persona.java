
package sistema;
public abstract class Persona {
    protected static int contador = 1;
    protected int id;
    protected String DNI; 
    protected String nombres;
    protected String apellidos;

    public Persona() {
    }

    public Persona(String DNI, String nombres, String apellidos) {
        this.id = id;
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    
 

    public void setId(int id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
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
    
    
    public String nombreCompleto(){  
        return nombres+" "+apellidos;
    }

    public int getId() {
        return id;
    }
    public abstract boolean datosCompletados();

    
    
      
    
    
    
}
