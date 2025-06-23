
package sistema;

public class Operador extends Persona{
    private String Usuario;
    private String Clave;

    public Operador() {
        super();
        Usuario = " ";
        Clave = " ";
    }

    public Operador(String DNI, String nombres, String apellidos, String Usuario, String Clave) {
        super(DNI, nombres, apellidos);
        this.Usuario = Usuario;
        this.Clave = Clave;
    }
    
    

    
}
