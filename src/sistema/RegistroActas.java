
package sistema;

import java.util.ArrayList;
import java.util.List;

public class RegistroActas {
    private List<ActaElectoral> Actas;
    private int ids=1;

    public RegistroActas() {
        Actas = new ArrayList<>();
    }
    public int longitud() {
        return Actas.size();
    }

    public ActaElectoral iesimo(int i) {
        return Actas.get(i);
    }   
    
    public List<ActaElectoral> getActas() {
        return Actas;
    }

    public void setActas(List<ActaElectoral> Actas) {
        this.Actas = Actas;
    }
    
    public int cantidadActas(){
       return Actas.size();
       
    }
    public boolean datosCompletados(ActaElectoral acta) {
        return acta != null && acta.datosCompletados();
    }

    
    
    public String agregarActa(ActaElectoral nuevaActa){
        if(datosCompletados(nuevaActa)){
            nuevaActa.setNumeroActa(ids++);
            Actas.add(nuevaActa);
            return "Acta agregada con número único: "+nuevaActa.getNumeroActa();

            
        }else{
            return "No se pudo registrar el acta. "
                    + "Hay datos incompletos";
            
        }
            
    }
    
    
    public List<ActaElectoral> verActas(){
        return Actas;  // muestra la lista
         
    }
    public ActaElectoral buscarActa(int idacta){
        for (int i = 0; i < Actas.size(); i++) {
            if(Actas.get(i).getNumeroActa() == idacta){
                return Actas.get(i) ;
                
            }
                
            
        }
        return null;   
        
    }
    public String modificarActa(int idA, ActaElectoral a2){
        ActaElectoral a = buscarActa(idA);
        if(a != null){
            if(datosCompletados(a2)){
                String titulo = a2.getTituloDocumento();
                a.setTituloDocumento(titulo);
                String fecha = a2.getFecha();
                a.setFecha(fecha);
                String hora = a2.getHora();
                a.setHora(hora);
              
                List<ResultadoCandidato> resultados = a2.getResultados();
                a.setResultados(resultados);
                int totalRegistrados = a2.getTotalRegistrados();
                a.setTotalRegistrados(totalRegistrados);
                int totalEfectivos = a2.getTotalEfectivos();
                a.setTotalEfectivos(totalEfectivos);
                int votosBlanco = a2.getVotosBlanco();
                a.setVotosBlanco(votosBlanco);
                int votosNulos = a2.getVotosNulos();
                a.setVotosNulos(votosNulos);
                String observaciones = a2.getObservaciones();
                a.setObservaciones(observaciones);
                List<String> firmas = a2.getFirmas();
                a.setFirmas(firmas);
                String sello = a2.getSello();
                a.setSello(sello);
                return "Acta electoral modificada!";
            }else{
                return "COmpletar todos los datos";
            }
        }else{
            return "Acta no registrada";
        }
        
        
    }
    public String eliminarActa(int id){
        ActaElectoral aea = buscarActa(id);
        if(aea != null){
            Actas.remove(aea);
            return "Acta eliminada";
            
            
        }else{
            return "Acta no registrada";
        }
        
    }
    
    
}
