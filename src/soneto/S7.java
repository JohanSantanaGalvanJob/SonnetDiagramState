
package soneto;

import static soneto.Estado.nombreEstado;

public class S7 extends Estado{
     public S7() {
        nombreEstado="S7";
    }
    @Override
    public void b(){
        nombreEstado="S8";
    }
}
