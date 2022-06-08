
package soneto;

import static soneto.Estado.nombreEstado;


public class S10 extends Estado {
     public S10() {
        nombreEstado="S10";
    }
    @Override
    public void d(){
        nombreEstado="S11";
    }
}
