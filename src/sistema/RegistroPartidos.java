package sistema;
import java.util.List;
import java.util.ArrayList;
public class RegistroPartidos {
    private List<PartidoPolitico> partidos;

    public RegistroPartidos() {
        partidos = new ArrayList<>();
        
    }

    public List<PartidoPolitico> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<PartidoPolitico> partidos) {
        this.partidos = partidos;
    }
    
    
    
    
}
