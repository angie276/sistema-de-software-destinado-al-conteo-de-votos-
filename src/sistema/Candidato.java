
package sistema;

public class Candidato extends Persona {
    private PartidoPolitico partido;

    public Candidato() {
        super();
        partido = new PartidoPolitico();
    }
     
    public Candidato(String DNI, String nombres, String apellidos, PartidoPolitico partido) {
        super(DNI, nombres, apellidos);
        this.partido = partido;
    }
    
    
    
}
