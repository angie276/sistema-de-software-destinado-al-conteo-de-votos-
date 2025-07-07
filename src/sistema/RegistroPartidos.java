package sistema;
import java.util.List;
import java.util.ArrayList;
public class RegistroPartidos {
    private List<PartidoPolitico> partidos;
    private int ids= 1;
     

    public RegistroPartidos() {
        partidos = new ArrayList<>();
        
    }

    public List<PartidoPolitico> getPartidos() {
        return partidos;
    }
     public int longitud() {
        return partidos.size();
    }

    public PartidoPolitico iesimo(int i) {
        return partidos.get(i);
    }   
    

    public void setPartidos(List<PartidoPolitico> partidos) {
        this.partidos = partidos;
    }
    public boolean datosCompletados(PartidoPolitico p) {
        return p != null && p.datosCompletados();
    }

    public boolean nombresDistintos(PartidoPolitico p) {
        for (PartidoPolitico part : partidos) {
            if (part.getNombrePartido().equalsIgnoreCase(p.getNombrePartido())) {
                return false;
            }
        }
        return true;
    }


    public String agregarPartido(PartidoPolitico p) {
        if (datosCompletados(p) && nombresDistintos(p)) {
            p.setId(ids++);
            partidos.add(p);
            return "Partido agregado exitosamente."+"\n"+"ID partido político: "+p.getId();
        } else {
            return "No se puede agregar: datos incompletos o nombre repetido.";
        }
    }

    public PartidoPolitico buscarPartido(int id) {
        for (PartidoPolitico p : partidos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public String modificarPartido(int id, PartidoPolitico nuevo) {
        PartidoPolitico p = buscarPartido(id);
        if (p != null) {
            if (datosCompletados(nuevo)) {
                p.setNombrePartido(nuevo.getNombrePartido());
                p.setSigla(nuevo.getSigla());
                p.setLogo(nuevo.getLogo());
                return "Partido modificado correctamente.";
            } else {
                return "Datos incompletos.";
            }
        } else {
            return "Partido no encontrado.";
        }
    }

    public String eliminarPartido(int id) {
        PartidoPolitico p = buscarPartido(id);
        if (p != null) {
            partidos.remove(p);
            return "Partido eliminado.";
        } else {
            return "Partido no encontrado.";
        }
    }

    public int cantidadPartidos() {
        return partidos.size();
    }

    public List<PartidoPolitico> verPartidos() {
        return partidos;
    }    
    
    
    
    
}
