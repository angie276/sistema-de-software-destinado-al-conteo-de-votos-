
package sistema;
public class ResultadoCandidato {
    private Candidato candidato;
    private int votosSimples; // solo el partido 
    private int Preferenciales; //directamente al candidato

    public ResultadoCandidato(Candidato candidato, int simples, int Preferenciales) {
        this.candidato = candidato;
        votosSimples = simples;
        this.Preferenciales = Preferenciales;
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
    
    public int calcularVotosTotales(){
        return votosSimples + Preferenciales;
    }   
}
