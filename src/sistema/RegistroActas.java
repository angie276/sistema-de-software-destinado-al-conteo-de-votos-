
package sistema;

import java.util.ArrayList;
import java.util.List;

public class RegistroActas {
    private List<ActaElectoral> Actas;

    public RegistroActas() {
        Actas = new ArrayList<>();
    }
    
    public int cantidadActas(){
       return Actas.size();
       
    } 
    
    public void agregarActas(ActaElectoral nuevaActa){
        if(nuevaActa.datosCompletados()){
            Actas.add(nuevaActa); 

            
        }else{
            System.out.println("No se pudo registrar el acta. "
                    + "Hay datos incompletos");
            
        }
            
    }
    
    public List<ActaElectoral> verActas(){
        return Actas;  // muestra la lista
         
    }
    
    
    
}
