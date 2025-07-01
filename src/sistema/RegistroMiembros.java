package sistema;
import java.util.List;
import java.util.ArrayList;

public class RegistroMiembros {
    private List<MiembroMesa> miembros;
    public static final int MAX = 3;
    

    public RegistroMiembros() {
        miembros = new ArrayList<>();
    }

    public List<MiembroMesa> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<MiembroMesa> miembros) {
        this.miembros = miembros;
    }
    
    public boolean datosCompletados(MiembroMesa m){
        return m != null && m.datosCompletados();
        
    }
    public MiembroMesa buscarMiembro(int id){
        for (int i = 0; i < miembros.size(); i++) {
            if(miembros.get(i).getId() == id){
                return miembros.get(i);
                
            }
            
        }
        return null;
    }
        
    public String agregarMiembro(MiembroMesa m){
        if(miembros.size() < MAX){
            miembros.add(m);
            return "Miembro de mesa añadido";
            
        }else{
            return "Límite completado";
        }
        
    }
    public String modificarMiembro(int id, MiembroMesa m2){
        MiembroMesa m = buscarMiembro(id);
        if(m != null){
            if(datosCompletados(m2)){
                int dni = m2.getDNI();
                m.setDNI(dni);
                String nombres = m2.getNombres();
                m.setNombres(nombres);
                String apellidos = m2.getApellidos();
                m.setApellidos(apellidos);
                return "Datos actualizados!";
  
            }else{
                return "Datos incompletos";
            }
            
        }else{
            return "Miembro de mesa no registrado";
        }
        
        
        
    }
    public String eliminarMiembro(int id){
        MiembroMesa m2 = buscarMiembro(id);
        if(m2!=null){
            miembros.remove(m2);
            return "Miembro de mesa eliminado";
            
        }
        return "Miembro de mesa no registrado";
    }
    
    
    
}
