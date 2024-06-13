
public class Usuario {

    private String Usuario;
    private String Clave;

    public Usuario() {
        setUsuario("Carlos");
        setClave("1234");
    }

    public boolean IngresarDatos(){
        String Usuario = "";
        String Clave = "";
        boolean sinDatos = true ;

        do {
            System.out.println("Ingrese su usuario: ");
            Usuario = App.sc.nextLine();
            System.out.println("Ingrese su clave: ");
            Clave = App.sc.nextLine();
            
            if(this.Usuario.equalsIgnoreCase(Usuario) 
            &&  this.Clave.equalsIgnoreCase(Clave))
                return true;
            
            else
                System.out.println("Sus datos son incorrecto," 
                                 + "por favor intente de nuevo");

        } while (sinDatos);
        return false;
    } 

    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String clave) {
        Clave = clave;
    }

    
}
