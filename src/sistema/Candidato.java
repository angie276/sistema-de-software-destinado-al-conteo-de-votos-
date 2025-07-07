
package sistema;

public class Candidato extends Persona {
    private PartidoPolitico partido;
    private Eleccion eleccion;

    public Candidato() {
        super();
    }     



    public Candidato(String DNI, String nombres, String apellidos, PartidoPolitico partido, Eleccion eleccion) {
        super(DNI, nombres, apellidos);
        this.partido = partido;
        this.eleccion = eleccion;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }

    

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }
    
    @Override
    public boolean datosCompletados() {
        return DNI != null && !DNI.isBlank() && nombres != null && !nombres.isBlank()
            && apellidos != null && !apellidos.isBlank()
            && partido != null;
    }    
    
}
