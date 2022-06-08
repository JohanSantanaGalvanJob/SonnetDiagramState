
package soneto;

import static soneto.Estado.nombreEstado;

public class S6 extends Estado {
     public S6() {
        nombreEstado="S6";
    }
    @Override
    public void b(){
        nombreEstado="S7";
    }
}
