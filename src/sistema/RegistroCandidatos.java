
package sistema;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class RegistroCandidatos {
    private List<Candidato> candidatos;
    private int ids = 1;

    public RegistroCandidatos() {
        candidatos = new ArrayList<>();
    }
    public int longitud() {
        return candidatos.size();
    }

    public Candidato iesimo(int i) {
        return candidatos.get(i);
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
        return c4  !=null && c4.datosCompletados();
        
    }
    

    
    public String agregarCandidato(Candidato candidato){
        if(distintosDni(candidato)){
            candidato.setId(ids++);
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
              String dni = c3.getDNI();
              c.setDNI(dni);
              String nombres = c3.getNombres();
              c.setNombres(nombres);
              String apellidos = c3.getApellidos();
              c.setApellidos(apellidos);
              PartidoPolitico p = c3.getPartido();
              c.setPartido(p);
              Eleccion e = c3.getEleccion();
              c.setEleccion(e);
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
