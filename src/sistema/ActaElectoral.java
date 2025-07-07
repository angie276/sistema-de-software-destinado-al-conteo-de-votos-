package sistema;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ActaElectoral {
    private String tituloDocumento;
    private String fecha;
    private String hora;
    private MesaElectoral mesa;
    private List<ResultadoCandidato> resultados;
    private int totalRegistrados;
    private int totalEfectivos;
    private int votosBlanco;
    private int votosNulos;
    private String observaciones;
    private List<String> firmas;
    private String sello;
    private int numeroActa; // id de Acta

    public ActaElectoral() {
        resultados = new ArrayList<>();
        firmas =new ArrayList<>();
        
        
    }
    
    public ActaElectoral(String tituloDocumento, String fecha, String hora) {
        this(); // llamar al constructor x default
        this.tituloDocumento = tituloDocumento;
        this.fecha = fecha;
        this.hora = hora;
    }

    public ActaElectoral(String titulo, String fecha, String hora, MesaElectoral mesa,
                         String observaciones, List<String> firmas, String sello) {
        this();
        this.tituloDocumento = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.observaciones = observaciones;
        this.firmas = firmas;
        this.sello = sello;
    }
    
    public ActaElectoral(MesaElectoral mesa, List<Candidato> candidatos) {
        this(); 
        this.mesa = mesa;
        this.votosBlanco = generarVotosBlanco();
        this.votosNulos = generarVotosNulos();
        this.totalRegistrados = generarTotalRegistrados();
        generarVotos(candidatos);
        this.totalEfectivos = totalValidos() + votosBlanco + votosNulos;
        
    }

    public ActaElectoral(String observaciones, List<String> firmas, String sello) {
        this.observaciones = observaciones;
        this.firmas = firmas;
        this.sello = sello;
    }
    public int totalValidos(){ // la suma total de los votos totales por cada candidato
        int total = 0;
        for (int i = 0; i < resultados.size(); i++) {
            ResultadoCandidato resultado = resultados.get(i); 
            total += resultado.calcularVotosValidos();
            
            
        }
         return total;  
    }
    
    public int generarVotosBlanco(){
        return new Random().nextInt(50, 200);
        
    }
    public int generarVotosNulos(){
        return new Random().nextInt(50, 200);
        
    }
    public int generarTotalRegistrados(){
        return new Random().nextInt(200, 400);
    }
    public void generarVotos(List<Candidato> candidatos){
        Random r = new Random();
        int asistentes = r.nextInt(totalRegistrados + 1);  
        for (int i = 0; i < candidatos.size(); i++) {
            int simple = r.nextInt(asistentes/(candidatos.size()+1));
            int preferenciales = validarPreferenciales(candidatos.get(i)); 

            ResultadoCandidato r2 = new ResultadoCandidato(candidatos.get(i));
            r2.sumarVotos(simple, preferenciales);

            resultados.add(r2);
        }
        
    }
    
   public int validarPreferenciales(Candidato c){
        Random r = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("El candidato "+c.getNombres()+"posee votos preferenciales? (sí/no)");
        String rpta = sc.nextLine();
        if(rpta.equalsIgnoreCase("sí") || rpta.equalsIgnoreCase("si")){
            return r.nextInt(11);
        }
        
        return 0;
        
    }
    public void mostrarVotosPreferencialesPorCandidato() {
        for (ResultadoCandidato rc : resultados) {
            System.out.println("Candidato: " + rc.getCandidato().getNombres());
            System.out.println("Votos preferenciales: " + rc.getPreferenciales());
        }
    }

    public void setNumeroActa(int numeroActa) {
        this.numeroActa = numeroActa;
    }
    
    
    
    public int totalPreferenciales(){
       int contador = 0;
       for (int i = 0; i < resultados.size(); i++) {
           ResultadoCandidato r = resultados.get(i);
           contador += r.getPreferenciales();
           
       }
       return contador;     
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


    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
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
            && mesa != null
            && observaciones != null && !observaciones.isBlank()
            && firmas != null && !firmas.isEmpty()
            && sello != null && !sello.isBlank();
    }
    public boolean votosGenerados() {
    return resultados != null && !resultados.isEmpty()
        && totalRegistrados > 0
        && totalEfectivos > 0
        && votosBlanco >= 0
        && votosNulos >= 0;
}


    


}
