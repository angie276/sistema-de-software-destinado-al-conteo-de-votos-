
package sistema;
import java.util.List;
import sistema.MesaElectoral;
import sistema.RegistroMesas;
public class Eleccion {
    private int codigo;
    private String fecha;
    private String tipoEleccion;
    private RegistroMesas mesas;
    private RegistroCandidatos candidatos;
    

    public Eleccion(String paraIU) {
        this.tipoEleccion = paraIU;
    }
    
    
    

    public Eleccion(String fecha, String tipoEleccion){
        this.fecha = fecha;
        this.tipoEleccion = tipoEleccion;
        mesas = new RegistroMesas(); 
    }
    public void setCodigo(int id){
        codigo = id;

   }
    public String verInfo(){
        return tipoEleccion+" - "+fecha;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public RegistroMesas getMesas() {
        return mesas;
    }

    public void setMesas(RegistroMesas mesas) {
        this.mesas = mesas;
    }

    public RegistroCandidatos getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(RegistroCandidatos candidatos) {
        this.candidatos = candidatos;
    }

    
    public boolean verificarTipoEleccion(){
        return tipoEleccion != null && (tipoEleccion.equalsIgnoreCase("Municipal") 
                || tipoEleccion.equalsIgnoreCase("Nacional") || tipoEleccion.equalsIgnoreCase("Referéndum")); // preguntar sobre la tílde
        
    }
    public boolean datosCompletados(){
        return fecha != null && !fecha.isBlank() 
                && tipoEleccion != null && !tipoEleccion.isBlank();
        
    }
    public void informeEleccion(){
 
        List<MesaElectoral> mesas2 = mesas.getMesas();
        int gRegistrados = 0;
        int gEmitidos = 0;
        int gNulos = 0;
        int gPreferenciales = 0;
        for (int i = 0; i < mesas2.size(); i++) {
             MesaElectoral mesa = mesas2.get(i);
             
             gRegistrados += mesa.getActa().getTotalRegistrados();
             gEmitidos += mesa.getActa().getTotalEfectivos();
             gNulos += mesa.getActa().getVotosNulos();
             gPreferenciales += mesa.getActa().totalPreferenciales();
        }     
        System.out.println("Votantes registrados: "+ gRegistrados);
        System.out.println("Votos emitidos: "+ gEmitidos); 
        System.out.println("Votos Nulos: "+ gNulos);
        System.out.println("Total votos prefrenciales: "+ gPreferenciales);
             
        

    }

    @Override
    public String toString(){
        return String.valueOf(codigo);
    }
    
    
    


}
