public class Juego {
    public  Guitarra nota;
    public Usuario usuario;
    private String [] Cancion;
    private String [] Biblioteca;

    public Juego(){
        this.usuario = new Usuario();
        this.Cancion = new String[20];
        this.Biblioteca = new String[20];
    }

    public void menuPrincipal(){
        if (!usuario.IngresarDatos()) {
            System.exit(0);
        }
        int opc = 0;
        do {
            System.out.println("\n1. Crear Nueva Canción");
            System.out.println("2. Elegir Canción");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opc = App.sc.nextInt();

            switch (opc) {
                case 1:
                    CrearCancion();
                    break;
                case 2:
                    System.out.println("Lo sentimos, no tienes ninguna canción creada por el momento.");
                    break;
                case 3:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            if (opc == 1 || opc == 2) {
                String respuesta;
                do {
                    System.out.print("¿Deseas regresar al menú principal? (S/N): ");
                    respuesta = App.sc.next();
                    if (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N")) {
                        System.out.println("Error: Opción no válida. Debes elegir 'S' o 'N'.");
                    }
                } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
        
                if (respuesta.equalsIgnoreCase("N")) {
                    System.out.println("Saliendo del programa...");
                    break; 
                }
        }
        } while (opc != 3 );
    }

    private void CrearCancion(){
        System.out.println("Crear Nueva Cancion");
    }
    private void editar(){
        System.out.println("Editar");
    }
    private void reproducir(){
        System.out.println("Reproduciendo");
    }
    private boolean guardar(){
        return true;
    }
}
