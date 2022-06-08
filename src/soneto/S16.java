
package soneto;

import static soneto.Estado.nombreEstado;

public class S16 extends Estado {
    public S16() {
        nombreEstado="S16";
    }
    @Override
    public void d(){
        nombreEstado="S17";
    }
}
