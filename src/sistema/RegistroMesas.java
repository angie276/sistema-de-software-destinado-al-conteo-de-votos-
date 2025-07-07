
package sistema;
import java.util.List;
import java.util.ArrayList;

public class RegistroMesas {
    private List<MesaElectoral> mesas;
    private final static int MAX = 1000;
    private int ids= 1;

    public RegistroMesas() {
        mesas = new ArrayList<>();
    }

    public List<MesaElectoral> getMesas() {
        return mesas;
    }
     public int longitud() {
        return mesas.size();
    }

    public MesaElectoral iesimo(int i) {
        return mesas.get(i);
    }   
    
    public void setMesas(List<MesaElectoral> mesas) {
        this.mesas = mesas;
    }
    public boolean escodigoUnico(int codigo, Eleccion eleccion) {
        for (int i = 0; i < mesas.size(); i++) {
            MesaElectoral m = mesas.get(i);
            if (m.getIdMesa() == codigo && m.getEleccion().equals(eleccion)) {
                return true;
            }
        }
        return false;
    }
    
    public MesaElectoral buscarMesa(int id){
        for (int i = 0; i < mesas.size(); i++) {
            if(mesas.get(i).getIdMesa() == id){
                return mesas.get(i);
                
            }
            
        }
        return null;
        
    }
    public String agregarMesa(MesaElectoral m) {
        if (escodigoUnico(m.getIdMesa(), m.getEleccion())) {
            return "Ya existe una mesa con ese código en esta elección.";
        }

        if (mesas.size() < MAX) {
            mesas.add(m);
            return "Mesa Electoral agregada";
        }

        return "Límite completado";
    }
    public String modificarMesa(int id, String nuevaUbicacion, Eleccion nuevaEleccion) {
        MesaElectoral m = buscarMesa(id);
        if (m != null) {
            
            for (int i = 0; i < mesas.size(); i++) {
                MesaElectoral otra = mesas.get(i);
                if (otra != m && otra.getIdMesa() == id && otra.getEleccion().equals(nuevaEleccion)) {
                    return "Código repetido";
                }
            }

            m.setUbicacion(nuevaUbicacion);
            m.setEleccion(nuevaEleccion);
            return "Mesa modificada ";
        } else {
            return "Mesa electoral no registrada ";
        }
    }
    public String elliminarMesa(int id){
        MesaElectoral mm = buscarMesa(id);
        if(mm != null){
            mesas.remove(mm);
            return "Mesa electoral eliminada";
            
        }
        return "Mesa electoral no registrada";
    }
    
    
}
