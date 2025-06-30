package sistema;
import java.util.List;
import java.util.ArrayList;
public class RegistroPartidos {
    private List<PartidoPolitico> partidos;

    public RegistroPartidos() {
        partidos = new ArrayList<>();
        
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
            partidos.add(p);
            return "Partido agregado exitosamente.";
        } else {
            return "No se puede agregar: datos incompletos o nombre repetido.";
        }
    }

    public PartidoPolitico buscarPartido(String nombre) {
        for (PartidoPolitico p : partidos) {
            if (p.getNombrePartido().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public String modificarPartido(String nombre, PartidoPolitico nuevo) {
        PartidoPolitico p = buscarPartido(nombre);
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

    public String eliminarPartido(String nombre) {
        PartidoPolitico p = buscarPartido(nombre);
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
