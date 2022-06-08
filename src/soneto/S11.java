
package soneto;

import static soneto.Estado.nombreEstado;

public class S11 extends Estado {
     public S11() {
        nombreEstado="S11";
    }
    @Override
    public void e(){
        nombreEstado="S15";
    }
    
    @Override
    public void c(){
        nombreEstado="S12";
    }
}
