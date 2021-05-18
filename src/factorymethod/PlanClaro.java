
package factorymethod;


public abstract class PlanClaro {
       private String telefono;
       
       public String getTelefono(){
           return telefono;
       }
       
       public void setTelefono(String telefono){
           this.telefono = telefono;
       }
       
       public abstract void descripcionPaquete();
}
