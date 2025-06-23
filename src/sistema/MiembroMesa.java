
package sistema;

public class MiembroMesa extends Persona{
    private String TipoMiembro;

    public MiembroMesa() {
        super();
        TipoMiembro = " ";
    }

    public MiembroMesa(String DNI, String nombres, String apellidos, String TipoMiembro) {
        super(DNI, nombres, apellidos);
        this.TipoMiembro = TipoMiembro;
    }
    
    
}
