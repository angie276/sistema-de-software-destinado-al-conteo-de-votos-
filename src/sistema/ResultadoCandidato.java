
package sistema;

public class ResultadoCandidato {
    private Candidato candidato;
    private int votosSimples; // solo el partido 
    private int Preferenciales; //directamente al candidato  /// simples 

    public ResultadoCandidato() {
    }

    public ResultadoCandidato(Candidato candidato) {
        this.candidato = candidato;
        votosSimples = 0;
        Preferenciales = 0;
         
        
    }
    
    public void sumarVotos(int simples, int preferenciales) {
        this.votosSimples += simples;
        this.Preferenciales += preferenciales;
    }
    
 
    
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getVotosSimples() {
        return votosSimples;
    }

    public void setVotosSimples(int simples) {
        votosSimples = simples;
    }

    public int getPreferenciales() {
        return Preferenciales;
    }

    public void setPreferenciales(int Preferenciales) {
        this.Preferenciales = Preferenciales;
    }
    
    
    public int calcularVotosValidos(){
        return votosSimples + Preferenciales;
    }
    
    public String detalleVotosCandidato() {
        return "Candidato: " + candidato.getNombres() + " " + candidato.getApellidos() + 
            "\n" + "Votos simples: " + votosSimples +
            "\n" + "Votos preferenciales: " + Preferenciales +
            "\n" + "Votos válidos: " + calcularVotosValidos();    
    }
    
    
}
