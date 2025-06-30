
package sistema;

public class PartidoPolitico {
    private int id;
    private static int contador = 1; 
    private String nombrePartido;
    private String sigla;
    private String logo;
    private String representanteLegal;
    

    public PartidoPolitico(String nombrePartido, String sigla, String logo, String representanteLegal) {
        id = contador ++; // incrementa automáticamente
        this.nombrePartido = nombrePartido;
        this.sigla = sigla;
        this.logo = logo;
        this.representanteLegal = representanteLegal;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public int getId() { // permite trbajar con ese dato en buscar, modificar y eliminar
        return id;
    }
    public boolean datosCompletados(){
        return nombrePartido != null && !nombrePartido.isBlank()
                && sigla != null && !sigla.isBlank()
                && logo != null && !logo.isBlank()
                && representanteLegal != null && !representanteLegal.isBlank();
    }
    
    
}
