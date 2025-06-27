
package sistema;

public class Eleccion {
    private int codigo;
    private static int c = 1;
    private String fecha;
    private String tipoEleccion;
    private RegistroCandidatos candidatos;
    private RegistroMesas mesas;


    public Eleccion(String fecha, String tipoEleccion, RegistroCandidatos candidatos) { // El operador solo ingresara estos datos 
        codigo = c++;
        this.fecha = fecha;
        this.tipoEleccion = tipoEleccion;
        this.candidatos = candidatos;
        mesas = new RegistroMesas(); // se inicaliza para que pueda ser utilizado más adelante
    }

    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public RegistroMesas getMesas() {
        return mesas;
    }

    public void setMesas(RegistroMesas mesas) {
        this.mesas = mesas;
    }
    

    public boolean verificarTipoEleccion(){
        return tipoEleccion != null && (tipoEleccion.equalsIgnoreCase("Municipal") 
                || tipoEleccion.equalsIgnoreCase("Nacional") || tipoEleccion.equalsIgnoreCase("Referendum")); // preguntar sobre la tílde
        
    }
    public boolean datosCompletados(){
        return fecha != null && !fecha.isBlank() 
                && tipoEleccion != null && !tipoEleccion.isBlank(); 
                   // FALTA CANDIDATO
        
    }
    public void informeEleccion(){
        int totalVotantes = 0;
        int votosNulos = 0;
        int votosEmitidos = 0;
        int resultadoVotosPreferenciales = 0;
        
        for (int i = 0; i < mesas.getActa(); i++) {
            
            
        }
        
    }

    
    
    


}
