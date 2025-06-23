
package sistema;
import java.util.Scanner;
public class Persona {
    protected String DNI; 
    protected String nombres;
    protected String apellidos;

    public Persona() {
        DNI = "";
        nombres = " ";
        apellidos = " ";
    }

    public Persona(String DNI, String nombres, String apellidos) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidos = apellidos;
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
    
    public String verInfo(){
        return "DNI: "+DNI+"\n"+
                "Nombres: "+nombres+"\n"+
                "Apellidos: "+apellidos;
    }
    
    // NO RECOMENDABLE 
    public void leer(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("DNI: ");
        DNI = sc.nextLine();
        System.out.println("Nombres: ");
        nombres = sc.nextLine();
        System.out.println("Apellidos: ");
        apellidos = sc.nextLine();
        
    }
    
    
    
    
    
}
