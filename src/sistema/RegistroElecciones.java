
package sistema;
import java.util.List;
import java.util.ArrayList;

public class RegistroElecciones {
    private List<Eleccion> Elecciones;

    public RegistroElecciones() {
        Elecciones = new ArrayList<>();
        
    }

    public List<Eleccion> getElecciones() {
        return Elecciones;
    }

    public void setElecciones(List<Eleccion> Elecciones) {
        this.Elecciones = Elecciones;
    }
    
    public boolean datosCompletados(Eleccion ee){
        return ee != null && ee.datosCompletados();
    }
    
    
    public String  agregarEleccion(Eleccion nuevaEleccion){
        if(nuevaEleccion.verificarTipoEleccion()){
            Elecciones.add(nuevaEleccion);
            return "Elección agregada. Id: "+nuevaEleccion.getCodigo();
        }else{
           return "Tipo de Elección inválido";
        }
    }
    
    public Eleccion buscarEleccion(int code){
        for (int i = 0; i < Elecciones.size(); i++) {
            if (Elecciones.get(i).getCodigo() == code){
                return Elecciones.get(i);
                
                
            }
            
        }
        return null;    
    }
    public String modificarEleccion(int id, Eleccion nueva) {
        Eleccion e = buscarEleccion(id);
        if (e != null) {
            if (datosCompletados(nueva)) {
                e.setFecha(nueva.getFecha());
                e.setTipoEleccion(nueva.getTipoEleccion());
                e.setCandidatos(nueva.getCandidatos());
                return "Elección modificada";
            } else {
                return "Tipo de elección inválido";
            }
        } else {
            return "Elección no encontrada";
        }
    }

    public String eliminarEleccion(int id) {
        Eleccion e = buscarEleccion(id);
        if (e != null) {
            Elecciones.remove(e);
            return "Elección eliminada";
        } else {
            return "Elección no registrada";
        }
    }

    public int cantidadElecciones() {
        return Elecciones.size();
    }
    
    
    
    
}
