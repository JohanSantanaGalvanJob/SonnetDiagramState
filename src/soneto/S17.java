
package soneto;

import static soneto.Estado.nombreEstado;

public class S17 extends Estado {
   public S17() {
        nombreEstado="S17";
    }
    @Override
    public void e(){
        nombreEstado="SONETO";
    } 
}
