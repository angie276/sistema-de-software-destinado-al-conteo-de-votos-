
package sistema;
import java.util.List;
import java.util.ArrayList;

public class RegistroMesas {
    private List<MesaElectoral> mesas;
    private final static int max = 1000;

    public RegistroMesas() {
        mesas = new ArrayList<>();
    }

    public List<MesaElectoral> getMesas() {
        return mesas;
    }

    public void setMesas(List<MesaElectoral> mesas) {
        this.mesas = mesas;
    }
    
    public MesaElectoral buscarMesa(int id){
        for (int i = 0; i < mesas.size(); i++) {
            if(mesas.get(i).getIdMesa() == id){
                return mesas.get(i);
                
            }
            
        }
        return null;
        
    }
    public String agregarMesa(MesaElectoral m){
        if(mesas.size() < max){
            mesas.add(m);
            return "Mesa Electoral agregada";

        }
        return "Limite completado";
        
    }
    public String modificarMesa(int id, MesaElectoral m1){
         MesaElectoral m = buscarMesa(id);
         if(m != null){
             int t = m1.getTotalAsignados();
             m.setTotalAsignados(t);
             return "Cambio actualizado";
             
             
         }
         return "Mesa electoral no registrada";
        
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
