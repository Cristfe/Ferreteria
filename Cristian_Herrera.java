package cristian_herrera;
import java.io.IOException;
import java.util.*;

 


/**
 *
 * @author Cristian Herrera
 */
public class Cristian_Herrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
            Scanner lector = new Scanner (System.in) .useDelimiter("\\n");
            String opcion;
            int codProducto;
            String Nombre = null;
            int Cantidad;
            String Descripcion;
            producto p = new producto();
            
            do {
                System.out.println("1. Altas");
                System.out.println("2. Buscar");
                System.out.println("3. Listado");
                System.out.println("4. Fin");
                System.out.println("Introduzca opción deseada");
                opcion= lector.next();
                switch (opcion){
                    case "1": //altas
                        System.out.println("Introduzca CodProducto");
                        codProducto= lector.nextInt();
                        System.out.println("Introduzca Nombre");
                        Nombre= lector.next();
                        System.out.println("Introduzca Cantidad");
                        Cantidad= lector.nextInt();
                        System.out.println("Introduzca Descripcion");
                        Descripcion= lector.next();
                        p.setcodProducto(codProducto);
                        p.setNombre(Nombre);
                        p.setCantidad(Cantidad);
                        p.setDescripcion(Descripcion);
                        p.altas();
                        break;
                        
                    case "2": //buscar
                       System.out.println("Introduzca CodProducto");
                    
                       p.buscar(Nombre);
                       codProducto= lector.nextInt();
                       p.buscar(Nombre);
                       
                        break;
                        
                    case "3": //listado
                        p.listado();
                        break;
                    
                    case "4": //Fin
                        
                        System.out.println("Fin de aplicación");
                        break;
                                    
                }
            }
            while (!Objects.equals(opcion,"FIN"));
            
            System.out.println("Fin de aplicación");
    }

    
}
