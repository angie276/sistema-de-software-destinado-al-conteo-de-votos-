
package sistema;

public class MiembroMesa extends Persona{
    private String tipoMiembro; // presidente, secretario, vocal
    private MesaElectoral mesa;
    private Eleccion eleccion;


    public MiembroMesa(String DNI, String nombres, String apellidos, String tipoMiembro, MesaElectoral mesa, Eleccion eleccion) {
        super(DNI, nombres, apellidos);
        this.tipoMiembro = tipoMiembro;
        this.mesa = mesa;
        this.eleccion = eleccion;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }


    
    public String getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }
    @Override
    public boolean datosCompletados() {
        return DNI != null && !DNI.isBlank() && nombres != null && !nombres.isBlank()
            && apellidos != null && !apellidos.isBlank()
            && tipoMiembro != null && !tipoMiembro.isBlank();
    }
    
    
}
