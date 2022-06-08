
package soneto;

import static soneto.Estado.nombreEstado;

public class S8 extends Estado {
     public S8() {
        nombreEstado="S8";
    }
    @Override
    public void a(){
        nombreEstado="S9";
        System.out.println("CUARTETO");
    }
}
