
package ejercicioyoutube;


public class clase1 {
    String nombre; 
    long cedula; 
    String email; 

    public clase1(String nombre, long cedula, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
    }
    
    @Override
    public String toString(){
        
        return"cedula: \n"+this. cedula+"\nNombre: \n"+this.nombre+"\nEmail: \n"+this.email;
    }
    
    
}
