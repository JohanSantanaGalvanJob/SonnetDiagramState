
package soneto;

import static soneto.Estado.nombreEstado;

public class S9 extends Estado {
     public S9() {
        nombreEstado="S9";
    }
    @Override
    public void c(){
        nombreEstado="S10";
    }
}
