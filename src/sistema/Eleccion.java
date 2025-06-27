
package sistema;
import java.util.List;
public class Eleccion {
    private int codigo;
    private static int c = 1;
    private String fecha;
    private String tipoEleccion;
    private RegistroCandidatos candidatos;
    private RegistroMesas mesas;


    public Eleccion(String fecha, String tipoEleccion, RegistroCandidatos candidatos) { // El operador solo ingresara estos datos 
        codigo = c++;
        this.fecha = fecha;
        this.tipoEleccion = tipoEleccion;
        this.candidatos = candidatos;
        mesas = new RegistroMesas(); // se inicaliza para que pueda ser utilizado más adelante
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
    

    public boolean verificarTipoEleccion(){
        return tipoEleccion != null && (tipoEleccion.equalsIgnoreCase("Municipal") 
                || tipoEleccion.equalsIgnoreCase("Nacional") || tipoEleccion.equalsIgnoreCase("Referendum")); // preguntar sobre la tílde
        
    }
    public boolean datosCompletados(){
        return fecha != null && !fecha.isBlank() 
                && tipoEleccion != null && !tipoEleccion.isBlank(); 
                   // FALTA CANDIDATO
        
    }
    public void informeEleccion(){
 
        List<MesaElectoral> mesas2 = mesas.getMesas();
        for (int i = 0; i < mesas2.size(); i++) {
             MesaElectoral mesa = mesas2.get(i);
             System.out.println("Código mesa electorla: "+ mesa.getIdMesa());
             System.out.println("Número total de votantes: "+ mesa.getActa().getTotalEfectivos());
             System.out.println("Vots Nulos: "+mesa.getActa().getVotosNulos());
             System.out.println("Votos emitidos: "+mesa.getActa().totalVotosEmitidos());
             System.out.println("Total votos prefrenciales: "+mesa.getActa().totalPreferenciales());
             System.out.println("Resultados de votos Prferenciales por Candidato: ");
             mesa.getActa().verVotosxCandidato();
             
        }
        

        
    }

    
    
    


}
