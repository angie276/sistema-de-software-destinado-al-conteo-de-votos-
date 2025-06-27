package sistema;
import java.util.List;
import java.util.ArrayList;

public class RegistroMiembros {
    private List<MiembroMesa> miembros;

    public RegistroMiembros() {
        miembros = new ArrayList<>();
    }

    public List<MiembroMesa> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<MiembroMesa> miembros) {
        this.miembros = miembros;
    }
    
    
    
}
