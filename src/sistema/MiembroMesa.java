
package sistema;

public class MiembroMesa extends Persona{
    private String tipoMiembro; // presidente, secretario, vocal


    public MiembroMesa(int DNI, String nombres, String apellidos, String tipoMiembro) {
        super(DNI, nombres, apellidos);
        this.tipoMiembro = tipoMiembro;
    }

    public String getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }
    @Override
    public boolean datosCompletados() {
        return DNI > 0 && nombres != null && !nombres.isBlank()
            && apellidos != null && !apellidos.isBlank()
            && tipoMiembro != null && !tipoMiembro.isBlank();
    }
    
    
}
