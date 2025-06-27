
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
    
    public void agregarEleccion(Eleccion nuevaEleccion){
        if(nuevaEleccion.verificarTipoEleccion()){
            Elecciones.add(nuevaEleccion);
        }else{
            System.out.println("Tipo de Elección inválido");
        }
    }
    
    public void buscarEleccion(int code){
        for (int i = 0; i < Elecciones.size(); i++) {
            if (Elecciones.get(i).getCodigo() == code){
                
                
            }
            
        }
    }
    
}
