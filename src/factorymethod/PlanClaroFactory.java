
package factorymethod;


public class PlanClaroFactory {
    
    public PlanClaro getPaquete(int tipoPaquete){
        if (tipoPaquete == 2000) {
            return new Paquete2000();
        }
        if (tipoPaquete == 3000) {
            return new Paquete3000();
        }
        if (tipoPaquete == 5000) {
            return new Paquete5000();
        }
        return null;
    }
    
}
