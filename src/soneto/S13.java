
package soneto;

import static soneto.Estado.nombreEstado;

public class S13 extends Estado {
      public S13() {
        nombreEstado="S13";
    }
    @Override
    public void c(){
        nombreEstado="S14";
    }
}
