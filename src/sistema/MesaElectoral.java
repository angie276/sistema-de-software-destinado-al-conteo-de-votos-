
package sistema;

import java.util.List;

public class MesaElectoral {
    private int idMesa;
    private RegistroMiembros miembros;
    private Eleccion eleccion;
    private String ubicacion;
    private ActaElectoral acta;

    public MesaElectoral(int idMesa, String ubicacion, Eleccion eleccion) {
        this.idMesa = idMesa;
        this.eleccion = eleccion;
        this.ubicacion = ubicacion;
        this.acta = null;
        this.miembros = new RegistroMiembros();
    }

    public MesaElectoral() {
        
    }
    
    public MesaElectoral(String paraIU){
        
        
    }
    public String verEnTabla(){
        return "("+idMesa+") "+ubicacion;
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
        return ubicacion != null && !ubicacion.isEmpty()
           && eleccion != null;
    }
    
    public void informeMesaElectoral(){
        System.out.println("Código de mesa electoral: " + idMesa);
        System.out.println("Votantes registrados: " + acta.getTotalRegistrados()); 
        System.out.println("Votos emitidos: " + acta.getTotalEfectivos());
        System.out.println("Votos nulos: " + acta.getVotosNulos());
        System.out.println("Total votos prefrenciales: "+acta.totalPreferenciales());
        System.out.println("Resultados de votos Prferenciales por Candidato: ");
        acta.mostrarVotosPreferencialesPorCandidato();
        
        

    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public String toString(){
        return String.valueOf(idMesa);
    }
    
    
}
