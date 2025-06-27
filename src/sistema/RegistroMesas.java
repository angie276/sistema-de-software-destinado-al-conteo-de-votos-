
package sistema;
import java.util.List;
import java.util.ArrayList;

public class RegistroMesas {
    private List<MesaElectoral> mesas;

    public RegistroMesas() {
        mesas = new ArrayList<>();
    }

    public List<MesaElectoral> getMesas() {
        return mesas;
    }

    public void setMesas(List<MesaElectoral> mesas) {
        this.mesas = mesas;
    }
    
    
}
