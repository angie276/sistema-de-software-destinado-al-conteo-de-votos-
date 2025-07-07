
package sistema;

public class Operador extends Persona{
    private String usuario;
    private String contraseña;

 
    public Operador(String DNI, String nombres, String apellidos, String usuario, String contraseña) {
        super(DNI, nombres, apellidos);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    
    
    public boolean autenticar(String clave) {
        if (clave.length() != contraseña.length()){
            return false;
            
        }else{
            for (int i = 0; i < clave.length(); i++){
                if (clave.charAt(i) != contraseña.charAt(i)){
                    return false;
                }
            }
        }
        
        return true;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    @Override
    public boolean datosCompletados() {
        return DNI != null && !DNI.isBlank() && nombres != null && !nombres.isBlank()
            && apellidos != null && !apellidos.isBlank()
            && usuario != null && !usuario.isBlank()
            && contraseña != null && !contraseña.isBlank()    ;
    }    
    
        
    

    
}
