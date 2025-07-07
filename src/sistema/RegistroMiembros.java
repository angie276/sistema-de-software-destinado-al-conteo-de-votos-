package sistema;
import java.util.List;
import java.util.ArrayList;

public class RegistroMiembros {
    private List<MiembroMesa> miembros;
    public static final int MAX = 3;
    private int ids = 1;
    

    public RegistroMiembros() {
        miembros = new ArrayList<>();
    }
     public int longitud() {
        return miembros.size();
    }

    public MiembroMesa iesimo(int i) {
        return miembros.get(i);
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
        if(!m.datosCompletados()){
            return "Datos incompletos";
            
        }        
        if (miembros.size() >= MAX) {
            return "Límite completado";
        }

        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getTipoMiembro().equals(m.getTipoMiembro())) {
                return "Ya existe un miembro con el tipo: " + m.getTipoMiembro();
            }
        }

                
        m.setId(ids++);
        miembros.add(m);
        return "Miembro de mesa añadido"+"\n"+
                "ID Miembro de Mesa: "+m.getId();

    }
    public String modificarMiembro(int id, MiembroMesa m2){
        MiembroMesa m = buscarMiembro(id);
        if(m != null){
            if(datosCompletados(m2)){
                String dni = m2.getDNI();
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
