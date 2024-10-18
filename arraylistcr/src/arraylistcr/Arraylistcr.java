
package arraylistcr;

import java.util.ArrayList;
import java.util.Scanner;


public class Arraylistcr {

    public void menu(){
        Scanner tec = new Scanner(System.in);
        int op,r1;
        long identification_card=0;
        long cell_phone;
        String type_sex,last_name;
        boolean r;
        ArrayList<operation> arraylist = new  ArrayList<operation>();
        do{
        System.out.println("**************************");
        System.out.println("1. Add data");
        System.out.println("2. Show");
        System.out.println("3. Close");
        op = tec.nextInt();
        switch(op){
            case 1: 
                 do{
                 try{
                    r1=0;
                    System.out.println("Type Identification card: ");
                    identification_card =  tec.nextInt();
               
                 }catch(Exception InputMismatchException){
                    System.out.println("*********************");
                    System.out.println("Wrong type Identification card");
                    System.out.println("*********************");
                    r1=1;
                    tec.nextLine();
                 }
                 }while(r1==1);  
               
               
                System.out.println("Type Lastname" );
                last_name = tec.nextLine();
                
                do{
                System.out.println("Type Sex: M,F,O" );
                type_sex = tec.nextLine().toUpperCase();
                if(type_sex.equals("M") || type_sex.equals("F") || type_sex.equals("O")){
                  r=false;
                }else{
                    System.out.println("*********************");
                    System.out.println("Wrong type Sex");
                    System.out.println("*********************");
                  r= true;
                }       
                }while(r);
               
                System.out.println("Type number cellphone: ");
                cell_phone = tec.nextLong();
                operation meth = new operation(identification_card,last_name, type_sex, cell_phone);
                arraylist.add(meth);             
                       
                break;
                
            case 2: 
                int i=1;
                for(operation obj : arraylist){
                    System.out.println("Person number: "+i);
                    System.out.println(""+obj.identification_card);
                    System.out.println(""+obj.name);
                    System.out.println(""+obj.type_sex);
                    System.out.println(""+obj.cell_phone);
                    i++;
                };break;

            case 3:
                System.out.println("Bye Best Friend");
                
        }
        }while(op!=3);
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Arraylistcr method=new Arraylistcr();
        method.menu();
        
        
    }    
    
    
    
}
