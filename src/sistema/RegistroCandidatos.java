
package sistema;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
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

    public void agregarCandidato(Candidato candidato){
        if(candidatos.size() < max){
            candidatos.add(candidato);
            System.out.println("Candidato agregado");
            
        }else{
            System.out.println("Límite de candidatos alcanzado");
        }
        
    }
    public int buscarCandidato(int dni){ // me permite modificar y elminar candidatos
        for (int i = 0; i < candidatos.size(); i++) {
            if(candidatos.get(i).getDNI() == dni){
                return i; 
            }
            
                        
        }
        return -1;
    }
    
    public void modificarInfoCandidato(int DNI){
        int indice = buscarCandidato(DNI);
        
        if(indice >= 0){
            Candidato cand = candidatos.get(indice);
            Scanner sc = new Scanner(System.in);
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Nombre del partido: ");
            String partido = sc.nextLine();
            System.out.println("Sigla: ");
            String sigla = sc.nextLine();
            System.out.println("Logo: ");
            String logo = sc.nextLine();
            System.out.println("Representante legal: ");
            String representante = sc.nextLine();
            
            
            cand.setNombres(nombre);
            cand.setApellidos(apellido);
            PartidoPolitico partido2 = cand.getPartido();
            partido2.setNombrePartido(nombre);
            partido2.setLogo(logo);
            partido2.setRepresentanteLegal(representante);
            partido2.setSigla(sigla);
            System.out.println("Datos modificados");
            
                   
        }else{
            System.out.println("Candidato no encontrado");
        }
        
       
        
    }
    
    public void eliminarCandidato(int dNi){
        int i = buscarCandidato(dNi);
        if(i > -1){
          
            Candidato c = candidatos.get(i);
            candidatos.remove(c); // eliminar objeto
            System.out.println("Candidato eliminado");
                        
        }else{
            System.out.println("Candidato no encontrado");
        }
        
        
    }
    
    
}
