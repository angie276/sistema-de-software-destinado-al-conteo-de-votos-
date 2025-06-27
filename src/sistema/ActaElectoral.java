package sistema;
import java.util.List;
import java.util.ArrayList;

public class ActaElectoral {
    private String tituloDocumento;
    private String fecha;
    private String hora;
    private String lugar;
    private MesaElectoral mesa;
    private List<MiembroMesa> miembros;
    private List<ResultadoCandidato> resultados;
    private int totalRegistrados;
    private int totalEfectivos;
    private int votosBlanco;
    private int votosNulos;
    private String observaciones;
    private List<String> firmas;
    private String sello;
    private int numeroActa;

    public ActaElectoral() {
        miembros = new ArrayList<>();
        resultados = new ArrayList<>();
        firmas =new ArrayList<>();
        
        
    }
    
    public ActaElectoral(String tituloDocumento, String fecha, String hora, String lugar, int numeroActa) {
        this(); // llamar al constructor x default
        this.tituloDocumento = tituloDocumento;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.numeroActa = numeroActa;
    }

    
    public ActaElectoral(List<ResultadoCandidato> resultaados, int totalRegistrados, int totalEfectivos, int votosBlanco, int votosNulos) {
        this.resultados = resultaados;
        this.totalRegistrados = totalRegistrados;
        this.totalEfectivos = totalEfectivos;
        this.votosBlanco = votosBlanco;
        this.votosNulos = votosNulos;
    }

    public ActaElectoral(MesaElectoral mesa, List<MiembroMesa> miembros) {
        this.mesa = mesa;
        this.miembros = miembros;
    }

    public ActaElectoral(String observaciones, List<String> firmas, String sello) {
        this.observaciones = observaciones;
        this.firmas = firmas;
        this.sello = sello;
    }
    public int totalVotosCandidatos(){ // la suma total de los votos totales por cada candidato
        int total = 0;
        for (int i = 0; i < resultados.size(); i++) {
            ResultadoCandidato resultado = resultados.get(i); 
            total += resultado.calcularVotosTotales();
            
            
        }
         return total;  
    }
   
 
    public void setTotales(int registrados, int efectivos, int blancos, int nulos) {
        this.totalRegistrados = registrados;
        this.totalEfectivos = efectivos;
        this.votosBlanco = blancos;
        this.votosNulos = nulos;
    }

    public void setObservaciones(String obs) {
        this.observaciones = obs;
    }

    public void setFirmas(List<String> firmas) {
        this.firmas = firmas;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public int getNumeroActa() {
        return numeroActa;
    }
    public boolean datosCompletados(){
        return tituloDocumento != null && !tituloDocumento.isBlank()
                && fecha != null && !fecha.isBlank() // Revisa si solo hay aespacios o vacío
                && hora != null && !hora.isBlank()
                && lugar != null && !lugar.isBlank()
                && mesa != null
                && miembros != null && !miembros.isEmpty()
                && resultados != null && !resultados.isEmpty() //Verifica si no contiene ningún elemento
                && totalRegistrados > 0
                && totalEfectivos > 0
                && numeroActa > 0 
                && observaciones != null && !observaciones.isBlank()
                && firmas != null && !firmas.isEmpty() 
                && sello != null && !sello.isBlank()
                && votosBlanco >= 0 && votosNulos >= 0;
               
    }

}
