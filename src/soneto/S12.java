
package soneto;

import static soneto.Estado.nombreEstado;


public class S12 extends Estado {
      public S12() {
        nombreEstado="S12";
    }
    @Override
    public void d(){
        nombreEstado="S13";
    }
}
