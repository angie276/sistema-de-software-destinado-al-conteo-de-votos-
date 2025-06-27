
package sistema;

public class Candidato extends Persona {
    private PartidoPolitico partido;

   
    public Candidato(int DNI, String nombres, String apellidos, PartidoPolitico partido) {
        super(DNI, nombres, apellidos);
        this.partido = partido;
    }

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }
    
    
    
    
}
