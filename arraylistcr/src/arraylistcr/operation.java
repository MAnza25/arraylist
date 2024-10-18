
package arraylistcr;


public class operation {
   
    long identification_card=0;
    String name="";
    String type_sex="";
    long cell_phone=0;
    
    public operation(){
        super();
    }
    
     public operation(long identification_card,String name, String type_sex, long cell_phone ) {
          this.identification_card = identification_card;
          this.name  = name;
          this.type_sex = type_sex;
          this.cell_phone = cell_phone;
     }
     public operation(long identification_card){
         this.identification_card = identification_card;
     }
     


    @Override
    public String toString() {
        return "operation{" + "identification_card=" + this.identification_card + ", name=" + this.name + ", type_sex=" + this.type_sex + ", cell_phone=" + this.cell_phone + '}';
    }

   
   
    
    
}
