
package sistema;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import sistema.Candidato;
import sistema.PartidoPolitico;
public class RegistroCandidatos {
    private Eleccion eleccion;
    private List<Candidato> candidatos;
    private static int max;

    public RegistroCandidatos(Eleccion eleccion) { // Recibe los datos del objeto elección creado
        this.eleccion = eleccion;
        candidatos = new ArrayList<>();
    
        if(eleccion.getTipoEleccion().equalsIgnoreCase("nacional")){
            max =  20;
        }else if(eleccion.getTipoEleccion().equalsIgnoreCase("municipal")){
            max =  6;
            
        }else{
            max = 0;
        }
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
    public boolean distintosDni(Candidato can){
        for (int i = 0; i < candidatos.size(); i++) {
            if(can.getDNI() == candidatos.get(i).getDNI()){
                return false;
            }
            
        }
        return true;
    }
    public boolean datosCompletados(Candidato c4){
        return c4  !=null && !c4.datosCompletados();
        
    }
    

    
    public String agregarCandidato(Candidato candidato){
        if(candidatos.size() < max && distintosDni(candidato)){
            candidatos.add(candidato);
            return "Candidato agregado con código: "+candidato.getId();
            
        }else{
            return "Límite de candidatos alcanzado";
        }
        
    }
    public Candidato buscarCandidato(int id){ // me permite modificar y elminar candidatos
        for (int i = 0; i < candidatos.size(); i++) {
            if(candidatos.get(i).getId() == id){
                return candidatos.get(i); 
            }
            
                        
        }
        return null;
    }
    
    public String modificarInfoCandidato(int id, Candidato c3){
        Candidato c = buscarCandidato(id);
        
        if(c != null){
            if(datosCompletados(c3)){
              int dni = c3.getDNI();
              c.setDNI(dni);
              String nombres = c3.getNombres();
              c.setNombres(nombres);
              String apellidos = c3.getApellidos();
              c.setApellidos(apellidos);
              PartidoPolitico p = c3.getPartido();
              c.setPartido(p);
              return "Datos modificados!";                
                
            }else{
                return "Datos imcompletos";
            }
                          
        }else{
            return "Candidato no encontrado";
        }
               
    }
    
    public String eliminarCandidato(int id){
        Candidato i = buscarCandidato(id);
        if(i != null){
            candidatos.remove(i); // eliminar objeto
            return "Candidato eliminado";
                        
        }else{
            return "Candidato no encontrado";
        }
        
        
    }
    
    
}
