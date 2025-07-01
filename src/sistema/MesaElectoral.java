
package sistema;

public class MesaElectoral {
    private int idMesa;
    private RegistroMiembros miembros;
    private ActaElectoral acta;

    public MesaElectoral(RegistroMiembros miembros, ActaElectoral acta) {
        this.idMesa = idMesa;
        this.miembros = miembros;
        this.acta = acta;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public RegistroMiembros getMiembros() {
        return miembros;
    }

    public void setMiembros(RegistroMiembros miembros) {
        this.miembros = miembros;
    }

    public ActaElectoral getActa() {
        return acta;
    }

    public void setActa(ActaElectoral acta) {
        this.acta = acta;
    }
    public boolean datosCompletados(){
        return miembros.getMiembros().size() == RegistroMiembros.MAX && miembros != null;
    }
    

    
    
    
}
