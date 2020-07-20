/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristian_herrera;

import java.io.*;
import java.io.IOException;




/**
 *
 * @author Cristian Herrera
 */
public class producto {
    
   private int codProducto;
   private String Nombre;
   private int Cantidad;
   private String Descripcion;
   
   
   public producto(int codProducto, String Nombre, int Cantidad, String Descripcion) {
       this.codProducto = codProducto;
       this.Nombre = Nombre;
       this.Cantidad = Cantidad;
       this.Descripcion = Descripcion;
   }
    public producto(){
       
   }
   
  
   public int getcodProducto(){
       return codProducto;
   }
   
   public void setcodProducto(int codProducto){
       this.codProducto = codProducto;
   }
   public String getNombre(){
       return Nombre;
   }
   public void setNombre(String Nombre) {
       this.Nombre = Nombre;
   }
   public int setCantidad(){
       return Cantidad;
   }
   public void setCantidad(int Cantidad) {
       this.Cantidad = Cantidad;
   }
   public String getDescripcion() {
       return Descripcion;
   }
   public void setDescripcion(String Descripcion) {
       this.Descripcion = Descripcion;
   }
   public void altas () {
       File fichero = new File ("C:\\pruebas\\productos.txt");
       try {
           FileOutputStream fileout = new FileOutputStream (fichero, true);
           DataOutputStream p = new DataOutputStream (fileout);
           p.writeInt(codProducto);
           p.writeUTF(Nombre);
           p.writeInt(Cantidad);
           p.writeUTF(Descripcion);
           p.close();    
       }
       catch (IOException ex){
           System.out.println("Error al grabar" + ex.getMessage());
       }
   }
   public void listado()  {
       
       try {
         File fichero = new File ("C:\\pruebas\\productos.txt");
         DataInputStream datain = new DataInputStream (new FileInputStream(fichero));  
         Nombre = datain.readUTF();
           while (Nombre !=null) {
               codProducto = datain.readInt();
               Nombre = datain.readUTF();
               Cantidad = datain.readInt();
               Descripcion = datain.readUTF();
               System.out.println("codProducto: " + codProducto + "Nombre" + Nombre + "Cantidad" + Cantidad + "Descripcion" + Descripcion);
               codProducto = datain.readInt();
           }
           datain.close();
       }catch (Exception ex){
       }
   } 
   

   public String  buscar(String bNombre) throws IOException {
      String cadena ="";
       try {
            File fichero = new File ("C:\\pruebas\\productos.txt");
            FileInputStream filebuscar = new FileInputStream(fichero);
            DataInputStream pbuscar = new DataInputStream(filebuscar);
            Nombre = pbuscar.readUTF();
            while(Nombre !=null){
                if(Nombre.equals(bNombre)){
                   codProducto = pbuscar.readInt(); 
                   Nombre = pbuscar.readUTF();
                   Cantidad = pbuscar.readInt();
                   Descripcion = pbuscar.readUTF();
                   System.out.println("codProducto: " + codProducto + "Nombre" + Nombre + "Cantidad" + Cantidad + "Descripcion" + Descripcion);
                   cadena=cadena + System.lineSeparator() + codProducto + Nombre + Cantidad + Descripcion;
                }
            }
            pbuscar.close();
        }
        catch (Exception ex){    
        }
       return cadena;
    }
}
       
                  
   




           
       
       
           
       
    
 
    

