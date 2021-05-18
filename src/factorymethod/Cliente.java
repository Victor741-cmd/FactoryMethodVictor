
package factorymethod;


public class Cliente {
    
    public static void main(String[] args){
        int tipoPaquete=3000;
        
        PlanClaro paquete=new PlanClaroFactory().getPaquete(tipoPaquete);
        
        paquete.setTelefono("3112305478");
        String telefono=paquete.getTelefono();
        System.out.print("Su numero " + telefono + " tiene: ");
        paquete.descripcionPaquete();
    }
    
}
