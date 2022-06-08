
package soneto;

import static soneto.Estado.nombreEstado;


public class S15 extends Estado {
    public S15() {
        nombreEstado="S15";
    }
    @Override
    public void c(){
        nombreEstado="S16";
    }
}
