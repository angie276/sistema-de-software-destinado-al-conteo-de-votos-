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
    private int numeroActa; // id de Acta
    private static int contadorActas = 1;

    public ActaElectoral() {
        miembros = new ArrayList<>();
        resultados = new ArrayList<>();
        firmas =new ArrayList<>();
        
        
    }
    
    public ActaElectoral(String tituloDocumento, String fecha, String hora, String lugar) {
        this(); // llamar al constructor x default
        this.tituloDocumento = tituloDocumento;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        numeroActa = contadorActas++;
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
    public int totalVotosEmitidos(){
       return totalVotosCandidatos()+ votosBlanco + votosNulos;
    }
    public int totalPreferenciales(){
       int contador = 0;
       for (int i = 0; i < resultados.size(); i++) {
           ResultadoCandidato r = resultados.get(i);
           contador += r.getPreferenciales();
           
       }
       return contador;     
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

    public List<ResultadoCandidato> getResultados() {
        return resultados;
    }

    public void setResultados(List<ResultadoCandidato> resultados) {
        this.resultados = resultados;
    }

    public int getTotalRegistrados() {
        return totalRegistrados;
    }

    public void setTotalRegistrados(int totalRegistrados) {
        this.totalRegistrados = totalRegistrados;
    }

    public int getTotalEfectivos() {
        return totalEfectivos;
    }

    public void setTotalEfectivos(int totalEfectivos) {
        this.totalEfectivos = totalEfectivos;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public String getTituloDocumento() {
        return tituloDocumento;
    }

    public void setTituloDocumento(String tituloDocumento) {
        this.tituloDocumento = tituloDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public List<MiembroMesa> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<MiembroMesa> miembros) {
        this.miembros = miembros;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public List<String> getFirmas() {
        return firmas;
    }

    public String getSello() {
        return sello;
    }
    public boolean datosCompletados() {
    return tituloDocumento != null && !tituloDocumento.isBlank()
            && fecha != null && !fecha.isBlank()
            && hora != null && !hora.isBlank()
            && lugar != null && !lugar.isBlank()
            && mesa != null
            && miembros != null && !miembros.isEmpty()
            && resultados != null && !resultados.isEmpty()
            && totalRegistrados > 0
            && totalEfectivos > 0
            && observaciones != null && !observaciones.isBlank()
            && firmas != null && !firmas.isEmpty()
            && sello != null && !sello.isBlank()
            && votosBlanco >= 0
            && votosNulos >= 0;
    }
    
    public void verVotosxCandidato(){ // CON RETURN 
        for (int i = 0; i < resultados.size(); i++) {
            ResultadoCandidato resul = resultados.get(i);
            System.out.println("Candidato: "+resul.getCandidato().nombreCompleto()
                    +"Partido: "+resul.getCandidato().getPartido().getNombrePartido());
            System.out.println("Votos Preferenciales: "+resul.getPreferenciales());
            System.out.println("Votos SImples: "+resul.getVotosSimples());
            System.out.println("Votos Totales: "+resul.calcularVotosTotales());
        }
    }
    


}
