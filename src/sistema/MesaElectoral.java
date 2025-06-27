
package sistema;

public class MesaElectoral {
    private int idMesa;
    private RegistroMiembros miembros;
    private ActaElectoral acta;

    public MesaElectoral(int idMesa, RegistroMiembros miembros, ActaElectoral acta) {
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

    public ActaElectoral getActas() {
        return acta;
    }

    public void setActas(ActaElectoral acta) {
        this.acta = acta;
    }
    
    
    
    
    
}
