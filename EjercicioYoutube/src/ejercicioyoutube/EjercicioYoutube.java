
package ejercicioyoutube;

import java.util.ArrayList;
import java.util.Scanner;


public class EjercicioYoutube {
    
    public void menu(){
        Scanner lec=new Scanner(System.in); 
        int op=0, v1=0, per=0; 
        String nombre = null; 
        long cedula = 0; 
        String email = null;
        ArrayList<clase1> arraicito=new ArrayList<>(); 
         
        
        while(op<3){
            System.out.println("----MENU----\n"
                    + "1.Agregar persona.\n"
                    + "2.Revisar personas.\n"
                    + "3.Salir.");
            System.out.println("Dijite una opcion: ");
            op=lec.nextInt(); 
            switch(op){
                case 1: 
                    v1=1;
                    if(v1==1){
                        System.out.println("Cuantas peronas desea agregar:\n");
                        per=lec.nextInt(); 
                        for (int i = 0; i < per; i++) {
                          
                        nombre=lec.nextLine();
                        System.out.println("Digite su nombre: \n");
                        nombre=lec.nextLine();
                        System.out.println("Digite su cedula: \n");
                        cedula=lec.nextLong();
                        email=lec.nextLine();
                        System.out.println("Digite su email: \n");
                        email=lec.nextLine();
                        clase1 met=new clase1(nombre,cedula, email);
                        arraicito.add(met);
                        }
                    }
                    break; 
                case 2:
                    if(v1==1){
                       for(clase1 obj2:arraicito){
                           System.out.println("Nombre:\n"+obj2.nombre+"\n"
                                   + "Cedula: \n"+obj2.cedula+"\n"
                                   + "Email:\n"+obj2.email);
                           
                       } 
                    }else{
                        System.out.println("No hay personas registradas.\n");
                    }
                    break; 
                case 3: 
                  
                        System.out.println("Cerrando...");
                    
                    break; 
                
            }
            
        }
    }

    
    public static void main(String[] args) {
        
        EjercicioYoutube obj1=new EjercicioYoutube();
        obj1.menu();
       
        
        
         
       
    }
    
}
